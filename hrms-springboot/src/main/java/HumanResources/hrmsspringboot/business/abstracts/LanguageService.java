package HumanResources.hrmsspringboot.business.abstracts;

import java.util.List;
import HumanResources.hrmsspringboot.core.utilities.results.DataResult;
import HumanResources.hrmsspringboot.core.utilities.results.Result;
import HumanResources.hrmsspringboot.entities.dtos.LanguageDto;
import HumanResources.hrmsspringboot.entities.dtos.LanguageGetDto;

public interface LanguageService {

	Result add(LanguageDto language);

	DataResult<List<LanguageGetDto>> getAll();
}
