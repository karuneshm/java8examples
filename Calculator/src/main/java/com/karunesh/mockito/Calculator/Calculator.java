package com.karunesh.mockito.Calculator;

public class Calculator {
	
	
	
	private CalculatorService service;
	
	public Calculator(CalculatorService service) {
		this.service = service;
	}
	
	public int perform(int i , int j) {
		return service.add(i, j)*i;
		//return (i+j)*2; 
	}

}
