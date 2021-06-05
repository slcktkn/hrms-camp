package HumanResources.hrmsspringboot.api.controllers;



import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HumanResources.hrmsspringboot.business.abstracts.JobAdvertisementService;
import HumanResources.hrmsspringboot.core.utilities.results.DataResult;
import HumanResources.hrmsspringboot.core.utilities.results.Result;
import HumanResources.hrmsspringboot.core.utilities.results.SuccessResult;
import HumanResources.hrmsspringboot.entities.concretes.JobAdvertisement;
import HumanResources.hrmsspringboot.entities.dtos.JobAdvertisementDto;

@RestController
@RequestMapping("/api/jobadv")
public class JobAdvertisementsController {
	
	private JobAdvertisementService jobAdvertisementService;

	public JobAdvertisementsController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobAdvertisement>> getAll(){
		return this.jobAdvertisementService.getAll();
		
	}
	
	@PostMapping("/add")
	public Result add (JobAdvertisement jobAdvertisement) {
		jobAdvertisementService.add(jobAdvertisement);
		return new SuccessResult("");
	}
	
	@GetMapping("/getActive")
	public DataResult<List<JobAdvertisementDto>> getActive(){
		
		return jobAdvertisementService.findByIsActive();
	}

}
