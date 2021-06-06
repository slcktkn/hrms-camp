package HumanResources.hrmsspringboot.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import HumanResources.hrmsspringboot.entities.concretes.Resume;
import HumanResources.hrmsspringboot.entities.dtos.ResumeGetDto;

public interface ResumeDao extends JpaRepository<Resume, Integer> {
	
	//public List<ResumeGetDto> getAllByEmployeeId(int employeeId);

}
