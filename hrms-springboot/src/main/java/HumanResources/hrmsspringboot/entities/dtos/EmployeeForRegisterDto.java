package HumanResources.hrmsspringboot.entities.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeForRegisterDto {

	private int employeeId;
	String firstName;
	String lastName;
	String nationalityId;
	int dateOfBirth;
	String email;
	String jobDescription;
	String password;
	String verifiedPassword;
}
