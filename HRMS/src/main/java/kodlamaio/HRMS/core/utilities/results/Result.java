package kodlamaio.HRMS.core.utilities.results;


public class Result { //Super Type
private boolean success;
private String message;

	public Result(boolean success) {
		this.success = success;
		
	}
	public Result(boolean success , String message) {
		this.success = success;
		this.message = message;
		
	}
	public boolean isSuccess() {
		return this.success;
	}
	public String getMessage() {
		return this.message;
	}
}