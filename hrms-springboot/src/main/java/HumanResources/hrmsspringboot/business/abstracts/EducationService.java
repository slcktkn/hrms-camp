package HumanResources.hrmsspringboot.business.abstracts;

import java.util.List;

import HumanResources.hrmsspringboot.core.utilities.results.DataResult;
import HumanResources.hrmsspringboot.core.utilities.results.Result;
import HumanResources.hrmsspringboot.entities.concretes.Education;
import HumanResources.hrmsspringboot.entities.dtos.EducationDto;

public interface EducationService {

	Result add(Education education);

	DataResult<List<Education>> getAll();

	DataResult<List<EducationDto>> findAllByResumeIdOrderByStartedDateDesc(int id);

	DataResult<List<EducationDto>> findAll();

	Result add(EducationDto educationDto);

}
