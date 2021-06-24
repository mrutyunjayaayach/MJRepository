package com.seleniumprogramms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DraggableDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\mruty\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/");
		String titlename = driver.getTitle();
		System.out.println(titlename);
		Thread.sleep(5000);
		driver.findElement(By.linkText("Draggable")).click();
		Thread.sleep(3000);
		Actions draggable = new Actions(driver);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));	
		WebElement drg = driver.findElement(By.id("draggable"));
		draggable.dragAndDropBy(drg, 168, 66).perform();
		Thread.sleep(5000);
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));	
		WebElement drop = driver.findElement(By.id("draggable"));
		draggable.dragAndDropBy(drop, 154, 13).perform();
		Thread.sleep(3000);
		driver.get("https://jqueryui.com/resizable/");
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));	
		WebElement resize = driver.findElement(By.xpath("//*[@id=\'resizable\']/div[3]"));
		draggable.dragAndDropBy(resize, 272, 229).perform();
		Thread.sleep(3000);
		driver.close();
	}

}
