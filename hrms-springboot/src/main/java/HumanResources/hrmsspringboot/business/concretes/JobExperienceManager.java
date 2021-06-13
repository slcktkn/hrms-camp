package HumanResources.hrmsspringboot.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HumanResources.hrmsspringboot.business.abstracts.JobExperienceService;
import HumanResources.hrmsspringboot.core.utilities.business.BusinessRules;
import HumanResources.hrmsspringboot.core.utilities.dtoConverter.abstracts.DtoConverterService;
import HumanResources.hrmsspringboot.core.utilities.results.DataResult;
import HumanResources.hrmsspringboot.core.utilities.results.ErrorResult;
import HumanResources.hrmsspringboot.core.utilities.results.Result;
import HumanResources.hrmsspringboot.core.utilities.results.SuccessDataResult;
import HumanResources.hrmsspringboot.core.utilities.results.SuccessResult;
import HumanResources.hrmsspringboot.dataAccess.abstracts.JobExperienceDao;
import HumanResources.hrmsspringboot.entities.concretes.JobExperience;
import HumanResources.hrmsspringboot.entities.dtos.JobExperienceDto;

@Service
public class JobExperienceManager implements JobExperienceService {

	@Autowired
	private DtoConverterService dtoConverterService;
	@Autowired
	private JobExperienceDao jobExperienceDao;

	@Override
	public DataResult<List<JobExperienceDto>> getAll() {
		return new SuccessDataResult<List<JobExperienceDto>>(
				dtoConverterService.dtoConverter(jobExperienceDao.findAll(), JobExperienceDto.class),
				"jobExperiences listed successfully");
	}

	@Override
	public Result add(JobExperienceDto jobExperienceDto) {
		jobExperienceDao
				.save((JobExperience) dtoConverterService.dtoClassConverter(jobExperienceDto, JobExperience.class));
		if (!BusinessRules.checkDate(jobExperienceDto.getStartedDate(), jobExperienceDto.getEndedDate())) {
			return new ErrorResult("başlangıç tarihi bitişten çok olamaz");
		}
		return new SuccessResult("jobExperience successfully added");

	}

	@Override
	public DataResult<List<JobExperienceDto>> findAllByResumeIdOrderByEndedDateDesc(int id) {
		List<JobExperience> jobExperiences = jobExperienceDao.findAllByResumeIdOrderByEndedDateDesc(id);
		return new SuccessDataResult<List<JobExperienceDto>>(
				dtoConverterService.dtoConverter(jobExperiences, JobExperienceDto.class),
				"jobExperiences listed start date desc successfully");
	}

}
