package com.seleniumprogramms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utilities.ResueableExcelFile;

public class Row_colCount extends ReuseableBrowser {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
ResueableExcelFile re=new ResueableExcelFile("C:\\Users\\mruty\\eclipse-workspace\\NareshOnlineTrainingClass\\Sheet1.xlsx");
		
		re.getSheet("RowcolCount589");
		launchbrowser("chrome","");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers/dailygroupa?");
		List<WebElement> row=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		List<WebElement> col=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[2]/td"));
		System.out.println(col.size());
		System.out.println(row.size());
		for(int i=0;i<row.size();i++) {
		//if(row.get(i)!=null) {
			row.get(i);
		
			for(int j=0;j<col.size();j++)
			
			System.out.println(col.get(j).getText());
		
		}
		re.closeFileoutputStream();
        driver.close(); 

	}

	}
