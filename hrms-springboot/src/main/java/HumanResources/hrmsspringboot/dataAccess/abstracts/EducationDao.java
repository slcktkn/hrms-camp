package HumanResources.hrmsspringboot.dataAccess.abstracts;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import HumanResources.hrmsspringboot.entities.concretes.Education;

public interface EducationDao extends JpaRepository<Education, Integer> {

	List<Education> findAllByResumeIdOrderByStartedDateDesc(int id);

}
