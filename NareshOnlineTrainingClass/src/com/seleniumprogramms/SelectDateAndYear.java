package com.seleniumprogramms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SelectDateAndYear extends ReuseableBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchbrowser("chrome","");
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//appurl("https://book.spicejet.com/Register.aspx" , "");
		driver.get("https://book.spicejet.com/Register.aspx");
		driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TEXTBOXINPUTDOB")).click();
		//WebElement expectedMonth=driver.findElement(By.xpath("//*[text()='2001']"));
		String expectedMonth ="1961";
		//WebElement select1 = driver.findElement(By.className("datepickerGoPrev"));
		System.out.print("hey");
		//WebElement monthHeading = driver.findElement(By.xpath("//*[text()='2000']"));
//		//if(!monthHeading.getText().equals("//*[text()='2001']")) {
//			select1.click();
//		}
//		else
//		{
//		//driver.findElement(By.linkText("2000")).click();
//		//System.out.println("expected month: " + expectedMonth);
//		driver.close();
//		}
		
		while(true)
		{
			String actualMonth = driver.findElement(By.xpath("//*[text()='2000']")).getText();
		if(actualMonth.equals("//*[text()='1961']"))
		{
		//driver.findElement(By.linkText("2001")).click();
		break;
		}
		else
		
		{
		driver.findElement(By.xpath("//*[text()='◀']")).click();
		}
		}
		System.out.println("expected month: " + expectedMonth);
		
        
	}

}
