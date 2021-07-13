package com.candidatepsi.cases;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.candidatepsi.reusable.Reusable_Tasks;

public class CreateAnAccount extends Reusable_Tasks {

	@BeforeClass(groups = { "smoke", "sanity", "regression" })
	public void clickoncreateaccountlink() {

		click(By.linkText("Create"));
		boolean status = isDisplayed(By.xpath("//div[@class='title']"));
		Assert.assertTrue(status, "Create an Account Header got displayed");
	}

	@Test(priority = 1, groups = "smoke")
	public void validate_error_message_mandatory_fields() {
		click(By.name("Submit"));
		Assert.assertEquals("This field is required.", getElementText(By.xpath("//div[@htmlfor='emailid']")));
		Assert.assertEquals("This field is required.", getElementText(By.xpath("//div[@htmlfor='firstname']")));
		Assert.assertEquals("This field is required.", getElementText(By.xpath("//div[@htmlfor='lastname']")));

	}

	@Test(priority = 2, groups = "sanity")
	public void verify_validation_message_for_existing_accountext() throws InterruptedException {
		sendKey(By.name("emailid"), "mrutyunjayaayach143@gmail.com");
		sendKey(By.name("emailid"), "mrutyunjayaayach143@gmail.com");
		sendKey(By.name("firstname"), "Mrutyunjaya");
		sendKey(By.name("lastname"), "Ayach");
		sendKey(By.name("password"), "Mr@7325869821");
		sendKey(By.name("confirmpassword"), "Mr@7325869821");
		click(By.name("hintquestion"));
		click(By.xpath("//option[@value=\"Favorite vacation spot\"]"));
		Thread.sleep(5000);
		sendKey(By.name("hintanswer"), "cricket");
		Thread.sleep(5000);
		click(By.name("Submit"));
		Assert.assertEquals("Email already exists. Please enter another Email ID",
				getElementText(By.xpath("*//li[text()=\"Email already exists. Please enter another Email ID\"]")));

	}

	@Test(priority = 3, groups = "Regression")
	public void Password_doesnt_meet_mandatory_rules() throws InterruptedException {
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		sendKey(By.name("emailid"), "mrjayaayach143@gmail.com");
		sendKey(By.name("firstname"), "Mrutyunjaya");
		sendKey(By.name("lastname"), "Ayach");
		sendKey(By.name("password"), "123456789");
		sendKey(By.name("confirmpassword"), "123456789");
		click(By.xpath("//option[@value=\"Favorite vacation spot\"]"));
		Thread.sleep(5000);
		sendKey(By.name("hintanswer"), "cricket");
		Thread.sleep(3000);
		click(By.name("Submit"));
		String tex = driver.switchTo().alert().getText();
		System.out.println(tex);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		// click(By.xpath("//*[@id=\"topNav\"]/a[1]"));
		// Thread.sleep(3000);
	}

	@Test(priority = 4, groups = "smoke")
	public void valid_mail() throws InterruptedException {
		Thread.sleep(3000);
		// driver.navigate().refresh();
		sendKey(By.name("firstname"), "Mrutyunjaya");
		sendKey(By.name("lastname"), "Ayach");
		sendKey(By.name("password"), "Mr@7325869821");
		sendKey(By.name("confirmpassword"), "Mr@7325869821");
		click(By.name("hintquestion"));
		click(By.xpath("//option[@value=\"Favorite vacation spot\"]"));
		Thread.sleep(5000);
		sendKey(By.name("hintanswer"), "cricket");
		Thread.sleep(5000);
		click(By.name("Submit"));
		Thread.sleep(3000);
		click(By.xpath("//*[@id=\"topNav\"]/a[1]"));
		// click(By.xpath("//*[@id=\"topNav\"]/a[4]"));
	}
}