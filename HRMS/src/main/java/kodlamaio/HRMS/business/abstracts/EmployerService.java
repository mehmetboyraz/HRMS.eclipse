package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.core.utilities.results.Result;
import kodlamaio.HRMS.core.utilities.results.dataResult;
import kodlamaio.HRMS.entities.concretes.Employer;

public interface EmployerService {
dataResult<List<Employer>> getAll();
Result add(Employer employer);
}
