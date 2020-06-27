package com.rmgyantra.util;

import java.io.*;
import java.util.Properties;

/**
 * @author Anusha
 */
public class PropertyUtil {

	/**
	 * readData method to read the data from property file based on the specified key
	 * @param filePath
	 * @param key
	 * @return
	 */
	public static String readData(String filePath, String key) {
		Properties prop = new Properties();
		String value = "";
		try {
			prop.load(new FileInputStream(new File(filePath)));
			value = prop.getProperty(key);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}
}
