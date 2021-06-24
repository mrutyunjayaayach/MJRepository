package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
//import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellReading {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		File sc=new File("C:\\Users\\mruty\\OneDrive\\Documents\\sheet1.xlsx");
		//File sc=new File("C:\\Users\\mruty\\OneDrive\\Desktop\\New Microsoft Excel Worksheet.xlsx");
		FileInputStream fi=new FileInputStream(sc);
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet sheet1= wb.getSheetAt(0);
		int rowcount=sheet1.getLastRowNum();
		System.out.println("TOtal row is"+rowcount);
		for(int i=0;i<rowcount+1;i++)
		{
		//(sheet1.getRow(i).getCell(0).getStringCellValue();
 			String data=sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Data from row :"+data);
			
		}
		//System.out.print(sheet2.getRow(2).getCell(2).getStringCellValue()); 
		wb.close();
		//fis.close();

	}

}
