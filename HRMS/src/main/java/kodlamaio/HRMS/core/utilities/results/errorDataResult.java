package kodlamaio.HRMS.core.utilities.results;

public class errorDataResult<T> extends dataResult<T>{

	public errorDataResult(T data, String message) {
		super(data, false, message);
	}

}
