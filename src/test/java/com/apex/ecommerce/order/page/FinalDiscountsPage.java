package com.apex.ecommerce.order.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FinalDiscountsPage {

	@FindBy(how = How.XPATH, using = "//img[@src='images/continue.gif']")
	WebElement continueButton;

	WebDriver driver;

	public FinalDiscountsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public OrderConfirmationPage continueFinalDiscounts() {
		continueButton.click();
		return new OrderConfirmationPage(driver);

	}

}
