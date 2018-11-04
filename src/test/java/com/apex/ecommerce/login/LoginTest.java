package com.apex.ecommerce.login;

import org.testng.annotations.Test;

import com.apex.ecommerce.core.ApexBaseTest;
import com.apex.ecommerce.login.page.LoginPage;

public class LoginTest extends ApexBaseTest{
  @Test
  public void login_pass1() {
	  //hi
	 
	  //step 1: Create the page
	  LoginPage page = new LoginPage(driver);
	  //step 2: perform action
	  page.clickOnLoginLink("abc34@gmail.com","abc123");
	  //step 3: assert
  }
}
