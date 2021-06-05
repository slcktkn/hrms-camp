package HumanResources.hrmsspringboot.business.abstracts;

import java.util.List;

import HumanResources.hrmsspringboot.core.utilities.results.DataResult;
import HumanResources.hrmsspringboot.core.utilities.results.Result;
import HumanResources.hrmsspringboot.entities.concretes.Technology;

public interface TechnologyService {
	
	Result add(Technology technology);

	DataResult<List<Technology>> getAll();

}
