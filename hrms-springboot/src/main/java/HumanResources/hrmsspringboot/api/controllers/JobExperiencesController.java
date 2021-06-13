package HumanResources.hrmsspringboot.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HumanResources.hrmsspringboot.business.abstracts.JobExperienceService;
import HumanResources.hrmsspringboot.core.utilities.results.DataResult;
import HumanResources.hrmsspringboot.core.utilities.results.Result;
import HumanResources.hrmsspringboot.core.utilities.results.SuccessResult;
import HumanResources.hrmsspringboot.entities.dtos.JobExperienceDto;

@RestController
@RequestMapping("/api/jobexp")
public class JobExperiencesController {

	private JobExperienceService jobExperienceService;

	public JobExperiencesController(JobExperienceService jobExperienceService) {
		super();
		this.jobExperienceService = jobExperienceService;
	}

	@GetMapping("/getall")
	public DataResult<List<JobExperienceDto>> getAll() {
		return jobExperienceService.getAll();

	}

	@PostMapping("/add")
	public Result add(@RequestBody JobExperienceDto jobExperienceDto) {
		jobExperienceService.add(jobExperienceDto);
		return new SuccessResult("");
	}

}
