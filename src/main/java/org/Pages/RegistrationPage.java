package org.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	WebDriver driver;

	@FindBy(xpath = "//a[@href='register.php' and text()='REGISTER']")
	WebElement Registerlink;

	@FindBy(name = "firstName")
	WebElement Firstname;

	@FindBy(name = "lastName")
	WebElement Lastname;

	@FindBy(name = "phone")
	WebElement Phonenumber;

	@FindBy(name = "userName")
	WebElement Email;

	@FindBy(name = "address1")
	WebElement Address1;

	@FindBy(name = "city")
	WebElement City;

	@FindBy(name = "state")
	WebElement State;

	@FindBy(name = "postalCode")
	WebElement Postalcode;

	@FindBy(xpath = "//select[@name='country']/option[9]")
	WebElement Country;

	@FindBy(name = "email")
	WebElement Username;

	@FindBy(name = "password")
	WebElement Password;

	@FindBy(name = "confirmPassword")
	WebElement Confirmpassword;

	@FindBy(name = "submit")
	WebElement Submitbutton;

	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void Registerlink() {
		Registerlink.click();
	}

	public WebElement getFirstname() {
		return Firstname;
	}

	public WebElement getLastname() {
		return Lastname;
	}

	public WebElement getPhonenumber() {
		return Phonenumber;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getAddress1() {
		return Address1;
	}

	public WebElement getCity() {
		return City;
	}

	public WebElement getState() {
		return State;
	}

	public WebElement getPostalcode() {
		return Postalcode;
	}

	public void Country() {
		Country.click();
	}

	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getConfirmpassword() {
		return Confirmpassword;
	}

	public void Submitbutton() {
		Submitbutton.click();
	}

}
