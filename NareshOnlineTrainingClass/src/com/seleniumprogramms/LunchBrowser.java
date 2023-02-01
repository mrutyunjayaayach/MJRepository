package com.seleniumprogramms;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\mruty\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mortgagecalculator.org/");
		String titlename = driver.getTitle();
		System.out.println(titlename);
		driver.findElement(By.id("homeval")).clear();
		Thread.sleep(500);
		
		driver.findElement(By.id("homeval")).sendKeys("500");
		Thread.sleep(50);
		driver.findElement(By.id("downpayment")).clear();
		Thread.sleep(50);
		driver.findElement(By.id("downpayment")).sendKeys("2300");
		Thread.sleep(50);
		driver.findElement(By.id("loanamt")).clear();
		Thread.sleep(50);
		driver.findElement(By.id("loanamt")).sendKeys("6000");
		Thread.sleep(50);
		driver.findElement(By.id("intrstsrate")).clear();
		Thread.sleep(50);
		driver.findElement(By.id("intrstsrate")).sendKeys("1.5");
		Thread.sleep(50);
		driver.findElement(By.name("ratebutton")).click();
		Thread.sleep(5000);
		driver.close(); 
	}

}
