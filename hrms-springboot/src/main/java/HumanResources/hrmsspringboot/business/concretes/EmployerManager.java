package HumanResources.hrmsspringboot.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HumanResources.hrmsspringboot.business.abstracts.EmployerService;
import HumanResources.hrmsspringboot.core.utilities.results.DataResult;
import HumanResources.hrmsspringboot.core.utilities.results.Result;
import HumanResources.hrmsspringboot.core.utilities.results.SuccessDataResult;
import HumanResources.hrmsspringboot.core.utilities.results.SuccessResult;
import HumanResources.hrmsspringboot.dataAccess.abstracts.EmployerDao;
import HumanResources.hrmsspringboot.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {

	private EmployerDao employerDao;

	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public DataResult<List<Employer>> getAll() {

		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(), "İşveren listesi getirildi");
	}

	@Override
	public DataResult<Employer> getById(int id) {

		return new SuccessDataResult<Employer>(this.employerDao.getById(id), "id numarasına göre işveren getirildi");
	}

	@Override
	public Result add(Employer employer) {

		this.employerDao.save(employer);
		return new SuccessResult("İşeren listeye eklendi");
	}

}
