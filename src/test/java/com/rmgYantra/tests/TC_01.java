package com.rmgYantra.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.rmgyantra.genericlib.BaseLib;
import com.rmgyantra.genericlib.DataBaseUtilities;
import com.rmgyantra.genericlib.IConstants;
import com.rmgyantra.pojos.Employee;
import com.rmgyantra.reports.ListenersClass;
import com.rmgyantra.util.JsonUtil;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.Map;

@Listeners(ListenersClass.class)
public class TC_01 extends BaseLib {

	String empid;

	@Test
	public void createEmployee() {
		Employee emp = new Employee("Naman", "8907654756", "naman@gmail.com", "16/05/1995", 3.6, "Naman46",
				"Software Developer", "ADMIN", "Just Dial");

		Response response = given().contentType(ContentType.JSON).and().body(emp).when()
				.post(IConstants.ADD_SINGLE_EMPLOYEE);

		empid = JsonUtil.getJsonString(response, "employeeId");
		response.then().assertThat().statusCode(201).and().contentType(ContentType.JSON);
	}

	@Test
	public void getSingleEmployee() {
		Response response = given().pathParam("id", empid).when().get(IConstants.GET_SINGLE_EMPLOYEE);
		Employee actualEmp = response.as(Employee.class);
		
		Map<String, String> expectedData = DataBaseUtilities
				.getDataFromDatabase("SELECT * FROM employee WHERE emp_id='" + empid + "'");
		response.then().assertThat().statusCode(200).and().contentType(ContentType.JSON);
		// validate empid
		Assert.assertEquals(actualEmp.getEmpId(), expectedData.get("emp_id"));

	}

}
