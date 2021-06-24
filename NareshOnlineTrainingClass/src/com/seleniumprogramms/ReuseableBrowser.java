package com.seleniumprogramms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReuseableBrowser {
	static WebDriver driver;

	public static void launchbrowser(String browsername,String testcasestep) {
		// TODO Auto-generated method stub
		if(browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mruty\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			driver=new ChromeDriver();
		}else if(browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("", "");
			driver=new FirefoxDriver();
		}else if(browsername.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mruty\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
	}

}
