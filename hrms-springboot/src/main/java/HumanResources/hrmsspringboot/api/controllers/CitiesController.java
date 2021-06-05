package HumanResources.hrmsspringboot.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HumanResources.hrmsspringboot.business.abstracts.CityService;
import HumanResources.hrmsspringboot.core.utilities.results.DataResult;
import HumanResources.hrmsspringboot.core.utilities.results.Result;
import HumanResources.hrmsspringboot.entities.concretes.City;

@RestController
@RequestMapping("/api/cities")
public class CitiesController {
	
	private CityService cityService;

	public CitiesController(CityService cityService) {
		super();
		this.cityService = cityService;
	}
	
	@PostMapping("/add")
	public Result add (@RequestBody City city) {
		return cityService.add(city);		
	}
	
	@GetMapping("/getall")
	public DataResult<List<City>> getAll() {
		return (cityService.getAll());
		
	}
	
	@PostMapping("/getAllSortedDesc")
	public DataResult<List<City>> getAllSorted(){
		
		return (cityService.getAllSorted());
	}

}
