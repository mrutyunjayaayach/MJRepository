package com.candidatepsi.reusable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.candidatepsi.reusable.BaseClass;

public class Reusable_Tasks extends BaseClass {

	public static void appurl(String url, String testcasestep) {
		driver.get(url);
	}

	public static String gettingTitlename(String testcasestep) {

		return driver.getTitle();
	}

	public static void mouseHover(By locatorname, String testcasestep) {

		WebElement ele = driver.findElement(locatorname);
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();

	}

	public static void click(By locatorname) {
		driver.findElement(locatorname).click();
	}

	public static boolean isDisplayed(By locatorname) {
		boolean status = driver.findElement(locatorname).isDisplayed();
		return status;
	}

	public static String getElementText(By locatorname) {
		String text = driver.findElement(locatorname).getText();
		return text;
	}

	public static void sendKey(By locatorname, String enter) {
		driver.findElement(locatorname).clear();
		driver.findElement(locatorname).sendKeys(enter);

	}

	public static void select(By locatorname, String question) {

	}
}
