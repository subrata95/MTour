package org.Test;

import org.Pages.StringFormat;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class StringFormatTest extends BaseTest{
	WebDriver driver;

	@Test
	public void VerifyRegistrationusingStringFormat() {
		StringFormat SF = new StringFormat(BaseTest.driver);
		SF.Registerlink();
		SF.setFirstname("Suman");
		SF.setLastname("Das");
		SF.setPhonenumber("7895641235");
		SF.setEmail("Test1@yopmail.com");
		SF.setAddress1("Nutan pally Unnayan Samiti");
		SF.setCity("Kolkata");
		SF.setState("WestBengl");
		SF.setPostalcode("700084");
		SF.Country();
		SF.setUsername("Tester6");
		SF.setPassword("12345");
		SF.setConfirmpassword("12345");
		SF.Submitbutton();
	}
}