package HumanResources.hrmsspringboot.business.abstracts;

import java.util.List;

import HumanResources.hrmsspringboot.core.utilities.results.DataResult;
import HumanResources.hrmsspringboot.core.utilities.results.Result;
import HumanResources.hrmsspringboot.entities.concretes.City;

public interface CityService {
	
	Result add (City city);
	
	DataResult<List<City>> getAll();
	
	DataResult<List<City>> getAllSorted();

}
