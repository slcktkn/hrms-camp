package HumanResources.hrmsspringboot.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HumanResources.hrmsspringboot.business.abstracts.LanguageService;
import HumanResources.hrmsspringboot.core.utilities.dtoConverter.abstracts.DtoConverterService;
import HumanResources.hrmsspringboot.core.utilities.results.DataResult;
import HumanResources.hrmsspringboot.core.utilities.results.Result;
import HumanResources.hrmsspringboot.core.utilities.results.SuccessDataResult;
import HumanResources.hrmsspringboot.core.utilities.results.SuccessResult;
import HumanResources.hrmsspringboot.dataAccess.abstracts.LanguageDao;
import HumanResources.hrmsspringboot.entities.concretes.Language;
import HumanResources.hrmsspringboot.entities.dtos.LanguageDto;

@Service
public class LanguageManager implements LanguageService {

	private LanguageDao languageDao;
	private DtoConverterService dtoConverterService;

	@Autowired
	public LanguageManager(LanguageDao languageDao, DtoConverterService dtoConverterService) {
		super();
		this.languageDao = languageDao;
		this.dtoConverterService = dtoConverterService;
	}

	@Override
	public Result add(LanguageDto languageDto) {

		languageDao.save((Language) dtoConverterService.dtoClassConverter(languageDto, Language.class));
		return new SuccessResult("Dil türü başarıyla eklendi");
	}

	@Override
	public DataResult<List<LanguageDto>> getAll() {
		return new SuccessDataResult<List<LanguageDto>>(
				dtoConverterService.dtoConverter(languageDao.findAll(), LanguageDto.class),
				"Dil seçenekleri listelendi");

	}
}
