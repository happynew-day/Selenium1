package com.dbyl.libarary.action;

import org.openqa.selenium.WebDriver;

public class ViewHomePage {

	public static void setDriver(WebDriver driver) {
		// TODO Auto-generated method stub
		driver.get("http://bbs.51testing.com/forum.php");
	}

	public static void viewMyProfile() {
		// TODO Auto-generated method stub
		System.out.println("HelloWrold!");
	}

}
