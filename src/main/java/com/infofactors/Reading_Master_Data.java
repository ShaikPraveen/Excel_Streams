package com.infofactors;

import org.apache.log4j.Logger;

public class Reading_Master_Data 
{
	//You want to Generate the Logs you must add Log4j.properties file under src folder and create one file 
	//like Application.log and give the path in Log4j.properties file
	
	public static void main(String[] args)
	{
		Logger log=Logger.getLogger("devpinoyLogger");
		
		ExcelReader excel=new ExcelReader("E:\\Praveen_Automation\\TestData.xlsx");
		String sheetName="CustomerData";
		//Count Rows
		log.debug("Count Rows Count");
		System.out.println(excel.getRowCount(sheetName));
		
		//Count Columns
		log.debug("Count Columns Count");
		System.out.println(excel.getColumnCount(sheetName));
		
		//Get the data
		log.debug("Get Cell Data");
		System.out.println(excel.getCellData(sheetName, "username", 3));
		
		//Set the Data
		log.debug("Set Cell Data");
		System.out.println(excel.setCellData(sheetName, "username", 4, "Suleman"));
		
	}
}
