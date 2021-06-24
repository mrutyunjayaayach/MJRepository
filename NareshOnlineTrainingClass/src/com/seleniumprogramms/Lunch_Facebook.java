package com.seleniumprogramms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class Lunch_Facebook {

	public static void main(String[] args) {	
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mruty\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		//Actions select = new Actions(driver);
		//WebElement select1 = driver.findElement(By.xpath("//*[@id=\'pageFooter\']/ul"));
		//driver.findElement(By.xpath("//*[@id=\"pageFooter\"]/ul/li[1]")).click();
		//driver.close();
		//System.out.print("Testing Success");
		//driver.findElement(By.id("u_0_2_MH")).click();
		//System.out.print("Testing Success");
	}

}
