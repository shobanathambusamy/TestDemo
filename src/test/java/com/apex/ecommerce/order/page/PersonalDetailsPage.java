package com.apex.ecommerce.order.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PersonalDetailsPage {

	@FindBy(how = How.XPATH, using = "//a/img[@src='images/continue.gif']")
	WebElement continueButton;

	WebDriver driver;

	public PersonalDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public DeliveryInformationPage confirmPersonalDetails() {
		continueButton.click();
		return new DeliveryInformationPage(driver);
	}

}
