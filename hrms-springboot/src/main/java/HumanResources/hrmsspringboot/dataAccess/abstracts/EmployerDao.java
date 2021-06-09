package HumanResources.hrmsspringboot.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HumanResources.hrmsspringboot.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer,Integer> {

	boolean existsByCompanyName(String companyName);

	Employer getByCompanyName(String companyName);

}
