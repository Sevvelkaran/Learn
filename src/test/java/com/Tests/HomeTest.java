package com.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class HomeTest extends BaseTest {
	com.Pages.HomePage objHome;
	 @Test(priority = 0)
	  public void loginTest() {
		  objHome=new com.Pages.HomePage(driver);
		  String loginPageTitle=objHome.getLoginPageText();
		  Assert.assertTrue(loginPageTitle.contains("Welcome to the new Tricentis store!"));
	  }

}
