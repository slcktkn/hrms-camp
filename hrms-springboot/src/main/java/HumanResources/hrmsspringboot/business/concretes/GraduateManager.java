package HumanResources.hrmsspringboot.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HumanResources.hrmsspringboot.business.abstracts.GraduateService;
import HumanResources.hrmsspringboot.core.utilities.results.DataResult;
import HumanResources.hrmsspringboot.core.utilities.results.Result;
import HumanResources.hrmsspringboot.core.utilities.results.SuccessDataResult;
import HumanResources.hrmsspringboot.core.utilities.results.SuccessResult;
import HumanResources.hrmsspringboot.dataAccess.abstracts.GraduateDao;
import HumanResources.hrmsspringboot.entities.concretes.Graduate;

@Service
public class GraduateManager implements GraduateService {

	private GraduateDao graduateDao;

	@Autowired
	public GraduateManager(GraduateDao graduateDao) {
		super();
		this.graduateDao = graduateDao;
	}

	@Override
	public Result add(Graduate graduate) {
		graduateDao.save(graduate);
		return new SuccessResult("Başarıyla eklendi");
	}

	@Override
	public DataResult<List<Graduate>> getAll() {

		return new SuccessDataResult<List<Graduate>>(graduateDao.findAll(), "Tüm liste getirildi");
	}

}
