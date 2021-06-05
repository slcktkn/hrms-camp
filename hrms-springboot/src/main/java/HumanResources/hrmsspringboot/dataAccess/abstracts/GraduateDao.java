package HumanResources.hrmsspringboot.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HumanResources.hrmsspringboot.entities.concretes.Graduate;

public interface GraduateDao extends JpaRepository<Graduate, Integer>{

	boolean existsByDescription(String description);
}
