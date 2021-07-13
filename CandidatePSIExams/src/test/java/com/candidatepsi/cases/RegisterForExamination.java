package com.candidatepsi.cases;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.candidatepsi.reusable.Reusable_Tasks;

public class RegisterForExamination extends Reusable_Tasks {
	@Test(priority = 5, groups = "smoke")
	public void Username_or_password_invalid() throws InterruptedException {
		sendKey(By.name("emailid"), "mrutyunjayaayach143@gmail.com");
		Thread.sleep(3000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//        WebElement elementToClick = driver.findElement(By.xpath("//input[@value='Sign in']"));
//        js.executeScript("arguments[0].scrollIntoView()", elementToClick);
//        js.executeScript("arguments[0].click();", elementToClick);
//        String text=driver.switchTo().alert().getText();
//        System.out.println(text);
//        driver.switchTo().alert().accept();
		// click(By.id("onetrust-accept-btn-handler"));
		sendKey(By.name("password"), "Mr@73258698");
		click(By.xpath("//option[@value=\'CDACT01\']"));
		Thread.sleep(3000);
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		WebElement elementToClickk = driver.findElement(By.xpath("//input[@value='Sign in']"));
		// click(By.xpath("//input[@value=\\'Sign in\\']"));
		jss.executeScript("arguments[0].scrollIntoView()", elementToClickk);
		jss.executeScript("arguments[0].click();", elementToClickk);
		Assert.assertEquals("Username or Password is invalid.",
				getElementText(By.xpath("//*[@id=\"instruction\"]/table/tbody/tr[2]/td/ul/li")));
	}

	@Test(priority = 6, groups = "smoke")
	public void Signin() throws InterruptedException {
		driver.navigate().back();
		sendKey(By.name("emailid"), "mrutyunjayaayach143@gmail.com");
		sendKey(By.name("password"), "Mr@7325869821");
		click(By.xpath("//option[@value=\'CDACT01\']"));
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement elementToClick = driver.findElement(By.xpath("//input[@value=\'Sign in\']"));
		js.executeScript("arguments[0].scrollIntoView()", elementToClick);
		js.executeScript("arguments[0].click();", elementToClick);
		boolean status = isDisplayed(By.xpath("//div[@class='title']"));
		Assert.assertTrue(status, "Register for a Test got displayed");
	}

	@Test(priority = 7, groups = "sanity")
	public void Register_for_a_Test() throws InterruptedException {
		String parent_window = driver.getWindowHandle();
		click(By.xpath("//option[@value=\'554^-99\']"));
		click(By.xpath("//option[@value=\"557^-99^false^\"]"));
		click(By.xpath("//tr[2]//td[2]//a[@class=\"links\"]"));
		click(By.xpath("//*[@id=\"tb3\"]/table/tbody/tr[12]/td/div/a"));
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		while (itr.hasNext()) {
			String windownames = itr.next();
			if (!windownames.equals(parent_window)) {
				driver.switchTo().window(windownames);
				click(By.id("testcenterstate"));
				click(By.xpath("//input[@type='submit']"));
			}
		}
		driver.switchTo().window(parent_window);
		click(By.name("Submit3"));
		click(By.name("findrecordbtn"));
		click(By.xpath("//option[@value=\"554^-99\"]"));
		click(By.xpath("//option[@value=\"557^-99^false^\"]"));
		sendKey(By.xpath("//input[@name=\"stateID\"]"), "1456984");
		click(By.xpath("//input[@id=\"Submit4222\"]"));
	}

}
