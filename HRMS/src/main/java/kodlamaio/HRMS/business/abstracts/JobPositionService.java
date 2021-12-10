package kodlamaio.HRMS.business.abstracts;

import java.util.List;


import kodlamaio.HRMS.core.utilities.results.Result;
import kodlamaio.HRMS.core.utilities.results.dataResult;
import kodlamaio.HRMS.entities.concretes.JobPosition;

public interface JobPositionService {
dataResult<List<JobPosition>> getAll();
Result add(JobPosition jobposition);

dataResult<JobPosition> getByCompanyName(String companyName );

dataResult<JobPosition> getByCompanyNameAndJobNames(String companyName , int job_names_id);

dataResult<List<JobPosition>> getByIsActıve(boolean isActıve);

dataResult<List<JobPosition>> getByCompanyNameOrJobNames(String companyName , int job_names_id);

dataResult<List<JobPosition>> getByOrderByDeadlineAsc();

dataResult<List<JobPosition>> getByOrderByDeadlineDesc();

}
