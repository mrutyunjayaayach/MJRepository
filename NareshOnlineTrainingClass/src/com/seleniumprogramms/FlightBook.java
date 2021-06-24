package com.seleniumprogramms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FlightBook {

public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\mruty\\Downloads\\chromedriver_win32\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.spicejet.com/");
String titlename=driver.getTitle();
System.out.println(titlename);
Thread.sleep(5000);
driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("Koch");
Thread.sleep(5000);
driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("Goa");
Thread.sleep(5000);
driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
Thread.sleep(5000);
driver.findElement(By.id("divpaxinfo")).click();
Thread.sleep(5000);
Select passenger_dropdown=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
passenger_dropdown.selectByVisibleText("5");
Thread.sleep(5000);
Select passenger_dropdow=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
passenger_dropdow.selectByIndex(3);
Thread.sleep(5000);
Select passenger_dropdo=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
passenger_dropdo.selectByIndex(2);
Thread.sleep(5000);
driver.findElement(By.id("divpaxinfo")).click();
Thread.sleep(5000);
driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
Thread.sleep(5000);
Select passenger_dropd=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
passenger_dropd.selectByIndex(2);
Thread.sleep(5000);
driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
Thread.sleep(5000);
driver.navigate().back();
Thread.sleep(5000);
driver.navigate().forward();
Thread.sleep(5000);
driver.navigate().refresh();
Thread.sleep(5000);
driver.close();
}
}
