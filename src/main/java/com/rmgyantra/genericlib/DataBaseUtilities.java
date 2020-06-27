package com.rmgyantra.genericlib;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

import com.rmgyantra.util.PropertyUtil;

/**
 * A class to perform actions on database
 * 
 * @author Anusha
 */
public class DataBaseUtilities {

	/**
	 * to connect to the database
	 * 
	 * @param dburl
	 * @param username
	 * @param password
	 * @return
	 */
	public static Connection connectToDB(String dburl, String username, String password) {
		Connection con = null;
		try {
			con = DriverManager.getConnection(dburl, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	/**
	 * getDataFromDB method to retrieve data from database as key value pairs
	 * 
	 * @param query
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 */
	public static Map<String, String> getDataFromDatabase(String query) {
		Map<String, String> headerValuePairs = new HashMap();
		try {
			ResultSet resultSet = GlobalVariables.con.createStatement().executeQuery(query);
			ResultSetMetaData rsm = resultSet.getMetaData();
			int columnsNumber = rsm.getColumnCount();
			while (resultSet.next()) {
				for (int i = 1; i <= columnsNumber; i++) {
					String columnType = rsm.getColumnTypeName(i);
					if (columnType.equals("DOUBLE")) {
						headerValuePairs.put(rsm.getColumnName(i), Double.toString(resultSet.getDouble(i)));
					} else if (columnType.equals("VARCHAR")) {
						headerValuePairs.put(rsm.getColumnName(i), resultSet.getString(i));
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return headerValuePairs;
	}

	/**
	 * close the db connection
	 * 
	 * @param con
	 * @throws SQLException
	 */
	public static void closeDb(Connection con) {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
