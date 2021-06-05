package HumanResources.hrmsspringboot.business.abstracts;

import java.util.List;

import HumanResources.hrmsspringboot.core.utilities.results.DataResult;
import HumanResources.hrmsspringboot.entities.concretes.SystemPerson;

public interface SystemPersonService {

	DataResult<List<SystemPerson>> getAll();

}
