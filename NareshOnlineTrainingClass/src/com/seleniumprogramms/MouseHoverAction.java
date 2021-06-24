package com.seleniumprogramms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mruty\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String titlename=driver.getTitle();
		System.out.println(titlename); 
		Thread.sleep(8000);
		Actions Fashion = new Actions(driver);
		WebElement fash = driver.findElement(By.xpath("//*[@id=\'container\']/div/div[2]/div/div/div[4]/a/div[1]/div/img"));
		Fashion.moveToElement(fash).perform();
		Thread.sleep(5000);
		Actions MensWear = new Actions(driver);
		WebElement wear = driver.findElement(By.xpath("//*[@id=\'container\']/div/div[2]/div/div/div[4]/a/div[2]/div[2]/div[2]/div/div/div[1]/a[2]"));
		MensWear.moveToElement(wear).perform();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Men's Shorts")).click();
		
		Thread.sleep(5000);
		driver.close();

	}

}
