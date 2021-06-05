package HumanResources.hrmsspringboot.api.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import HumanResources.hrmsspringboot.business.abstracts.EducationService;
import HumanResources.hrmsspringboot.core.utilities.results.DataResult;
import HumanResources.hrmsspringboot.entities.dtos.EducationDto;

@RestController
@RequestMapping("/api/educations")
public class EducationsController {

	private EducationService educationService;
	
	@Autowired
	public EducationsController(EducationService educationService) {
		super();
		this.educationService = educationService;
	}

	@PostMapping("/add")
	public ResponseEntity<?> add(@Valid @RequestBody EducationDto educationDto) {
		return ResponseEntity.ok(educationService.add(educationDto));
	}

	@GetMapping("/orderByStartedDateDesc")
	public DataResult<List<EducationDto>> findAllByResumeIdOrderByStartedDateDesc(@RequestParam int id) {
		return this.educationService.findAllByResumeIdOrderByStartedDateDesc(id);
	}
	
	

}
