package com.candidatepsi.reusable;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.candidatepsiexams.utilities.ReusablePropertiesFile;

public class BaseClass {

	public static WebDriver driver;
	ReusablePropertiesFile re;

	@BeforeTest(groups = { "smoke", "sanity", "regression" })
	public void launchbrowser() throws FileNotFoundException {
		re = new ReusablePropertiesFile(System.getProperty("user.dir")+ "\\src\\test\\resources\\com\\candidatepsiexam\\configuration\\configuration.properties");
		if (re.getValuefromPropertyFile("browsername").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\mruty\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (re.getValuefromPropertyFile("browsername").equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();

		} else if (re.getValuefromPropertyFile("browsername").equalsIgnoreCase("Edge")) {

		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(re.getValuefromPropertyFile("url"));
	}

	@AfterTest(groups = { "smoke", "sanity", "regression" })
	public void closebrowser() {

		driver.close();
		// driver.quit();
	}

}
