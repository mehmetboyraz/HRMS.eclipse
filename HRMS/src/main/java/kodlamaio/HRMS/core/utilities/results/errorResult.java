package kodlamaio.HRMS.core.utilities.results;


public class errorResult extends Result	 {
	 public errorResult() {
		 super(false);
	 }
	 public errorResult(String message) {
		 super(false,message);
	 }
}