package com.seleniumprogramms;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_tst extends ReuseableBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchbrowser("chrome","");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		String parent_window = driver.getWindowHandle();
		try {
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[3]/a/div[2]")).click();
		}catch(Exception e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[3]/div[2]/div[1]/div/div/div/div[1]/div/div[4]/div/a/p")).click();
		//String SelectPrice="Budget Phones Below ₹5000";
		boolean statu=true;
		do {
			List<WebElement>expectedMobile=driver.findElements(By.xpath("//*[text()=\"Samsung Mobile under ₹15K\"]")) ;
			if(expectedMobile.size()==4) {
				driver.findElement(By.xpath("//*[text()=\"VIEW ALL\"]")).click();
				statu=false;
			}else {
				//driver.findElement(By.xpath("//*[text()=\"Next\"]")).click();
			    statu=true;
			}
		}while(statu);
	
		boolean status=true;
		do {
			List<WebElement>expectedMobile=driver.findElements(By.xpath("//*[text()=\"SAMSUNG Galaxy A30s (Prism Crush Black, 128 GB)\"]")) ;
			if(expectedMobile.size()==1) {
				expectedMobile.get(0).click();
				status=false;
			}else {
				driver.findElement(By.xpath("//*[text()=\"Next\"]")).click();
			    status=true;
			}
		}while(status);
			Set<String>windows=driver.getWindowHandles();
			Iterator<String>itr=windows.iterator();
			while(itr.hasNext()) {
				String windownames=itr.next();
				if(!windownames.equals(parent_window)) {
					driver.switchTo().window(windownames);
						Actions more = new Actions(driver);
						WebElement mr = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[4]/div/div/div/div"));
						more.moveToElement(mr).perform();
						driver.findElement(By.xpath("//*[text()=\"Sell on Flipkart\"]")).click();
				}
				
			}
			System.out.print("Success");
		driver.quit();

	}

}
