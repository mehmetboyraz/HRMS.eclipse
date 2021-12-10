package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.CitiesService;
import kodlamaio.HRMS.core.utilities.results.Result;
import kodlamaio.HRMS.core.utilities.results.dataResult;
import kodlamaio.HRMS.core.utilities.results.successDataResult;
import kodlamaio.HRMS.core.utilities.results.successResult;
import kodlamaio.HRMS.dataAccess.abstracts.CitiesDao;
import kodlamaio.HRMS.entities.concretes.Cities;
@Service
public class CitiesManager implements CitiesService {
	
	private CitiesDao citiesDao;
	@Autowired
	public CitiesManager(CitiesDao citiesDao) {
		this.citiesDao = citiesDao;
	}

	@Override
	public dataResult<List<Cities>> getAll() {
		return new successDataResult<List<Cities>>
		(this.citiesDao.findAll(),"eklendi") ;
	}

	@Override
	public Result add(Cities cities) {
		this.citiesDao.save(cities);
		return new successResult("sehır eklendi");
	}

}
