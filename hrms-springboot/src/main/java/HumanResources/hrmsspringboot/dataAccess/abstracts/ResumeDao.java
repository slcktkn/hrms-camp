package HumanResources.hrmsspringboot.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HumanResources.hrmsspringboot.entities.concretes.Resume;

public interface ResumeDao extends JpaRepository<Resume, Integer> {

	// public List<ResumeGetDto> getAllByEmployeeId(int employeeId);

}
