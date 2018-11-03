package com.apex.ecommerce.order.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PaymentInformationPage {

	@FindBy(how = How.XPATH, using = "//img[@src='images/continue.gif']")
	WebElement continueButton;

	WebDriver driver;

	public PaymentInformationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public FinalDiscountsPage continuePaymentInformation() {
		continueButton.click();
		return new FinalDiscountsPage(driver);

	}
}
