package ecommerce.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ApiModelProperty(notes = "Database generated Customer Id")
	private int id;
	
	@ApiModelProperty(notes = "Name of the customer")
	private String name;
	
	private String city;
	
	private String userid;
	
	private String pwd;
	
	private String phone;
	
	private String gender;
	
	@Column(name = "created_timestamp", updatable = false)
	private LocalDate createdTimestamp = LocalDate.now();

}
