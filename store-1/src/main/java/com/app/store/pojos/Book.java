package com.app.store.pojos;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/*
 * Product Entity : id, name,price,desc,inStock +
private Category productCategory;

 */
@Entity
@Table(name = "books")
public class Book extends BaseEntity {
	@Column(name = "product_name", length = 30, unique = true)
	private String bookName;
	private double price;
	private String description;
	@Column(name = "in_stock")
	private boolean inStock;
	private int quantity;
	// many to one Product *-----> 1Category
	@ManyToOne
	@JoinColumn(name = "cart_id")
	private ShoppingCart cart;
	//Product 1----->1 CartItem

	@ManyToOne
	@JoinColumn(name="genre_id")
	private Genre genre;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String bookName, double price, String description) {
		super();
		this.bookName = bookName;
		this.price = price;
		this.description = description;
		this.inStock = true;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isInStock() {
		return inStock;
	}

	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}

	
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public ShoppingCart getCart() {
		return cart;
	}

	public void setCart(ShoppingCart cart) {
		this.cart = cart;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Product ID " + getId() + " [bookName=" + bookName + ", price=" + price + ", description="
				+ description + ", inStock=" + inStock + "]";
	}

	
	
}
