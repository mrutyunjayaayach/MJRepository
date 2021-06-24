package com.seleniumprogramms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\mruty\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");

		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bgsbuniversity.org/");
		String titlename = driver.getTitle();
		System.out.println(titlename);
		Thread.sleep(300);
		driver.findElement(By.linkText("Home")).click();
		Thread.sleep(300);
		driver.findElement(By.linkText("Admission")).click();
		Thread.sleep(300);
		driver.findElement(By.linkText("Result")).click();
		Thread.sleep(300);
		driver.findElement(By.linkText("Syllabus")).click();
		Thread.sleep(300);
		driver.findElement(By.linkText("Merit List")).click();
		Thread.sleep(300);
		driver.findElement(By.linkText("Date Sheet")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		String url = driver.getCurrentUrl();
		driver.get(url);
		Thread.sleep(3000);
		driver.navigate().to(url);
		Thread.sleep(3000);
		driver.findElement(By.name("s")).sendKeys(Keys.F5);
		Thread.sleep(3000);
		driver.close();
		

	}

}
