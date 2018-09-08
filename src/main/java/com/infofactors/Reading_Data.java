package com.infofactors;

import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reading_Data 
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream fis=new FileInputStream("E:\\Praveen_Automation\\Java_Streams\\SampleExcelFile.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet0=wb.getSheetAt(0);
		
		for(Row row : sheet0)
		{
			for(Cell cell : row)
			{
				switch(cell.getCellType())
				{
				case Cell.CELL_TYPE_STRING:
					System.out.print(cell.getStringCellValue()+"\t");
					break;
					
				case Cell.CELL_TYPE_NUMERIC:
					System.out.print(cell.getNumericCellValue()+"\t");
					break;
					
				case Cell.CELL_TYPE_BLANK:
					System.out.print("Blank Cell" +"\t");
					break;
				}	
			}
			
			System.out.println();
		}
	}

}
