package HumanResources.hrmsspringboot.business.abstracts;

import java.util.List;

import HumanResources.hrmsspringboot.core.utilities.results.DataResult;
import HumanResources.hrmsspringboot.core.utilities.results.Result;
import HumanResources.hrmsspringboot.entities.dtos.JobExperienceDto;

public interface JobExperienceService {

	DataResult<List<JobExperienceDto>> getAll();

	Result add(JobExperienceDto jobExperienceDto);

	DataResult<List<JobExperienceDto>> findAllByResumeIdOrderByEndedDateDesc(int id);
}
