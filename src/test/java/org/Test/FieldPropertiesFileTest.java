package org.Test;

import org.Pages.RegistrationPage;
import org.commonlib.ConfigFileReader;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class FieldPropertiesFileTest extends BaseTest {
	WebDriver driver;

	@Test
	public void verifyRegistration() {
		RegistrationPage obj = new RegistrationPage(BaseTest.driver);
		// RegistrationPage2 obj=PageFactory.initElements(driver,RegistrationPage2.class);
		obj.Registerlink();
		ConfigFileReader CFRF = new ConfigFileReader();
        obj.getFirstname().sendKeys(CFRF.getFirstname());
		obj.getLastname().sendKeys(CFRF.getLastname());
		obj.getPhonenumber().sendKeys(CFRF.getPhoneumber());
		obj.getEmail().sendKeys(CFRF.getEmail());
		obj.getAddress1().sendKeys(CFRF.getAddress1());
		obj.getCity().sendKeys(CFRF.getCity());
		obj.getState().sendKeys(CFRF.getState());
		obj.getPostalcode().sendKeys(CFRF.getPostalcode());
		obj.Country();
		obj.getUsername().sendKeys(CFRF.getUsername());
		obj.getPassword().sendKeys(CFRF.getPassword());
		obj.getConfirmpassword().sendKeys(CFRF.getConfirmpassword());
		obj.Submitbutton();
	}
}
