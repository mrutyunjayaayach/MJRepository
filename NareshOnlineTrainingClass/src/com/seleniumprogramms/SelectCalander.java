package com.seleniumprogramms;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class SelectCalander {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mruty\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		String titlename=driver.getTitle();
		System.out.println(titlename);
		Thread.sleep(5000);
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		String expectedMonth="December";
		Thread.sleep(3000);

		while(true)
		{
			String actualMonth = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/div/span[1]")).getText();
		if(actualMonth.equals(expectedMonth))
		{
		driver.findElement(By.linkText("15")).click();
		break;
		}
		else
		
		{
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/a/span")).click();
		}
		}
		System.out.println("expected month: " + expectedMonth);
		
	}

}
