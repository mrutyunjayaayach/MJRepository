package com.seleniumprogramms;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchBroowser {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\mruty\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mortgagecalculator.org/");
		String titlename=driver.getTitle();
		System.out.println(titlename);

		driver.findElement(By.id("homeval")).clear();
		Thread.sleep(50);
		driver.findElement(By.id("homeval")).sendKeys("500");
		Thread.sleep(50);
		driver.findElement(By.id("downpayment")).clear();
		Thread.sleep(50);
		driver.findElement(By.id("downpayment")).sendKeys("2300");
		Thread.sleep(50);
		driver.findElement(By.id("loanamt")).clear();
		Thread.sleep(50);
		driver.findElement(By.id("loanamt")).sendKeys("6000");
		Thread.sleep(50);
		driver.findElement(By.id("intrstsrate")).clear();
		Thread.sleep(50);
		driver.findElement(By.id("intrstsrate")).sendKeys("1.5");
		Thread.sleep(50);
		driver.findElement(By.name("ratebutton")).click();
		Thread.sleep(5000);
	}

}
