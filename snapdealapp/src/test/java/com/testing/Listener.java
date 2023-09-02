package com.testing;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		String testname =result.getName();
		System.out.println(testname+" test case started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String testname =result.getName();
		System.out.println(testname+" successful");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String testname =result.getName();
		System.out.println(testname+" test case failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String testname =result.getName();
		System.out.println(testname+" test case skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		String testname =result.getName();
		System.out.println(testname+" test failed but within success percentage");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		String testname =result.getName();
		System.out.println(testname+" test case failed due to timeout");
		
	}

	@Override
	public void onStart(ITestContext context) {
		String testname =context.getName();
		System.out.println(testname+" test case started");
	}

	@Override
	public void onFinish(ITestContext context) {
		String testname =context.getName();
		System.out.println(testname+" test case finished");
	}

}
