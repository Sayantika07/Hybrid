package com.capability.qa.testcases;




import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.capability.qa.base.Testbase;
import com.capability.qa.pages.HomePage;
import com.capability.qa.pages.LogInPage;
public class LoginTest extends Testbase{
	LogInPage loginPage;
	HomePage homePage;
public LoginTest() {
	super();
}
	@BeforeMethod
	public void setUp() {
		initialization();
		 loginPage=new LogInPage();
		
	}
	@Test(priority=1)
	public void loginPageTitleTest(){
	String title=loginPage.validateLoginPageTitle();
		Assert.assertEquals(title,"Capability App");
	}
	
	@Test(priority=2)
	public void loginTest() {
	homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
}
