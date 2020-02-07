package com.kayak.utils;

public class Constants {

	public static final String LOGIN_CREDENTIALS_FILE_PATH = System.getProperty("user.dir")
									+"/src/test/resources/configs/LoginCredentials.properties";
	
	public static final String CREDENTIALS_FILE_PATH = System.getProperty("user.dir")
			+"/src/test/resources/configs/Configuration.properties";

	public static final String XL_FILE_PATH = System.getProperty("user.dir")
			+"/src/test/resources/configs/TestData.xlsx";
	
	public static final String HRMS_XL_FILE_PATH = System.getProperty("user.dir")
			+"/src/test/resources/testdata/HRMSTestData.xlsx";
	
	
	public static final String REPORT_FILE_PATH = System.getProperty("user.dir")+"/target/report/Hrms.html";
	
	public static final String OS_NAME = System.getProperty("os.name");
			
	public static final String USER_NAME = System.getProperty("user.name");
	
	public static final String SCREENSHOTS_FILEPATH = System.getProperty("user.dir")
							+"/target/screenhots/";
	
	
	//specify path to chrome & gecko driver
	public static final String CHROME_DRIVER_PATH = System.getProperty("user.dir")
									+"/src/test/resources/drivers/chromedriver"; 
	//System.getProperty("user.dir") --> this returns the path of project
	
	public static final String GECKO_DRIVER_PATH = System.getProperty("user.dir")
								+"/src/test/reources/drivers/geckodriver";
	
	public static final int PAGE_LOAD_TIME = 40;
	
	public static final int IMPLICIT_LOAD_TIME = 20;
	
	public static final int EXPLICIT_LOAD_TIME = 30;
}
