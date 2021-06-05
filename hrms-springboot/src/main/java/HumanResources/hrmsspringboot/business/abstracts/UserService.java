package HumanResources.hrmsspringboot.business.abstracts;

import HumanResources.hrmsspringboot.core.utilities.results.Result;
import HumanResources.hrmsspringboot.entities.concretes.User;

public interface UserService {

	Result add (User user);

	Result findByEmail(String email);
	
}
