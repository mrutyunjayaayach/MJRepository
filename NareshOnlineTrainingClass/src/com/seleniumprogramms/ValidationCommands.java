package com.seleniumprogramms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class ValidationCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mruty\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bing.com/?toWww=1&redig=C546556143A14775A42E8EE572EF1F73");
		String titlename=driver.getTitle();
		System.out.println(titlename); 
		Thread.sleep(5000);
		driver.findElement(By.id("id_sc")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"hbsettings\"]/div")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"hbsettree\"]/a[5]/div")).click();
		Thread.sleep(5000);
		driver.close();

	}

}


