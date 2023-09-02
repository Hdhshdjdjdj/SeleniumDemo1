package com.listners;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listner1 implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		String testname=result.getName();
		System.out.println(testname+ "test case started");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String testname=result.getName();
		System.out.println(testname+ "successful");
		// TODO Auto-generated method stub
	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String testname=result.getName();
		System.out.println(testname+ "failed");
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String testname=result.getName();
		System.out.println(testname+ "test case skipped");
		// TODO Auto-generated method stub
	
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
