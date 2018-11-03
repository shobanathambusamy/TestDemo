package com.apex.ecommerce.order.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {

	@FindBy(how = How.XPATH, using = "//a/div[text()='Checkout']")
	WebElement checkoutButton;

	WebDriver driver;

	public ShoppingCartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public PersonalDetailsPage checkout() {
		checkoutButton.click();

		return new PersonalDetailsPage(driver);
	}

}
