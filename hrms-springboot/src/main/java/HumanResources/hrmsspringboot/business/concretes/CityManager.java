package HumanResources.hrmsspringboot.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Sort;

import HumanResources.hrmsspringboot.business.abstracts.CityService;
import HumanResources.hrmsspringboot.core.utilities.results.DataResult;
import HumanResources.hrmsspringboot.core.utilities.results.Result;
import HumanResources.hrmsspringboot.core.utilities.results.SuccessDataResult;
import HumanResources.hrmsspringboot.core.utilities.results.SuccessResult;
import HumanResources.hrmsspringboot.dataAccess.abstracts.CityDao;
import HumanResources.hrmsspringboot.entities.concretes.City;

@Service
public class CityManager implements CityService {
	
	private CityDao cityDao;

	@Autowired
	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}

	@Override
	public Result add(City city) {
		cityDao.save(city);
		return new SuccessResult("Şehir başarıyla getirildi");
	}

	@Override
	public DataResult<List<City>> getAll() {
		
		return new SuccessDataResult<List<City>>
		(cityDao.findAll(), "Tüm şehirler başarıyla getirildi");

	}

	@Override
	public DataResult<List<City>> getAllSorted() {
		Sort sort = Sort.by(Sort.Direction.DESC,"cityName"); 
		return new SuccessDataResult<List<City>>
		(cityDao.findAll(sort),"Başarıyla sıralandı");
	}

}
