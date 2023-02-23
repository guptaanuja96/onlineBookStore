package com.app.store.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/*
 * 2. Category : id,  categoryName ,description +
private List<Product> products=new ArrayList<>();//as per Gavin King's suggestion : DO NOT keep collection based null
 */
@Entity
@Table(name="categories")
public class Genre extends BaseEntity {
	@Column(name="genre_name",length = 30,unique = true)
	private String genreName;
	@Column(length = 300)
	private String description;
	// one to many : bi dir Category 1--->* Product
	//Category -- one , parent , inverse(since no FK mapping)
	@OneToMany(mappedBy = "genre",
			cascade = CascadeType.ALL, orphanRemoval = true/* ,fetch = FetchType.EAGER */)
	private List<Book> books = new ArrayList<>();// init to empty list

	public Genre() {
		// TODO Auto-generated constructor stub
	}

	public Genre(String genreName, String description) {
		super();
		this.genreName = genreName;
		this.description = description;
	}

	public String getGenreName() {
		return genreName;
	}

	public void setGenreName(String genreName) {
		this.genreName = genreName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	// Founder's suggestion : NEVER add asso properties toString --o.w may cause
	// recursion!

	@Override
	public String toString() {
		return "Category ID " + getId() + " [categoryName=" + genreName + ", description=" + description + "]";
	}
	//add a method(convenience/helper) to establish a bi dir asso. between entities
	public void addBook(Book b)
	{
		//parent --> child
		books.add(b);
		//child --> parent
		b.setGenre(this);
	}
	//add a method(convenience/helper) to remove a bi dir asso. between entities
		public void removeBook(Book b)
		{
			//parent ----X---> child
			books.remove(b);
			//child ----X----> parent
			b.setGenre(null);
			
			
		}

}
