package HumanResources.hrmsspringboot.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeWithJobPositionDto {
	
	private int employeeId;
	
	private String firstName;
	
	private String lastName;
	
	private String jobDescription;
	

}
