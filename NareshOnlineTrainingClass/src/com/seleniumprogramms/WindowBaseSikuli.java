package com.seleniumprogramms;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;


public class WindowBaseSikuli {

	public static void main(String[] args) throws InterruptedException, FindFailed   {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\mruty\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		String titlename = driver.getTitle();
		System.out.println(titlename);
		Thread.sleep(5000);
		driver.findElement(By.id("wdgt-file-upload")).click();
		Thread.sleep(5000);
		    Screen select=new Screen();
		    select.type("F:\\Capture0.PNG" ,"F:\\New folder\\New Doc 2020-03-02 12.08.12.pdf");
			select.click("F:\\Open0.PNG");
			Thread.sleep(5000);
			driver.quit();

	}

}
