package com.seleniumprogramms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class WindowBasedPopup_Sikul {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		// TODO Auto-generated method stub
		System.out.println("HI");
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\mruty\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 ChromeDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.monsterindia.com/");
		 String titlename=driver.getTitle();
		 System.out.println(titlename);
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id=\"user-signup-actions\"]/div[1]/div/a[2]/span[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"user-signup-actions\"]/div[1]/div/div[2]/div/div/section/div/form/div[1]/div[1]/div")).click();
		 Screen select = new Screen();
		 Thread.sleep(3000);
		 System.out.println("Hello");
//		select.type("F:\\New folder\\Select6.PNG" ,"F:\\New folder\\New Doc 2020-03-02 12.08.12.pdf");
//		System.out.println("typing done");
//		select.click("F:\\Open6.PNG");
//		Thread.sleep(3000);
		 select.type("F:\\Capture0.PNG" ,"F:\\New folder\\New Doc 2020-03-02 12.08.12.pdf");
		 System.out.print("jk");
		 Thread.sleep(5000);
		 select.click("F:\\Open0.PNG");
		 System.out.print("hjjj");

	}

}
