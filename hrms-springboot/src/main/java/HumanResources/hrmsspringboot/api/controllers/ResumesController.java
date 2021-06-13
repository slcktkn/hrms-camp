package HumanResources.hrmsspringboot.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import HumanResources.hrmsspringboot.business.abstracts.ResumeService;
import HumanResources.hrmsspringboot.core.utilities.results.DataResult;
import HumanResources.hrmsspringboot.core.utilities.results.Result;
import HumanResources.hrmsspringboot.entities.dtos.ResumeAddDto;
import HumanResources.hrmsspringboot.entities.dtos.ResumeGetDto;

@RestController
@RequestMapping("/api/resumes")
public class ResumesController {

	private ResumeService resumeService;

	public ResumesController(ResumeService resumeService) {
		super();
		this.resumeService = resumeService;
	}

	@GetMapping("/getall")
	public DataResult<List<ResumeGetDto>> getAll() {
		return resumeService.getAll();

	}

	@PostMapping("/add")
	public Result add(@RequestBody ResumeAddDto resume) {
		return resumeService.add(resume);
	}

	/*
	 * @GetMapping("/getallbyemoyeeid") public DataResult<List<ResumeGetDto>>
	 * getAllByEmployeeId(int id){ return resumeService.getAllByEmployeeId(id);
	 * 
	 * }
	 */

	@PutMapping("/uploadImage")
	public Result saveImage(@RequestBody MultipartFile file, @RequestParam int resumeId) {
		return this.resumeService.saveImage(file, resumeId);

	}

}
