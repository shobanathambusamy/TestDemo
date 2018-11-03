package com.apex.ecommerce.order.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
	WebDriver driver;

	public ProductsPage(WebDriver driver) {
		this.driver = driver;
	}

	public ProductDetailsPage selectProduct(String productName) {

		driver.findElement(By.xpath("//div[contains(text(),'" + productName + "')]//img[@src='images/buynow.jpg']"))
				.click();

		return new ProductDetailsPage(driver);

	}

}
