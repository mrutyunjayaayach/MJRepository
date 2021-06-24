package com.seleniumprogramms;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utilities.ResueableExcel;

//import Utilities.ResueableExcel;


public class PrintingDrropDownValue extends ReuseableBrowser {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//File re=new File(System.getProperty("user.dir")+"\\configuration.properties");
		ResueableExcel re=new ResueableExcel("C:\\Users\\mruty\\eclipse-workspace\\NareshOnlineTrainingClass\\Sheet1.xlsx");
		
		re.getSheet("WritingData");
		launchbrowser("chrome","");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://candidate.psiexams.com/catalog/displayagencylicenses.jsp?catalogID=334");
		WebElement sponsorname=driver.findElement(By.id("c0"));
		List<WebElement> list=sponsorname.findElements(By.tagName("option"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			re.getDataintoCell(i, 2, list.get(i).getText());
			System.out.println();
		}
		re.closeFileoutputStream();
        driver.close(); 
	}

	}


