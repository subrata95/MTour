package org.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class StringFormat {
	WebDriver driver;

	String Registerlink = ".//a[@href='register.php' and text()='%s']";
	String Firstname = ".//input[@name='%s']";
	String Lastname = ".//input[@name='%s']";
	String Phonenumber = ".//input[@name='%s']";
	String Email = ".//input[@name='%s']";
	String Address1 = ".//input[@name='%s']";
	String City = ".//input[@name='%s']";
	String State = ".//input[@name='%s']";
	String Postalcode = ".//input[@name='%s']";
	String Country = ".//select[@name='%s']";
	String Username = ".//input[@name='%s']";
	String Password = ".//input[@name='%s']";
	String Confirmpassword = ".//input[@name='%s']";
	String Submitbutton = ".//input[@name='%s']";

	public StringFormat(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void Registerlink() {
		WebElement RL = driver.findElement(By.xpath(String.format(Registerlink, "REGISTER")));
		RL.click();
	}

	public void setFirstname(String fname) {
		WebElement FN = driver.findElement(By.xpath(String.format(Firstname, "firstName")));
		FN.sendKeys(fname);
	}

	public void setLastname(String lname) {
		WebElement LN = driver.findElement(By.xpath(String.format(Lastname, "lastName")));
		LN.sendKeys(lname);
	}

	public void setPhonenumber(String pnumber) {
		WebElement PN = driver.findElement(By.xpath(String.format(Phonenumber, "phone")));
		PN.sendKeys(pnumber);
	}

	public void setEmail(String email) {
		WebElement E = driver.findElement(By.xpath(String.format(Email, "userName")));
		E.sendKeys(email);
	}

	public void setAddress1(String address) {
		WebElement A = driver.findElement(By.xpath(String.format(Address1, "address1")));
		A.sendKeys(address);
	}

	public void setCity(String city) {
		WebElement C = driver.findElement(By.xpath(String.format(City, "city")));
		C.sendKeys(city);
	}

	public void setState(String state) {
		WebElement S = driver.findElement(By.xpath(String.format(State, "state")));
		S.sendKeys(state);
	}

	public void setPostalcode(String pscode) {
		WebElement PC = driver.findElement(By.xpath(String.format(Postalcode, "postalCode")));
		PC.sendKeys(pscode);
	}

	public void Country() {
		Select drpCountry = new Select(driver.findElement(By.xpath(String.format(Country, "country"))));
		drpCountry.selectByIndex(9);
	}

	public void setUsername(String uname) {
		WebElement UN = driver.findElement(By.xpath(String.format(Username, "email")));
		UN.sendKeys(uname);
	}

	public void setPassword(String pword) {
		WebElement PW = driver.findElement(By.xpath(String.format(Password, "password")));
		PW.sendKeys(pword);
	}

	public void setConfirmpassword(String cpword) {
		WebElement CP = driver.findElement(By.xpath(String.format(Confirmpassword, "confirmPassword")));
		CP.sendKeys(cpword);
	}

	public void Submitbutton() {
		WebElement SB = driver.findElement(By.xpath(String.format(Submitbutton, "submit")));
		SB.click();
	}
}
