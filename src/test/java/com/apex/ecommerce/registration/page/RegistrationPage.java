package com.apex.ecommerce.registration.page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.apex.ecommerce.registration.RegistrationConstant;

public class RegistrationPage {

	@FindBy(how = How.CSS, using = "input[name = 'radiobutton']")
	List<WebElement> gender;
	@FindBy(id = RegistrationConstant.FIRSTNAME_LOCATOR)
	WebElement firstName;
	@FindBy(id = RegistrationConstant.LASTNAME_LOCATOR)
	WebElement lastName;
	@FindBy(id = RegistrationConstant.DAY_LOCATOR)
	WebElement day;
	@FindBy(id = RegistrationConstant.MONTH_LOCATOR)
	WebElement month;
	@FindBy(id = RegistrationConstant.YEAR_LOCATOR)
	WebElement year;
	@FindBy(id = RegistrationConstant.EMAIL_LOCATOR)
	WebElement email;
	@FindBy(id = RegistrationConstant.HOUSENO_LOCATOR)
	WebElement houseNo;
	@FindBy(id = RegistrationConstant.ADD1_LOCATOR)
	WebElement add1;
	@FindBy(id = RegistrationConstant.CITY_LOCATOR)
	WebElement city;
	@FindBy(id = RegistrationConstant.STATE_LOCATOR)
	WebElement state;
	@FindBy(id = RegistrationConstant.POSTCODE_LOCATOR)
	WebElement postCode;
	@FindBy(id = RegistrationConstant.COUNTRY_LOCATOR)
	WebElement country;
	@FindBy(id = RegistrationConstant.PHONE_LOCATOR)
	WebElement phone;
	@FindBy(id = RegistrationConstant.FAX_LOCATOR)
	WebElement fax;
	@FindBy(id = RegistrationConstant.PASSWORD_LOCATOR)
	WebElement password;
	@FindBy(id = RegistrationConstant.CPASSWORD_LOCATOR)
	WebElement cpassword;
	@FindBy(id = RegistrationConstant.TERMS_LOCATOR)
	WebElement terms;
	@FindBy(name = RegistrationConstant.SUBMIT_LOCATOR)
	WebElement submit;

	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void submitRegistrationDetails() {
		terms.click();
		submit.submit();
	}

	public void setFirstName(String firstName) {
		this.firstName.sendKeys(firstName);
	}

	public void setLastName(String lastName) {
		this.lastName.sendKeys(lastName);
	}

	public void setDay(String day) {
		this.day.sendKeys(day);
	}

	public void setMonth(String month) {
		this.month.sendKeys(month);
	}

	public void setYear(String year) {
		this.year.sendKeys(year);
	}

	public void setEmail(String email) {
		this.email.sendKeys(email);
	}

	public void setHouseNo(String houseNo) {
		this.houseNo.sendKeys(houseNo);
	}

	public void setAdd1(String add1) {
		this.add1.sendKeys(add1);
	}

	public void setCity(String city) {
		this.city.sendKeys(city);
	}

	public void setState(String state) {
		this.state.sendKeys(state);
	}

	public void setPostCode(String postCode) {
		this.postCode.sendKeys(postCode);
	}

	public void setCountry(String country) {
		this.country.sendKeys(country);
	}

	public void setPhone(String phone) {
		this.phone.sendKeys(phone);
	}

	public void setFax(String fax) {
		this.fax.sendKeys(fax);
	}

	public void setPassword(String password) {
		this.password.sendKeys(password);
	}

	public void setCpassword(String cpassword) {
		this.cpassword.sendKeys(cpassword);
	}

	public void setGender(int genderValue) {
		gender.get(genderValue).click();
	}

}
