package HumanResources.hrmsspringboot.business.concretes;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HumanResources.hrmsspringboot.core.utilities.results.ErrorResult;
import HumanResources.hrmsspringboot.business.abstracts.EmployeeService;
import HumanResources.hrmsspringboot.business.abstracts.UserService;
import HumanResources.hrmsspringboot.core.utilities.results.DataResult;
import HumanResources.hrmsspringboot.core.utilities.results.Result;
import HumanResources.hrmsspringboot.core.utilities.results.SuccessDataResult;
import HumanResources.hrmsspringboot.core.utilities.results.SuccessResult;
import HumanResources.hrmsspringboot.dataAccess.abstracts.EmployeeDao;
import HumanResources.hrmsspringboot.entities.concretes.Employee;
import HumanResources.hrmsspringboot.entities.concretes.User;
import HumanResources.hrmsspringboot.entities.dtos.EmployeeForRegisterDto;
import HumanResources.hrmsspringboot.entities.dtos.EmployeeWithJobPositionDto;

@Service
public class EmployeeManager implements EmployeeService {
	
	private EmployeeDao employeeDao;
	private UserService userService;
	
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao,UserService userService) {
		super();
		this.employeeDao = employeeDao;
		this.userService = userService;
	}

	@Override
	public DataResult<List<Employee>> getAll() {
		
		return new SuccessDataResult<List<Employee>>
		(this.employeeDao.findAll(),"Data listelendi");
	}

	@Override
	public DataResult<Employee> getById(int id) {
		
		return new SuccessDataResult<>(this.employeeDao.getById(id),"Data listelendi");
	}

	@Override
	public Result add(Employee employee) {
		
		this.employeeDao.save(employee);
		return new SuccessResult();
	}

	
	private Result checkIfPasswordVerified(EmployeeForRegisterDto employee) {

		if (employee.getPassword().equals(employee.getVerifiedPassword())) {

			return new SuccessResult("Password is registered");
		} else {
			return new ErrorResult("Password is invalid");
		}
	}
	
	private Result checkIfNatioanlityIdExists(EmployeeForRegisterDto employee) {

		if (employeeDao.getByNationalityId(employee.getNationalityId()) != null) {

			return new ErrorResult("NationalityId is present.Try another id ");
		}
		return null;
	}
	
	private Result checkIfAllFieldsFilled(EmployeeForRegisterDto employee) {

		if (employee.getEmail().equals("") || employee.getEmail() == null ||
				employee.getPassword().equals("")|| employee.getPassword() == null) {
			return new ErrorResult("Fill in the fields");
		}

		return null;
	}

	@Override
	public DataResult<List<EmployeeWithJobPositionDto>> getEmployeeWithJobPositions() {
		
		return new SuccessDataResult<List<EmployeeWithJobPositionDto>>
		(this.employeeDao.getEmployeeWithJobPositions(), "Detaylar getirildi");
	}

	@Override
	public Result register(EmployeeForRegisterDto employee) {
		// TODO Auto-generated method stub
		return null;
	}

}
