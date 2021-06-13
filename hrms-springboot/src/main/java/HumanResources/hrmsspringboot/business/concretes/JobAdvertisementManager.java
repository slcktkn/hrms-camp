package HumanResources.hrmsspringboot.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HumanResources.hrmsspringboot.business.abstracts.JobAdvertisementService;
import HumanResources.hrmsspringboot.core.utilities.dtoConverter.abstracts.DtoConverterService;
import HumanResources.hrmsspringboot.core.utilities.results.DataResult;
import HumanResources.hrmsspringboot.core.utilities.results.Result;
import HumanResources.hrmsspringboot.core.utilities.results.SuccessDataResult;
import HumanResources.hrmsspringboot.core.utilities.results.SuccessResult;
import HumanResources.hrmsspringboot.dataAccess.abstracts.JobAdvertisementDao;
import HumanResources.hrmsspringboot.entities.concretes.JobAdvertisement;
import HumanResources.hrmsspringboot.entities.dtos.JobAdvertisementAddDto;
import HumanResources.hrmsspringboot.entities.dtos.JobAdvertisementGetDto;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {

	private JobAdvertisementDao jobAdvertisementDao;
	private DtoConverterService dtoConverterService;

	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao, DtoConverterService dtoConverterService) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
		this.dtoConverterService = dtoConverterService;
	}

//	@Override
//	public Result add(JobAdvertisement jobAdvertisement) {
//		
//		jobAdvertisementDao.save(jobAdvertisement);
//		return new SuccessResult("Başarıyla eklendi");
//	}

	@Override
	public DataResult<List<JobAdvertisement>> getAll() {

		return new SuccessDataResult<List<JobAdvertisement>>(jobAdvertisementDao.findAll(),
				"Tüm liste başarıyla getirildi");
	}

	@Override
	public DataResult<List<JobAdvertisementGetDto>> findByIsActive() {
		List<JobAdvertisementGetDto> jobAdvertisements = jobAdvertisementDao.findByIsActive(true);
		return new SuccessDataResult<List<JobAdvertisementGetDto>>(
				dtoConverterService.dtoConverter(jobAdvertisements, JobAdvertisementGetDto.class));
	}

	@Override
	public DataResult<List<JobAdvertisementGetDto>> findByIsActiveAndEmployer_CompanyName(String companyName) {
		List<JobAdvertisementGetDto> jobAdvertisements = jobAdvertisementDao.findByIsActiveAndEmployer_CompanyName(true,
				companyName);
		return new SuccessDataResult<List<JobAdvertisementGetDto>>(
				dtoConverterService.dtoConverter(jobAdvertisements, JobAdvertisementGetDto.class));
	}

//	@Override
//	public DataResult<List<JobAdvertisementGetDto>> findAll() {
//		List<JobAdvertisementGetDto> jobAdvertisements = jobAdvertisementDao.findAll();
//		return new SuccessDataResult<List<JobAdvertisementGetDto>>(
//		dtoConverterService.dtoConverter(jobAdvertisements,JobAdvertisementGetDto.class));
//	}

//	@Override
//	public Result add(JobAdvertisementGetDto jobAdvertisementRequestDto) {
//		List<JobAdvertisementGetDto> jobAdvertisements = jobAdvertisementDao.save(jobAdvertisementRequestDto);
//		return new SuccessResult(dtoConverterService.dtoConverter(jobAdvertisements, JobAdvertisementGetDto));
//	}

	@Override
	public DataResult<List<JobAdvertisementGetDto>> findAllByIdAndIsActiveTrue(int employerId) {
		List<JobAdvertisementGetDto> jobAdvertisements = jobAdvertisementDao.findAllByIdAndIsActiveTrue(employerId);
		return new SuccessDataResult<List<JobAdvertisementGetDto>>(
				dtoConverterService.dtoConverter(jobAdvertisements, JobAdvertisementGetDto.class));
	}

	@Override
	public DataResult<JobAdvertisementGetDto> update(int id, boolean activate) {
		return null;

	}

	@Override
	public Result add(JobAdvertisementAddDto jobAdvertisementRequestDto) {
		System.out.println("add metodu calıstı");
		jobAdvertisementDao.save((JobAdvertisement) dtoConverterService.dtoClassConverter(jobAdvertisementRequestDto,
				JobAdvertisement.class));
		return new SuccessResult("İş ilanı başarıyla eklendi");
	}

	@Override
	public DataResult<List<JobAdvertisementGetDto>> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
