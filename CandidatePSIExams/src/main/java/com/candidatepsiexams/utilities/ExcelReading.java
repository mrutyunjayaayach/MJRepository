package com.candidatepsiexams.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
//import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReading {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		System.out.println();
		File sc=new File(System.getProperty("user.dir")+"\\Sheet1.xlsx");
		FileInputStream fi=new FileInputStream(sc);
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet sheet1= wb.getSheetAt(0);
		int rowcount=sheet1.getLastRowNum();
		System.out.println("TOtal row is"+rowcount);
		for(int i=0;i<rowcount+1;i++)
		{
			int cellcount=sheet1.getRow(i).getLastCellNum();
	
			System.out.println(i);
			for(int j=0;j<cellcount;j++) {
				System.out.print(sheet1.getRow(i).getCell(j).getStringCellValue()+"  "); 
			}
				System.out.println();
		}
		 
		wb.close();
	}

}
