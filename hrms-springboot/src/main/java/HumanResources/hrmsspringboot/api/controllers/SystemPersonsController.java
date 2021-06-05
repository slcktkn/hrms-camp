package HumanResources.hrmsspringboot.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HumanResources.hrmsspringboot.business.abstracts.SystemPersonService;
import HumanResources.hrmsspringboot.core.utilities.results.DataResult;
import HumanResources.hrmsspringboot.entities.concretes.SystemPerson;

@RestController
@RequestMapping("api/syspersons")
public class SystemPersonsController {

	private SystemPersonService systemPersonService;

	public SystemPersonsController(SystemPersonService systemPersonService) {
		super();
		this.systemPersonService = systemPersonService;
	}

	@GetMapping("/getall")
	public DataResult<List<SystemPerson>> getAll() {
		return systemPersonService.getAll();
	}

}
