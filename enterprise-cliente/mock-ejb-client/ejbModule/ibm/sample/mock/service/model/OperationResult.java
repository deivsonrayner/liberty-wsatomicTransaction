package ibm.sample.mock.service.model;

public class OperationResult {
	
	String operationType = null;
	double operationResult = 0;
	String returnCode = null;
	
	public OperationResult() {
		// TODO Auto-generated constructor stub
	}
	
	public OperationResult( String type, double result, String returnCode) {
		this.setOperationResult(result);
		this.setOperationType(type);
		this.setReturnCode(returnCode);
	}
	
	public String getOperationType() {
		return operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}
	public double getOperationResult() {
		return operationResult;
	}
	public void setOperationResult(double operationResult) {
		this.operationResult = operationResult;
	}
	public String getReturnCode() {
		return returnCode;
	}
	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}
	
	

}
