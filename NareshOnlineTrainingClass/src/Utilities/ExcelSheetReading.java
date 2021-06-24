package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetReading {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File sc = new File("C:\\Users\\mruty\\OneDrive\\Documents\\sheet3.xlsx");
		FileInputStream fi = new FileInputStream(sc);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		//XSSFSheet objSheet=bookObj.getSheet("");
		XSSFSheet sheet1= wb.getSheetAt(0);
		int totalrow=sheet1.getLastRowNum();
		System.out.println(totalrow);
		int totalcol= sheet1.getRow(0).getLastCellNum();
		System.out.println(totalcol);
		for(int i=0; i<=totalrow; i++) {
		if(sheet1.getRow(i)!=null) {
		Row row =sheet1.getRow(i);
		for(int j=0; j<totalcol;j++) {
		if(row.getCell(j)!=null) {
		System.out.println(row.getCell(j).getStringCellValue());
		}
		}
		}
		}
		wb.close();
		fi.close();

	}

}
