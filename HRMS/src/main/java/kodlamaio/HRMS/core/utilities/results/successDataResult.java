package kodlamaio.HRMS.core.utilities.results;

public class successDataResult<T> extends dataResult<T> {

	public successDataResult(T data, String message) {
		super(data,true, message);
		
	}

}