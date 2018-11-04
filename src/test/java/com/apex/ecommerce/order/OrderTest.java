package com.apex.ecommerce.order;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.apex.ecommerce.core.ApexBaseTest;
import com.apex.ecommerce.core.HomePage;
import com.apex.ecommerce.login.page.LoginPage;
import com.apex.ecommerce.order.page.DeliveryInformationPage;
import com.apex.ecommerce.order.page.FinalDiscountsPage;
import com.apex.ecommerce.order.page.OrderConfirmationPage;
import com.apex.ecommerce.order.page.PaymentInformationPage;
import com.apex.ecommerce.order.page.PersonalDetailsPage;
import com.apex.ecommerce.order.page.ProductDetailsPage;
import com.apex.ecommerce.order.page.ProductsPage;
import com.apex.ecommerce.order.page.ShoppingCartPage;

public class OrderTest extends ApexBaseTest {
	
	//hi
	@Test
	public void orderSummaryTest() {
//hi
		// step 1: Create the page
		LoginPage page = new LoginPage(driver);
		// step 2: perform action
		HomePage homePage = page.clickOnLoginLink("abc34@gmail.com", "abc123");

		ProductsPage productsPage = homePage.clickOnProductsMenu();
		ProductDetailsPage detailsPage = productsPage.selectProduct("Dell Inspiron 19R");
		ShoppingCartPage cartPage = detailsPage.addToCart();
		PersonalDetailsPage personalDetailsPage = cartPage.checkout();
		DeliveryInformationPage deilveryPage = personalDetailsPage.confirmPersonalDetails();
		deilveryPage.setShippingOptions(4);
		PaymentInformationPage paymentPage = deilveryPage.continueDelivery();
		FinalDiscountsPage discountsPage = paymentPage.continuePaymentInformation();

		OrderConfirmationPage confirmationPage = discountsPage.continueFinalDiscounts();
		// step 3: assert
		Assert.assertEquals(confirmationPage.getPageTitle(), "Order Confirmation");

	}
}
