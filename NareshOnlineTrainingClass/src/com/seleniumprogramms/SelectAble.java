package com.seleniumprogramms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class SelectAble {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\mruty\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://only-testing-blog.blogspot.com/");
		String titlename = driver.getTitle();
		System.out.println(titlename);
		driver.findElement(By.linkText("Selectable")).click();
		WebElement item1=driver.findElement(By.xpath("//*[@id=\'selectable\']/li[2]"));
		WebElement item4=driver.findElement(By.xpath("//*[@id=\'selectable\']/li[4]"));
		WebElement item6=driver.findElement(By.xpath("//*[@id=\'selectable\']/li[6]"));
		Actions SelectAble = new Actions(driver);
		 SelectAble.keyDown(Keys.CONTROL).click(item1).click(item4).click(item6).perform();
		 SelectAble.keyUp(Keys.CONTROL).perform();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.close();
	}

}
