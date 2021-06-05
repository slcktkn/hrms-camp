package HumanResources.hrmsspringboot.business.abstracts;

import java.util.List;
import HumanResources.hrmsspringboot.core.utilities.results.DataResult;
import HumanResources.hrmsspringboot.core.utilities.results.Result;
import HumanResources.hrmsspringboot.entities.concretes.Language;

public interface LanguageService {

	Result add(Language language);

	DataResult<List<Language>> getAll();
}
