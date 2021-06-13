package HumanResources.hrmsspringboot.business.abstracts;

import java.util.List;

import HumanResources.hrmsspringboot.core.utilities.results.DataResult;
import HumanResources.hrmsspringboot.core.utilities.results.Result;
import HumanResources.hrmsspringboot.entities.concretes.Employee;

public interface EmployeeService {

	DataResult<List<Employee>> getAll();

	DataResult<Employee> getById(int id);

	Result add(Employee employee);

}
