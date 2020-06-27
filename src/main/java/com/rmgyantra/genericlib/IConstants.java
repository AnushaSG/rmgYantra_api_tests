package com.rmgyantra.genericlib;

/**
 * 
 * @author Anusha
 * 
 */
public interface IConstants {

	String DIR_PATH = System.getProperty("user.dir");
	String DB_PROPERTIES_FILE_PATH = DIR_PATH + "\\src\\main\\resources\\propertyFiles\\dbProperties.properties";

	String ADD_SINGLE_EMPLOYEE = "/employees";
	String GET_ALL_EMPLOYEES = "/employees";
	String GET_SINGLE_EMPLOYEE = "/employees/{id}";
	String ADD_SINGLE_PROJECT = "/addProject";
	String GET_ALL_PROJECT = "/projects";
	String GET_SINGLE_PROJECT = "/projects/{id}";

}
