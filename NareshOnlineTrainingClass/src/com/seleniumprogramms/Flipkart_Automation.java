package com.seleniumprogramms;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_Automation extends ReuseableBrowser {

	public static void main(String[] args) throws Exception {
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
				Actions Mobile = new Actions(driver);
				WebElement fash = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[3]/a/div[2]"));
				Mobile.moveToElement(fash).perform();
				}catch(Exception e) {
					e.printStackTrace();
				}
		
		try {
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[3]/a/div[2]")).click();
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			Actions Samsung = new Actions(driver);
			WebElement fash = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[3]/div[2]/div[1]/div/div/div/div[1]/div/div[4]/div/a/p"));
			Samsung.moveToElement(fash).perform();
			}catch(Exception e) {
				e.printStackTrace();
			}
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[3]/div[2]/div[1]/div/div/div/div[1]/div/div[4]/div/a/p")).click();
		String SelectPrice="10000";
		if(SelectPrice.equalsIgnoreCase("5000")) {
			driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[3]/div/div[1]/div[2]/a")).click();
			System.out.print("Selected price 5000");
		}else if(SelectPrice.equalsIgnoreCase("10000")) {
			driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[4]/div/div[1]/div[2]/a")).click();
        System.out.print("Selected price 10K");
		}else if(SelectPrice.equalsIgnoreCase("15000")) {
			driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[5]/div/div[1]/div[2]/a")).click();
			System.out.print("Selected price 15k");
		}else if(SelectPrice.equalsIgnoreCase("20000")) {
			driver.findElement(By.id("//*[@id=\"container\"]/div/div[3]/div[6]/div/div[1]/div[2]/a")).click();
			System.out.print("Selected price 20k");
		}
		boolean status=true;
		do {
			List<WebElement>expectedMobile=driver.findElements(By.xpath("//*[text()=\"SAMSUNG Galaxy A3 (Midnight Black, 16 GB)\"]")) ;
			if(expectedMobile.size()==1) {
				expectedMobile.get(0).click();
				status=false;
			}else {
				driver.findElement(By.xpath("//*[@id=\'container\']/div/div[3]/div/div[2]/div[26]/div/div/nav/a[5]")).click();
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

