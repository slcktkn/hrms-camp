package HumanResources.hrmsspringboot.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import HumanResources.hrmsspringboot.entities.concretes.JobAdvertisement;
import HumanResources.hrmsspringboot.entities.dtos.JobAdvertisementGetDto;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer>{
		
		List<JobAdvertisementGetDto> findByIsActive(boolean status);
		
		List<JobAdvertisementGetDto> findByIsActiveAndEmployer_CompanyName(boolean status, String companyName);
		
		List<JobAdvertisementGetDto> findAllByIdAndIsActiveTrue(int employerId);
}
