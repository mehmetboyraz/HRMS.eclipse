package kodlamaio.HRMS.core.adapters.abstracts;

import kodlamaio.HRMS.core.utilities.results.Result;
import kodlamaio.HRMS.entities.concretes.JobSeeker;

public interface MernisCheckService {
	 Result checkIfRealPerson(JobSeeker jobSeeker) throws Exception;
}