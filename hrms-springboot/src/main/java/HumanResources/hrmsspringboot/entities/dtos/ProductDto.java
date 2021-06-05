package HumanResources.hrmsspringboot.entities.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
	
	@JsonIgnore
	private int id;
	
	private int categoryId;
	
	private String productName;
	
	private String categoryName;
	
	private double unitPrice;

}
