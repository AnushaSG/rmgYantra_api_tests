package com.rmgyantra.genericlib;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import static io.restassured.RestAssured.*;

import java.sql.SQLException;

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

	@AfterSuite
	public void afterSuite() throws SQLException {
	}
}
