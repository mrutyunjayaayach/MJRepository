package com.seleniumprogramms;

import org.openqa.selenium.By;

public class OnlyTestingWebsite_UsingReusable extends Reusable_Tasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		browser_Launch();
		open_Url("http://only-testing-blog.blogspot.com/2014/09/selectable.html");
		System.out.println(get_titleOfPage());
		selectable(By.xpath("//*[@id=\'selectable\']/li[1]"));
		selectable(By.xpath("//*[@id=\'selectable\']/li[2]"));
		selectable(By.xpath("//*[@id=\'selectable\']/li[3]"));
		selectable(By.xpath("//*[@id=\'selectable\']/li[4]"));
		selectable(By.xpath("//*[@id=\'selectable\']/li[5]"));
		selectable(By.xpath("//*[@id=\'selectable\']/li[6]"));
		close();

	}

}
