package com.Orange.utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class ReadAndWriteProperty {

	static Properties prop = new Properties();
	static String propFile = "";
	static String propFileToStoreDate = "";

	public String readAProperty(String propertyName) throws Exception {
		prop.load(new FileInputStream(propFile));
		return prop.getProperty(propertyName);
	}
	
	public String readAProperty(String fileName, String propertyName) throws Exception {
		prop.load(new FileInputStream(fileName));
		return prop.getProperty(propertyName);
	}
	
	public void writeOnProperty(String propertyName, String value) throws Exception {
		prop.setProperty(propertyName, value);
		prop.store(new FileOutputStream(propFileToStoreDate), "");
	}

}
