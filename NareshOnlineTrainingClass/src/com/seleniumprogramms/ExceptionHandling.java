package com.seleniumprogramms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ExceptionHandling {
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mruty\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkartt5.com/");
		//driver.switchTo().alert().accept();
		String titlename=driver.getTitle();
		System.out.println(titlename); 
		Thread.sleep(0);
		WebDriverException
		Actions Fashion = new Actions(driver);
		WebElement fash = driver.findElement(By.xpath("//*[@id=\'container\']/div/div[2]/div/div/div[4]/a/div[1]/div/img"));
		Fashion.moveToElement(fash).perform();
		Thread.sleep(0);
		Actions MensWear = new Actions(driver);
		WebElement wear = driver.findElement(By.xpath("//*[@id=\'container\']/div/div[2]/div/div/div[4]/a/div[2]/div[2]/div[2]/div/div/div[1]/a[1]"));
		MensWear.moveToElement(wear).perform();
		Thread.sleep(5000);
		driver.close();

		//driver.findElement(By.linkText("Droppable")).click();

	}
}
//IllegalStateException: The driver executable does not exist: D:\Users\mruty\Downloads\geckodriver-v0.29.1-win64\geckodriver.exe
//NoSuchElementException: Unable to locate element: Draggable
//NoAlertPresentException: