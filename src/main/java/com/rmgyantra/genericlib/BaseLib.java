package com.rmgyantra.genericlib;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;

import java.sql.Connection;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.rmgyantra.util.PropertyUtil;

/**
 * 
 * @author Anusha
 *
 */
public class BaseLib {

	/**
	 * to initialize the base URI, port
	 */
	@BeforeSuite
	public void config() {
		baseURI = "http://localhost";
		port = 8084;
		// given().auth().preemptive().basic("", "");
	}

	/**
	 * Connect to database
	 */
	@BeforeTest
	public void connect() {
		 GlobalVariables.con = DataBaseUtilities.connectToDB(PropertyUtil.readData(IConstants.DB_PROPERTIES_FILE_PATH, "dburl"),
				PropertyUtil.readData(IConstants.DB_PROPERTIES_FILE_PATH, "username"),
				PropertyUtil.readData(IConstants.DB_PROPERTIES_FILE_PATH, "password"));
	}
	
	/**
	 * close the db connections
	 */
	@AfterTest
	public void disconnect() {
		DataBaseUtilities.closeDb(GlobalVariables.con);
	}

}
