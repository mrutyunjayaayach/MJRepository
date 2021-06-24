package com.seleniumprogramms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utilities.ResueableExcelFile;

public class printind_data extends ReuseableBrowser {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
ResueableExcelFile re=new ResueableExcelFile("C:\\Users\\mruty\\eclipse-workspace\\NareshOnlineTrainingClass\\Sheet1.xlsx");
		
		re.getSheet("WritingData56");
		launchbrowser("chrome","");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/?utm_source=google&utm_medium=cpc&utm_campaign=&utm_term=mintra&utm_content=&matchtype=e&gclid=Cj0KCQjw5auGBhDEARIsAFyNm9EJh80T7G-LFkPeXW0NKzJupaJ7JXLWsLU8nw9UrCxPPe1neVmdvXIaAgOFEALw_wcB");
		driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/input")).sendKeys("Winter");
		List<WebElement> list=driver.findElements(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/div/ul/li"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			re.getDataintoCell(i, 2, list.get(i).getText());
			System.out.println();
		}
		re.closeFileoutputStream();
        driver.close(); 

	}

}
