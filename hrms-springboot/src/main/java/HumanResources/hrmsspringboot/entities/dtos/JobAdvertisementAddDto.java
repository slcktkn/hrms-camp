package HumanResources.hrmsspringboot.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisementAddDto {
	
	private String employerCompanyName;
	
	private String jobPositionJobDescription;
	
	private Double minSalary;
	
	private Double maxSalary;

}
