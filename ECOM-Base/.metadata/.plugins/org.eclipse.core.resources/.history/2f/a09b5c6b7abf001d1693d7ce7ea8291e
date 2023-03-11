package ecommerce.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int prodid;
	
	private String pname;
	
	private String brand;
	
	private String pcat;
	
	private String subcat;
	
	private int price;
	
	private String photo;
	
	@Setter(AccessLevel.NONE)
	@Column(name = "created_timestamp", updatable = false)
	private LocalDate createdTimestamp = LocalDate.now();
	
	@ManyToOne
	@JoinColumn(name="sellerId")
	private Seller seller;
		
}
