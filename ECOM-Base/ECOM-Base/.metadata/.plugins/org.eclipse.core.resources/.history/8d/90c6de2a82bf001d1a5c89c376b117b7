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
@Table(name = "orders")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderid;

	@Column(name = "order_date", updatable = false)
	private LocalDate orderDate;

	@ManyToOne
	@JoinColumn(name = "customerId")
	private Customer customer;

	@ManyToOne
	@JoinColumn(name = "addressId")
	private Address address;

	@ManyToOne
	@JoinColumn(name = "paymentId")
	private Payment payment;
	
	@ManyToOne
	@JoinColumn(name="sellerId")
	private Seller seller;
	

}
