package com.apex.ecommerce.login.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apex.ecommerce.core.ApexBasePage;
import com.apex.ecommerce.core.HomePage;
import com.apex.ecommerce.login.LoginConstant;
import com.apex.ecommerce.registration.page.RegistrationPage;

public class LoginPage extends ApexBasePage {

	@FindBy(id = LoginConstant.EMAILID_LOCATOR)
	WebElement email;
	@FindBy(id = LoginConstant.PASSWORDID_LOCATOR)
	WebElement password;

	WebDriver driver;

	@FindBy(id = LoginConstant.LOGINBUTTON_LOCATOR)
	WebElement loginButton;

	@FindBy(linkText = LoginConstant.SIGNUP_LOCATOR)
	WebElement signUpLink;

	String url = "http://www.ecommerce.saipratap.net/customerlogin.php";

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		driver.get(url);
		PageFactory.initElements(driver, this);

	}

	public HomePage clickOnLoginLink(String emailID, String pwd) {
		email.sendKeys(emailID);
		password.sendKeys(pwd);
		loginButton.submit();
		return new HomePage(driver);

	}

	public RegistrationPage clickOnSignupLink() {
		signUpLink.click();
		return new RegistrationPage(driver);
	}

}
