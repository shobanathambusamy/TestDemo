package com.apex.ecommerce.order.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apex.ecommerce.order.OrderConfirmationConstant;

public class OrderConfirmationPage {

	@FindBy(className = OrderConfirmationConstant.PAGETITLE_LOCATOR)
	WebElement pageName;

	WebDriver driver;

	public OrderConfirmationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String getPageTitle() {

		return pageName.getText();
	}

}
