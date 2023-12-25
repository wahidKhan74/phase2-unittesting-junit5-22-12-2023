package com.simplilearn.unittest;

public interface Calculator {
	
	// abstract method
	int add(int num1 , int num2);
	
	// default method
	default int multiply(int num1 , int num2) {
		return num1 * num2;
	}

}
