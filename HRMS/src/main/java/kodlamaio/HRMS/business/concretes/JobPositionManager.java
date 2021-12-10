package kodlamaio.HRMS.business.concretes;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.JobPositionService;
import kodlamaio.HRMS.core.utilities.results.Result;
import kodlamaio.HRMS.core.utilities.results.dataResult;
import kodlamaio.HRMS.core.utilities.results.successDataResult;
import kodlamaio.HRMS.core.utilities.results.successResult;
import kodlamaio.HRMS.dataAccess.abstracts.JobPositionDao;
import kodlamaio.HRMS.entities.concretes.JobPosition;
@Service
public class JobPositionManager implements  JobPositionService {
	private JobPositionDao jobPositionDao;
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}
	@Override
	public dataResult<List<JobPosition>> getAll() {
		
		return new successDataResult<List<JobPosition>>
		(this.jobPositionDao.findAll(), "Data listelendi");
	}
	@Override
	public Result add(JobPosition jobposition) {
	this.jobPositionDao.save(jobposition);
	return new successResult("Pozisyon eklendi");
	
	}
	@Override
	public dataResult<JobPosition> getByCompanyName(String companyName) {
		return new successDataResult<JobPosition>
		(this.jobPositionDao.getByCompanyName(companyName), "Data listelendi");
	}
	@Override
	public dataResult<JobPosition> getByCompanyNameAndJobNames(String companyName, int job_names_id) {
		return new successDataResult<JobPosition>
		(this.jobPositionDao.getByCompanyNameAndJobNames_jobNameId(companyName, job_names_id), "Data listelendi");
	}
	@Override
	public dataResult<List<JobPosition>> getByCompanyNameOrJobNames(String companyName, int job_names_id) {
		return new successDataResult<List<JobPosition>>
		(this.jobPositionDao.getByCompanyNameOrJobNames(companyName, job_names_id), "Data listelendi");
	}
	@Override
	public dataResult<List<JobPosition>> getByIsActıve(boolean isActıve) {
		
		return new successDataResult<List<JobPosition>>(this.jobPositionDao.getByIsActıve(isActıve), "İş Pozisyon Durumu") ;
	}
	@Override
	public dataResult<List<JobPosition>> getByOrderByDeadlineAsc() {
		// TODO Auto-generated method stub
		 return new successDataResult<>(this.jobPositionDao.getByOrderByDeadlineAsc(),
				 "İş ilanları tarihe göre artan sırada listelendi.");
	}
	@Override
	public dataResult<List<JobPosition>> getByOrderByDeadlineDesc() {
		// TODO Auto-generated method stub
		return new successDataResult<>(this.jobPositionDao.getByOrderByDeadlineDesc(),
				 "İş ilanları tarihe göre azalan sırada listelendi.");
	}



}