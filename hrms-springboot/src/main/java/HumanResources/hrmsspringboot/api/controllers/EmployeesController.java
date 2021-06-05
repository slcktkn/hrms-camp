package HumanResources.hrmsspringboot.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HumanResources.hrmsspringboot.business.abstracts.EmployeeService;
import HumanResources.hrmsspringboot.core.utilities.results.DataResult;
import HumanResources.hrmsspringboot.core.utilities.results.Result;
import HumanResources.hrmsspringboot.core.utilities.results.SuccessResult;
import HumanResources.hrmsspringboot.entities.concretes.Employee;
import HumanResources.hrmsspringboot.entities.dtos.EmployeeForRegisterDto;
import HumanResources.hrmsspringboot.entities.dtos.EmployeeWithJobPositionDto;


@RestController
@RequestMapping("/api/employees")
public class EmployeesController {

	private EmployeeService employeeService;

	@Autowired
	public EmployeesController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Employee>> GetAll() {
		
		return this.employeeService.getAll(); 
	}
	
	@GetMapping("/getEmployeeWithJobPositions")
	public DataResult<List<EmployeeWithJobPositionDto>> getEmployeeWithJobPositions() {
		
		return this.employeeService.getEmployeeWithJobPositions(); 
	}
	
	@PostMapping("/add")
	public Result add (@RequestBody Employee employee) {
		
		this.employeeService.add(employee);
		return new SuccessResult("Data eklendi");
	}
	
	@PostMapping("/register")
	public Result register (@RequestBody EmployeeForRegisterDto employee) {
		
		this.employeeService.register(employee);
		return new SuccessResult("Kullanıcı doğrulandı");
	}
}