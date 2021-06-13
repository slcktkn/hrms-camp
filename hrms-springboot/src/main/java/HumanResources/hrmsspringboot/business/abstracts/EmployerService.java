package HumanResources.hrmsspringboot.business.abstracts;

import java.util.List;

import HumanResources.hrmsspringboot.core.utilities.results.DataResult;
import HumanResources.hrmsspringboot.core.utilities.results.Result;
import HumanResources.hrmsspringboot.entities.concretes.Employer;

public interface EmployerService {

	DataResult<List<Employer>> getAll();

	DataResult<Employer> getById(int id);

	Result add(Employer employer);

}
