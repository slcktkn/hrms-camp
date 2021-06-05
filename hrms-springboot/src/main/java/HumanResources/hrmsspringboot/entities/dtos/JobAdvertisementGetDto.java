package HumanResources.hrmsspringboot.entities.dtos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobAdvertisementGetDto {
	
	private String cityName;
	private String jobPositionDescription;
	private Date createdDate;
	private String employerCompanyName;
	private String jobDescription;
	private int minimumSalary;
	private int maximumSalary;
	private boolean isActive;

}
