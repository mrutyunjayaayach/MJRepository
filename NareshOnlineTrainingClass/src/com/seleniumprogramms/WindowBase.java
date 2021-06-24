package com.seleniumprogramms;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowBase {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\mruty\\Downloads\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.naukri.com/");
			String titlename=driver.getTitle();
			System.out.println(titlename);
			Thread.sleep(3000);
			driver.findElement(By.id("wdgt-file-upload")).click();
			//Thread.sleep(3000);
			
		//	Runtime.getRuntime().exec("C:\\Users\\mruty\\OneDrive\\Desktop\\Document.exe");

	}

}
