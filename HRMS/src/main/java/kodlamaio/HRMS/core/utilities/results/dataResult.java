package kodlamaio.HRMS.core.utilities.results;



public class dataResult<T> extends Result {
	private T data;
	public dataResult(T data ,boolean success, String message) {
		super(success, message);
		this.data=data;
	}
	public dataResult(T data ,boolean success) {
		super(success);
		this.data=data;
	}
	public T getdata() {
		return this.data;
	}
	
	

}