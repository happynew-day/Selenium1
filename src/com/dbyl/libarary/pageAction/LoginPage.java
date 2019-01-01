package com.dbyl.libarary.pageAction;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import com.dbyl.libarary.utils.BasePage;
import com.dbyl.libarary.utils.Locator;

public class LoginPage extends BasePage {
	WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public LoginPage(WebDriver driver) throws IOException {
		super(driver);
		driver.get("http://www.zhihu.com/#signin");
	}
	
	Locator login = new Locator("//div[@class='SignContainer-switch']//span");
	Locator loginEmailInputBox = new Locator("//div[@class='SignFlow-accountInput Input-wrapper']//input");
	Locator loginPasswordInputBox = new Locator("//div[@class='Input-wrapper']//input");
	Locator loginButton = new Locator("//button[@class='Button SignFlow-submitButton Button--primary Button--blue']");
	Locator profile = new Locator("profile");
	
	public void typeEmailInputBox(String email) throws Exception {
		type(loginEmailInputBox, email);
	}
	
	public void typePasswordInputBox(String password) throws Exception {
		type(loginPasswordInputBox, password);
	}
	
	public void clickOnLoginButton() throws Exception {
		click(loginButton);
	}
	
	public void clickOnLogin() throws Exception {
//		System.out.println(login.getElement()+"\t"+login.getBy());
		click(login);
	}
	
	public boolean isPrestentProfile() throws IOException {
		return isElementPresent(profile, 20);
	}
	
	public void waitForPageLoad() {
		super.getDriver().manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}
	
}