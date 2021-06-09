package HumanResources.hrmsspringboot.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import HumanResources.hrmsspringboot.entities.concretes.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

	Employee getByJobDescription(String jobDescription);

	Employee getByJobDescriptionAndEmail(String jobDescription, String email);

	// Employee getByEmailAndJobId (String email,int jobId);

	List<Employee> getByJobDescriptionContains(String jobDescription);

	Employee getByNationalityId(String nationalityId);

}
