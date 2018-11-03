package com.apex.ecommerce.order.page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.apex.ecommerce.order.DeliveryInformationConstant;

public class DeliveryInformationPage {

	@FindBy(id = DeliveryInformationConstant.SHIPPINGOPTIONS_LOCATOR)
	List<WebElement> shippingOptions;

	@FindBy(how = How.XPATH, using = "//img[@src='images/continue.gif']")
	WebElement continueButton;

	WebDriver driver;

	public DeliveryInformationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void setShippingOptions(int option) {
		shippingOptions.get(option).click();
	}

	public PaymentInformationPage continueDelivery() {
		continueButton.click();
		return new PaymentInformationPage(driver);
	}

}
