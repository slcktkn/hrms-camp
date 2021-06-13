package HumanResources.hrmsspringboot.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HumanResources.hrmsspringboot.business.abstracts.SystemPersonService;
import HumanResources.hrmsspringboot.core.utilities.results.DataResult;
import HumanResources.hrmsspringboot.core.utilities.results.SuccessDataResult;
import HumanResources.hrmsspringboot.dataAccess.abstracts.SystemPersonDao;
import HumanResources.hrmsspringboot.entities.concretes.SystemPerson;

@Service
public class SystemPersonManager implements SystemPersonService {

	private SystemPersonDao systemPersonDao;

	@Autowired
	public SystemPersonManager(SystemPersonDao systemPersonDao) {
		super();
		this.systemPersonDao = systemPersonDao;
	}

	@Override
	public DataResult<List<SystemPerson>> getAll() {
		return new SuccessDataResult<List<SystemPerson>>(systemPersonDao.findAll(), "Data getirildi");

	}
}
