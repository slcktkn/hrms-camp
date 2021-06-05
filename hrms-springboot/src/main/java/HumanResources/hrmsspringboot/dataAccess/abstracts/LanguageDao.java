package HumanResources.hrmsspringboot.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HumanResources.hrmsspringboot.entities.concretes.Language;

public interface LanguageDao extends JpaRepository<Language, Integer> {
	

}
