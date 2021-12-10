package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.EmployerService;
import kodlamaio.HRMS.core.utilities.results.Result;
import kodlamaio.HRMS.core.utilities.results.dataResult;
import kodlamaio.HRMS.core.utilities.results.successDataResult;
import kodlamaio.HRMS.core.utilities.results.successResult;
import kodlamaio.HRMS.dataAccess.abstracts.EmployerDao;
import kodlamaio.HRMS.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {
	private EmployerDao employerDao;
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		this.employerDao = employerDao;
	}

	@Override
	public dataResult<List<Employer>> getAll() {
		 return new successDataResult<List<Employer>>
		(this.employerDao.findAll(),"İş Arayan Listesi");
	}

	@Override
	public Result add(Employer employer) {
		this.employerDao.save(employer);
		return new successResult("eklendi");
	}

}