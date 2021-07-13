package com.candidatepsiexams.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reusable_excelFile {
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	public Reusable_excelFile(String excelfile) throws Exception
	{
		File sc=new File(excelfile);
		FileInputStream fi=new FileInputStream(sc);
		wb=new XSSFWorkbook(fi);
		sheet1=wb.getSheetAt(0);
	}

		
		}

//    public String getData(int sheetnum,int row,int col)
//    {
//    	//sheet1=wb.getSheetAt(0);
//    	String data=sheet1.getRow(row).getCell(col).getStringCellValue();
//    	return data;
//    }

