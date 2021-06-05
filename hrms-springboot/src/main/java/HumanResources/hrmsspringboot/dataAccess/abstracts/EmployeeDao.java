package HumanResources.hrmsspringboot.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import HumanResources.hrmsspringboot.entities.concretes.Employee;
import HumanResources.hrmsspringboot.entities.dtos.EmployeeWithJobPositionDto;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {
	
	Employee getByJobDescription(String jobDescription);
	
	Employee getByJobDescriptionAndEmail (String jobDescription, String email);
	
	//Employee getByEmailAndJobId (String email,int jobId);
	
	List<Employee> getByJobDescriptionContains(String jobDescription);

	Employee getByNationalityId(String nationalityId);
	
	@Query("Select new HumanResources.hrmsspringboot.entities.dtos.EmployeeWithJobPositionDto"
			+"(e.id, e.firstName, e.lastName, j.jobDescription)" 
			+"From JobPosition j Inner Join j.employees e")
	List<EmployeeWithJobPositionDto> getEmployeeWithJobPositions();

}
