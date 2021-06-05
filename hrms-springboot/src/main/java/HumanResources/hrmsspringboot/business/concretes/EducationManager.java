package HumanResources.hrmsspringboot.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HumanResources.hrmsspringboot.business.abstracts.EducationService;
import HumanResources.hrmsspringboot.core.utilities.business.BusinessRules;
import HumanResources.hrmsspringboot.core.utilities.dtoConverter.abstracts.DtoConverterService;
import HumanResources.hrmsspringboot.core.utilities.results.DataResult;
import HumanResources.hrmsspringboot.core.utilities.results.ErrorResult;
import HumanResources.hrmsspringboot.core.utilities.results.Result;
import HumanResources.hrmsspringboot.core.utilities.results.SuccessDataResult;
import HumanResources.hrmsspringboot.core.utilities.results.SuccessResult;
import HumanResources.hrmsspringboot.dataAccess.abstracts.EducationDao;
import HumanResources.hrmsspringboot.entities.concretes.Education;
import HumanResources.hrmsspringboot.entities.dtos.EducationDto;

@Service
public class EducationManager implements EducationService {
	@Autowired
	private EducationDao educationDao;
	@Autowired
	private DtoConverterService dtoConverterService;
	
@Autowired
	public EducationManager(EducationDao educationDao,DtoConverterService dtoConverterService) {
		super();
		this.educationDao = educationDao;
		this.dtoConverterService = dtoConverterService;
	}

	@Override
	public Result add(Education education) {
		educationDao.save(education);
		return new SuccessResult("Başarıyla eklendi");
	}

	@Override
	public DataResult<List<Education>> getAll() {
		return new SuccessDataResult<List<Education>>(educationDao.findAll(), "Tüm okullar getirildi");
	}

	
	
	@Override
	public DataResult<List<EducationDto>> findAllByResumeIdOrderByStartedDateDesc(int id) {
		List<Education> education = educationDao.findAllByResumeIdOrderByStartedDateDesc(id);
		return new SuccessDataResult<List<EducationDto>>(
				dtoConverterService.dtoConverter(education, EducationDto.class), "education tarihe göre sıralandı");
	}

	@Override
	public DataResult<List<EducationDto>> findAll() {
	return new SuccessDataResult<List<EducationDto>>(
			dtoConverterService.dtoConverter(educationDao.findAll(), EducationDto.class), "education listed");
}
	
	

	@Override
	public Result add(EducationDto educationDto) {
		if (BusinessRules.checkDate(educationDto.getStartedDate(), educationDto.getEndedDate())) {
			this.educationDao.save((Education) dtoConverterService.dtoClassConverter(educationDto, Education.class));
			return new SuccessResult("education successfully added");
		}
		return new ErrorResult("enter the date correctly");
	}


}
