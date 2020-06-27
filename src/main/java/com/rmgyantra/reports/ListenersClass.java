package com.rmgyantra.reports;

import org.testng.*;

import com.aventstack.extentreports.Status;
import com.rmgyantra.genericlib.GlobalVariables;

public class ListenersClass implements ITestListener {

	public void onTestStart(ITestResult result) {
		GlobalVariables.testCaseName = result.getTestClass().getName().toString();
		GlobalVariables.extenttest = GlobalVariables.extentreports.createTest(GlobalVariables.testCaseName);
	}

	public void onTestSuccess(ITestResult result) {
		GlobalVariables.extenttest.log(Status.PASS, GlobalVariables.testCaseName + " is pass");
	}

	public void onTestFailure(ITestResult result) {
		GlobalVariables.extenttest.log(Status.FAIL, GlobalVariables.testCaseName + " is fail");
	}

	public void onTestSkipped(ITestResult result) {
		GlobalVariables.extenttest.log(Status.SKIP, GlobalVariables.testCaseName + " is skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	public void onStart(ITestContext context) {
		Extent_Report_Manager.createExtentReport();
	}

	public void onFinish(ITestContext context) {
		GlobalVariables.extentreports.flush();
	}

}
