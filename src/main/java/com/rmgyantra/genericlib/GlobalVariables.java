package com.rmgyantra.genericlib;

import java.sql.Connection;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

/**
 * GlobalVariables where variables required for automation are defined
 * @author Anusha
 */
public class GlobalVariables {

	public static ExtentReports extentreports;
	public static ExtentTest extenttest;
	public static ExtentHtmlReporter extenthtmlreporter;
	
	public static String testCaseName;

	public static Connection con;
}
