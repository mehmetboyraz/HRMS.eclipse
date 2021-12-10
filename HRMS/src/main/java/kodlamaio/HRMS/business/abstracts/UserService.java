package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.core.utilities.results.Result;
import kodlamaio.HRMS.core.utilities.results.dataResult;
import kodlamaio.HRMS.entities.concretes.User;

public interface UserService {
	dataResult<List<User>> getAll();
	Result add(User user);
}