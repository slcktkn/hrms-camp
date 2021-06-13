package HumanResources.hrmsspringboot.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HumanResources.hrmsspringboot.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer> {

	User findByEmail(String email);

	boolean existsByEmail(String email);

}
