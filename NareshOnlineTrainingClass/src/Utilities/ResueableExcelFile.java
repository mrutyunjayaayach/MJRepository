package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ResueableExcelFile {
	File f;
	FileInputStream fi;		
	FileOutputStream fo;
	XSSFWorkbook wb;
	XSSFSheet sh;
	public ResueableExcelFile(String pathname) throws Exception{
		try {
		f=new File(pathname);
		fi=new FileInputStream(f);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
		public void getSheet(String sheetname) throws Exception {
			try {
				if(sheetname.equalsIgnoreCase("sheetname")) {
			wb=new XSSFWorkbook(fi);
			sh=wb.getSheet(sheetname);
				}else{
					wb=new XSSFWorkbook(fi);
					sh=wb.createSheet(sheetname);
				}	
			}catch(Exception e) {
				e.printStackTrace();
			}
			
	}
	public void getSheet(int index) throws Exception {
		try {
		wb=new XSSFWorkbook(fi);
		sh=wb.getSheetAt(index);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void getDatafromcell(int rownum,int colnum) {
		try {
		sh.getRow(rownum).getCell(colnum).getStringCellValue();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
		public void getDataintoCell(int rownum,int colnum,String text) {
			try {
				sh.createRow(rownum).createCell(colnum).setCellValue(text);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
			public void closeFileoutputStream() throws IOException {
				fo=new FileOutputStream(f);
				wb.write(fo);
				fo.close();
			}
}
