package com.kayak.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ConfigsReader {

	// read and return file from xl and properties
	private static Properties prop;
	
	static FileInputStream fis;

	public static Properties readProperties(String filePath) {

		try {
			fis = new FileInputStream(filePath);
			prop = new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
	
	public static String getProperty(String key) {
		return prop.getProperty(key);
	}

	
	//read excel file
	public static Object[][] readXL(String filePath, String sheet) {
		
		Object[][] data = null; // create empty 2D array
		try {
			
			fis = new FileInputStream(filePath);
			Workbook wbook = new XSSFWorkbook(fis);
			
			Sheet sh = wbook.getSheet(sheet);
			
			int rows = sh.getPhysicalNumberOfRows();  //returns rows+1 so we need to use row-1 for data row size
			int cols = sh.getRow(0).getLastCellNum();

			//assign number of rows and cols. rows-1 because we don't want first row which holds field names/ headers
			data = new Object[rows-1][cols];
			
			// read cells from excel, pass it to 2D array
			for (int i = 1; i < rows; i++) {
			
				for (int j = 0; j < cols; j++) {
					data[i-1][j] = sh.getRow(i).getCell(j).toString(); 
				}
			}
			wbook.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data;
	}
}
