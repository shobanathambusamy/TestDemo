package com.apex.ecommerce.registration;

import org.testng.annotations.Test;

import com.apex.ecommerce.core.ApexBaseTest;
import com.apex.ecommerce.login.page.LoginPage;
import com.apex.ecommerce.registration.page.RegistrationPage;

public class RegistrationTest extends ApexBaseTest {
	//hi
	@Test
	public void registrationTest_pass1() {

		// step 1: Create the page
		LoginPage loginPage = new LoginPage(driver);

		// step 2: perform action

		RegistrationPage regPage = loginPage.clickOnSignupLink();
		regPage.setGender(1);
		regPage.setFirstName("John");
		regPage.setLastName("Smith");
		regPage.setDay("09");
		regPage.setMonth("08");
		regPage.setYear("1990");
		String generateEmail = "johnsmith@gmail.com" + Math.random();
		regPage.setEmail(generateEmail.substring(0, 22));
		regPage.setHouseNo("10");
		regPage.setAdd1("981, N wolfe road");
		regPage.setCity("santa clara");
		regPage.setState("CA");
		regPage.setPostCode("94086");
		regPage.setCountry("USA");
		regPage.setPhone("23232323323");
		regPage.setFax("34343434");
		regPage.setPassword("abc23456");
		regPage.setCpassword("abc23456");
		regPage.submitRegistrationDetails();

	}
}
