package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.JobNamesService;
import kodlamaio.HRMS.core.utilities.results.Result;
import kodlamaio.HRMS.core.utilities.results.dataResult;
import kodlamaio.HRMS.core.utilities.results.successDataResult;
import kodlamaio.HRMS.core.utilities.results.successResult;
import kodlamaio.HRMS.dataAccess.abstracts.JobNamesDao;
import kodlamaio.HRMS.entities.concretes.JobNames;
@Service
public class JobNamesManager implements JobNamesService
{
private JobNamesDao jobNamesDao;
	@Autowired
	public JobNamesManager(JobNamesDao jobNamesDao) {
	super();
	this.jobNamesDao = jobNamesDao;
}

	@Override
	public dataResult<List<JobNames>> getAll() {
		
		return new successDataResult<List<JobNames>>
		(this.jobNamesDao.findAll(), "İş alanları listelendi");
	}

	@Override
	public Result add(JobNames jobNames) {
		this.jobNamesDao.save(jobNames);
		return new successResult("İş ALANI EKLENDİ");
	}

}
