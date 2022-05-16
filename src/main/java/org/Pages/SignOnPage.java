package org.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignOnPage {
	WebDriver driver;
	By Registerlink = (By.xpath("//a[@href='login.php' and text()='SIGN-ON']"));
	By Username = (By.name("userName"));
	By Password = (By.name("password"));
	By Submitbutton = (By.name("submit"));

	public SignOnPage(WebDriver driver) {
		this.driver = driver;
	}

	public void Registerlink() {
		driver.findElement(Registerlink).click();
	}

	public void setUsername(String uname) {
		driver.findElement(Username).sendKeys(uname);
	}

	public void setPassword(String pword) {
		driver.findElement(Password).sendKeys(pword);
	}

	public void Submitbutton() {
		driver.findElement(Submitbutton).click();
	}
}
