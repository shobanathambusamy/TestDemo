package com.apex.ecommerce.order.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage {

	@FindBy(how = How.XPATH, using = "//input[@value = 'Add to Cart']")
	WebElement addToCartButton;

	WebDriver driver;

	public ProductDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public ShoppingCartPage addToCart() {
		addToCartButton.click();

		return new ShoppingCartPage(driver);

	}

}
