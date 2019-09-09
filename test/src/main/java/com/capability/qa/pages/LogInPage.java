package com.capability.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capability.qa.base.Testbase;

public class LogInPage extends Testbase {

	//pagefactory-Object repository
	@FindBy(name="u")
	WebElement username;
	
	@FindBy(name="p")
	WebElement password;

	@FindBy(xpath="//button[@type='submit']")
	WebElement login;

	//initializing the page objects
	
	public LogInPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		login.click();
		return new HomePage();

	}
	
	
}
