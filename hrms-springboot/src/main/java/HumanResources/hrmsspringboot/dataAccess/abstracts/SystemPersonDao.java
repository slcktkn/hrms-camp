package HumanResources.hrmsspringboot.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HumanResources.hrmsspringboot.entities.concretes.SystemPerson;

public interface SystemPersonDao extends JpaRepository<SystemPerson, Integer> {

}
