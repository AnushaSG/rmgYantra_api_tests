package com.rmgyantra.reports;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.rmgyantra.genericlib.GlobalVariables;

public class ListenersClass implements ITestListener {

	public void onTestStart(ITestResult result) {
		GlobalVariables.testCaseName = result.getTestClass().getName().toString();
		Extent_Report_Manager.createExtentReport();
		GlobalVariables.extenttest = GlobalVariables.extentreports.createTest(GlobalVariables.testCaseName);
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy-HH-mm-ss");
		String sDate = sdf.format(date);
	}

	public void onTestSuccess(ITestResult result) {
		GlobalVariables.extenttest.log(Status.PASS, GlobalVariables.testCaseName + " is pass");
		GlobalVariables.extentreports.flush();

	}

	public void onTestFailure(ITestResult result) {
		GlobalVariables.extenttest.log(Status.FAIL, GlobalVariables.testCaseName + " is fail");
		GlobalVariables.extentreports.flush();
	}

	public void onTestSkipped(ITestResult result) {
		GlobalVariables.extenttest.log(Status.SKIP, GlobalVariables.testCaseName + " is skipped");
		GlobalVariables.extentreports.flush();
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	public void onStart(ITestContext context) {
	}

	public void onFinish(ITestContext context) {
	}

}
