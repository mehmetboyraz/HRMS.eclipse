package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.core.utilities.results.Result;
import kodlamaio.HRMS.core.utilities.results.dataResult;
import kodlamaio.HRMS.entities.concretes.JobNames;

public interface JobNamesService {
	dataResult<List<JobNames>> getAll();
	Result add(JobNames jobNames);
}
