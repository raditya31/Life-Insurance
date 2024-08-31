package com.cybage.genworth.insurance.Exception;

public class LifeInsuranceException extends RuntimeException{
private static final long serialVersionUID = 1L;
	
	private String errorMessage;

	public LifeInsuranceException(String errorMessage) {
		super(); //calling constructor Parent RunTime
		this.errorMessage = errorMessage;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
