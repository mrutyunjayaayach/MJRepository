package com.seleniumprogramms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Print {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\mruty\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
	//	driver.get("https://www.flipkart.com/");

		String titlename=driver.getTitle();
		System.out.println(titlename);
		Thread.sleep(3000);
		Robot robot=new Robot();
	     robot.keyPress(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_P);
	     robot.keyRelease(KeyEvent.VK_CONTROL);
	     robot.keyRelease(KeyEvent.VK_P);

	}

}
