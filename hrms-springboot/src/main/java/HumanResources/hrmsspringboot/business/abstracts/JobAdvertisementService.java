package HumanResources.hrmsspringboot.business.abstracts;

import java.util.List;

import HumanResources.hrmsspringboot.core.utilities.results.DataResult;
import HumanResources.hrmsspringboot.core.utilities.results.Result;
import HumanResources.hrmsspringboot.entities.concretes.JobAdvertisement;
import HumanResources.hrmsspringboot.entities.dtos.JobAdvertisementAddDto;
import HumanResources.hrmsspringboot.entities.dtos.JobAdvertisementGetDto;

public interface JobAdvertisementService {

	
	DataResult<List<JobAdvertisement>> getAll();
	
	DataResult<List<JobAdvertisementGetDto>> findByIsActive();
	
	DataResult<List<JobAdvertisementGetDto>> findByIsActiveAndEmployer_CompanyName(String companyName);
	
	DataResult<List<JobAdvertisementGetDto>> findAll();

	Result add(JobAdvertisementAddDto jobAdvertisementRequestDto);


	DataResult<List<JobAdvertisementGetDto>> findAllByIdAndIsActiveTrue(int employerId);

	DataResult<JobAdvertisementGetDto> update(int id, boolean activate);

}

