package com.simplilearn.unittest.unitextends;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;

public class ExtentionPackageClass implements ExecutionCondition{

	private static String propertyFilePath = System.getProperty("user.dir") + "/src/test/java/test.properties";
	
	@Override
	public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context) {
		
		Properties properties = new Properties();
		
		try {
			properties.load(new FileInputStream(propertyFilePath));
		} catch (IOException e) {
			e.printStackTrace();
		}
		String environment = properties.getProperty("environment");
		if(environment.equals("development")) {
			return ConditionEvaluationResult.disabled("Test disabled on development environment.");
		}
		
		return ConditionEvaluationResult.enabled("Test enabled on QA environment.");
	}

}
