package HumanResources.hrmsspringboot.api.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HumanResources.hrmsspringboot.business.abstracts.GraduateService;
import HumanResources.hrmsspringboot.core.utilities.results.DataResult;
import HumanResources.hrmsspringboot.core.utilities.results.Result;
import HumanResources.hrmsspringboot.entities.concretes.Graduate;

@RestController
@RequestMapping("/api/graduates")
public class GraduatesController {
	
	private GraduateService graduateService;
	
	@Autowired
	public GraduatesController(GraduateService graduateService) {
		super();
		this.graduateService = graduateService;
	}

	@PostMapping("/add")
	public Result add(@Valid @RequestBody Graduate graduate) {
		return this.graduateService.add(graduate);
	}

	@GetMapping("/getall")
	public DataResult<List<Graduate>> getAll() {
		
		return this.graduateService.getAll();
	}

}
