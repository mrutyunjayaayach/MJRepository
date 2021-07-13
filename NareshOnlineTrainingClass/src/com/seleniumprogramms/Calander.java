package com.seleniumprogramms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calander {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mruty\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		String titlename=driver.getTitle();
		System.out.println(titlename);
		Thread.sleep(5000);
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
	 String expectedMonth="January";
		Thread.sleep(3000);
		WebElement select1 = driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/div[2]/div/a/span"));
		WebElement monthHeading = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/div/span[1]"));
		if(!monthHeading.getText().equals(expectedMonth)) {
			select1.click();
		}
		else
		{
		driver.findElement(By.linkText("15")).click();
		System.out.println("expected month: " + expectedMonth);
		//driver.close();
		}
	}

	}


