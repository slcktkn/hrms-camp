package HumanResources.hrmsspringboot.business.abstracts;

import java.util.List;

import HumanResources.hrmsspringboot.core.utilities.results.DataResult;
import HumanResources.hrmsspringboot.core.utilities.results.Result;
import HumanResources.hrmsspringboot.entities.concretes.Employee;
import HumanResources.hrmsspringboot.entities.dtos.EmployeeForRegisterDto;
import HumanResources.hrmsspringboot.entities.dtos.EmployeeWithJobPositionDto;

public interface EmployeeService {
	
	DataResult<List<Employee>> getAll();

	DataResult<Employee> getById(int id);

	Result add(Employee employee);
	
	Result register (EmployeeForRegisterDto employee);
	
	DataResult<List<EmployeeWithJobPositionDto>> getEmployeeWithJobPositions();

}
