package HumanResources.hrmsspringboot.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HumanResources.hrmsspringboot.business.abstracts.LanguageService;
import HumanResources.hrmsspringboot.core.utilities.results.DataResult;
import HumanResources.hrmsspringboot.core.utilities.results.Result;
import HumanResources.hrmsspringboot.entities.dtos.LanguageDto;

@RestController
@RequestMapping("api/languages")
public class LanguagesController {

	private LanguageService languageService;

	public LanguagesController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}

	@GetMapping("/getall")
	public DataResult<List<LanguageDto>> getAll() {
		return languageService.getAll();
	}

	@PostMapping("/add")
	public Result add(@RequestBody LanguageDto languageDto) {

		return languageService.add(languageDto);
	}

}
