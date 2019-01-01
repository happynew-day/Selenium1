package com.dbyl.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dbyl.libarary.action.CommonLogin;
import com.dbyl.libarary.action.ViewHomePage;
import com.dbyl.libarary.utils.DriverFactory;
import com.dbyl.libarary.utils.UITest;

public class loginTest extends UITest{
	
	WebDriver driver=DriverFactory.getChromeDriver();
	
	@BeforeMethod(alwaysRun=true)
	public void init()
	{
		super.init(driver);
//		ViewHomePage.setDriver(driver);
		CommonLogin.setDriver(driver);
	}
	
	@Test(groups="loginTest")
	public void loginByUerName() throws Exception
	{
		//登录入口
		CommonLogin.login("seleniumcookies@126.com","cookies123");
//		driver.findElement(By.cssSelector("div.HomeSidebar-signBannerActions>button:nth-child(1)")).click();
//		ViewHomePage.viewMyProfile();
	}
	
	@AfterMethod(alwaysRun=true)
	public void stop() 
	{
		super.stop();
	}
	
}