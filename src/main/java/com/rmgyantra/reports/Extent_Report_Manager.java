package com.rmgyantra.reports;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.*;
import com.rmgyantra.genericlib.*;

/**
 * A class to initialize the extent reports
 * @author Anusha
 *
 */
public class Extent_Report_Manager {

	/**
	 * createExtentReport method to initialize the extent reports
	 * 
	 * @param testname
	 */
	public static void createExtentReport() {
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		GlobalVariables.extenthtmlreporter = new ExtentHtmlReporter(
				new File(IConstants.DIR_PATH + "\\reports\\extent\\" + timeStamp + ".html"));
		GlobalVariables.extenthtmlreporter.config().setTestViewChartLocation(ChartLocation.BOTTOM);
		GlobalVariables.extenthtmlreporter.config().setChartVisibilityOnOpen(true);
		GlobalVariables.extenthtmlreporter.config().setTheme(Theme.STANDARD);
		GlobalVariables.extenthtmlreporter.config().setEncoding("utf-8");
		GlobalVariables.extentreports = new ExtentReports();
		GlobalVariables.extentreports.attachReporter(GlobalVariables.extenthtmlreporter);
	}
}
