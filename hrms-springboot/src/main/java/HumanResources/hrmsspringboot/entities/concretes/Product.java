package HumanResources.hrmsspringboot.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="products")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "unit_price")
	private double unitPrice;
	
	@Column(name = "unit_price1")
	private double unitPrice1;
	
	
	@JsonProperty(access = Access.WRITE_ONLY)
	@ManyToOne(targetEntity = Category.class)
	@JoinColumn(name="category_id")
	private Category category;
	
	
	
	
}
