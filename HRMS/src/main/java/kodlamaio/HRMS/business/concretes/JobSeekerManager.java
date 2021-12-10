package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.JobSeekerService;
import kodlamaio.HRMS.core.adapters.abstracts.MernisCheckService;
import kodlamaio.HRMS.core.utilities.results.Result;
import kodlamaio.HRMS.core.utilities.results.dataResult;
import kodlamaio.HRMS.core.utilities.results.errorResult;
import kodlamaio.HRMS.core.utilities.results.successDataResult;
import kodlamaio.HRMS.core.utilities.results.successResult;
import kodlamaio.HRMS.dataAccess.abstracts.JobSeekerDao;

import kodlamaio.HRMS.entities.concretes.JobSeeker;
@Service
public class JobSeekerManager implements JobSeekerService {
 
	private JobSeekerDao jobSeekerDao;
	private MernisCheckService mernisCheckService;
	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao, MernisCheckService mernisCheckService) {
		super();
		this.jobSeekerDao = jobSeekerDao;
		this.mernisCheckService = mernisCheckService;
	}
	@Override
	public dataResult<List<JobSeeker>> getAll() {
		return new successDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll() , "İş Arayan Listesi");
	} 
	
	@Override
	public Result add(JobSeeker jobSeeker) throws Exception {
		
		if(!mernisCheckService.checkIfRealPerson(jobSeeker).isSuccess()) {
			return new errorResult("başarısız");
		}
		this.jobSeekerDao.saveAndFlush(jobSeeker);
		return new successResult("İş Arayan Eklendi");
	}


}