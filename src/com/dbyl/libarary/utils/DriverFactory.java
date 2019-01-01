package com.dbyl.libarary.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

	public static WebDriver getChromeDriver() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "webDriver/chromedriver.exe");
//		System.setProperty("webdriver.chrome.bin", "C:/Chrome/Application/chrome.exe"); 
		WebDriver driver = new ChromeDriver();
		return driver;
	}

}
