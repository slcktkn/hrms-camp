package HumanResources.hrmsspringboot.business.abstracts;

import java.util.List;

import HumanResources.hrmsspringboot.core.utilities.results.DataResult;
import HumanResources.hrmsspringboot.core.utilities.results.Result;
import HumanResources.hrmsspringboot.entities.concretes.JobAdvertisement;
import HumanResources.hrmsspringboot.entities.dtos.JobAdvertisementDto;
import HumanResources.hrmsspringboot.entities.dtos.JobAdvertisementGetDto;

public interface JobAdvertisementService {
	
	Result add (JobAdvertisement jobAdvertisement);
	
	DataResult<List<JobAdvertisement>> getAll();
	
	DataResult<List<JobAdvertisementDto>> findByIsActive();
	
	DataResult<List<JobAdvertisementDto>> findByIsActiveAndEmployer_CompanyName(String companyName);
	
	DataResult<List<JobAdvertisementGetDto>> findAll();

	Result add(JobAdvertisementGetDto jobAdvertisementRequestDto);


	DataResult<List<JobAdvertisementGetDto>> findAllByIdAndIsActiveTrue(int employerId);

	DataResult<JobAdvertisementGetDto> update(int id, boolean activate);

}

