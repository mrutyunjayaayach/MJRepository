package com.seleniumprogramms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Select {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\mruty\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://only-testing-blog.blogspot.com/");
		String title=driver.getTitle();
		System.out.println(title);
		Actions select = new Actions(driver);
		WebElement select1 = driver.findElement(By.xpath("//option[@value='India']"));
		WebElement select2 = driver.findElement(By.xpath("//option[@value='Italy']"));
		WebElement select3 = driver.findElement(By.xpath("//option[@value='Mexico']"));
		WebElement select4 = driver.findElement(By.xpath("//option[@value='Malaysia']"));
		WebElement select5 = driver.findElement(By.xpath("//option[@value='USA']"));
		WebElement select6 = driver.findElement(By.xpath("//option[@value='Greece']"));
		WebElement select7 = driver.findElement(By.xpath("//option[@value='Spain']"));
		
		Thread.sleep(3000);
		select.keyDown(Keys.CONTROL).click(select1).click(select2).click(select3).click(select4).click(select5).click(select6).click(select7)
		.keyUp(Keys.CONTROL).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"post-body-4292417847084983089\"]/div[1]/form[2]/table/tbody/tr/td[2]/input[1]")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
