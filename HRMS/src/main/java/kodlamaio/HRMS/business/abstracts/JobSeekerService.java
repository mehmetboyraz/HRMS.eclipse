package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.core.utilities.results.Result;
import kodlamaio.HRMS.core.utilities.results.dataResult;
import kodlamaio.HRMS.entities.concretes.JobSeeker;

public interface JobSeekerService {
	dataResult<List<JobSeeker>> getAll();
	Result add(JobSeeker jobSeeker) throws Exception;
}
