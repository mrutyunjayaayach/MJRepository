package com.seleniumprogramms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class WindowUpload {

	public static void main(String[] args) throws InterruptedException, FindFailed   {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\mruty\\Downloads\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.naukri.com/");
			Thread.sleep(3000);
			driver.findElement(By.id("wdgt-file-upload")).click();
			Thread.sleep(3000);
			Screen s = new Screen();
			s.type("C:\\Users\\mruty\\OneDrive\\Desktop\\Capture1.PNG","C:\\Users\\mruty\\OneDrive\\Pictures\\Screenshots\\2021-05-16 (2).png");
			s.click("C:\\\\Users\\\\mruty\\\\OneDrive\\\\Desktop\\\\Open2.PNG");
			Thread.sleep(3000);
			driver.quit();

	}

}
