package com.simplilearn.unittest;

public class AgeCalculator {

	// calculate age 
	public int calculateAge(int yearOfBirth) {
		int crrentYear = 2023;
		if(yearOfBirth>0 && yearOfBirth<crrentYear)
			return crrentYear - yearOfBirth ;
		else
		    return 0;
	}
	
	// calculate retirement
	public boolean isRetired(int yearOfBirth) {
		int age  = calculateAge(yearOfBirth);
		int retAge = 60;
		if(age> retAge) {
			return true;
		} else {
			return false;
		}
	}
}
