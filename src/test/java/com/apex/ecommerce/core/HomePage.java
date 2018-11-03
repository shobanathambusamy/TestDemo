package com.apex.ecommerce.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apex.ecommerce.order.page.ProductsPage;

public class HomePage {
	
	@FindBy(linkText= 	HomePageConstant.PRODUCTMENU_LOCATOR)
	WebElement productMenu;
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public ProductsPage clickOnProductsMenu() {
		productMenu.click();
		return new ProductsPage(driver);
	}

}
