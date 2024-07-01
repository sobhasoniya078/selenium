package com.ust.advantageshopping
;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class NewClass implements ITestListener{

	public void onTestSucccess(ITestResult result) {
		System.out.println("Success");
	}
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("failure");
	}
	public void onTestSkipped() {
		System.out.println("skipped");
	}
	
}
