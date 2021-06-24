package com.seleniumprogramms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Reusable_Tasks {

		// TODO Auto-generated method stub
		static ChromeDriver driver;

		public static void browser_Launch() { 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mruty\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		//To define implicity wait(Time Limit)
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}

		public static void open_Url(String url) { 
		driver.get(url);
		}
		public static String get_titleOfPage() { 
		return driver.getTitle();
		}
		public static void checkBox(By locatorname) { 
		driver.findElement(locatorname).click();
		}
		public static void selectable(By locatorname) {
			Actions select = new Actions(driver);
			WebElement select1 = driver.findElement(locatorname);
			select.keyDown(Keys.CONTROL).click(select1)
			.keyUp(Keys.CONTROL).perform();
			//driver.close();
		}
		public static void close() {
			  driver.close();
		}

	}

