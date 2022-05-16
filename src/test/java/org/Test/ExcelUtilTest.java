package org.Test;
import org.commonlib.TestUtil;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import java.util.ArrayList;
import java.util.Iterator;
import org.Pages.RegistrationPage;

public class ExcelUtilTest extends BaseTest {

	@Test(dataProvider = "getTestData")
	public void VeifyRegistrationPage(String Firstname, String Lastname, String Phonenumber, String Email,
			String Address1, String City, String State, String Postalcode, String Country, String Username,
			String Password, String Confirmpassword) {
		ExtentTest Test=extent.createTest("Read File from Excel").assignAuthor("Subrata").assignCategory("Regression").assignDevice("Chrome");
		Test.log(Status.PASS, "Registration Successful");
		RegistrationPage RPobj = new RegistrationPage(driver);
		RPobj.Registerlink();
//Argument passed will be used here as String Variable
		RPobj.getFirstname().sendKeys(Firstname);
		RPobj.getLastname().clear();
		RPobj.getLastname().sendKeys(Lastname);
		RPobj.getPhonenumber().sendKeys(Phonenumber);
		RPobj.getEmail().sendKeys(Email);
		RPobj.getAddress1().sendKeys(Address1);
		RPobj.getCity().sendKeys(City);
		RPobj.getState().sendKeys(State);
		RPobj.getPostalcode().sendKeys(Postalcode);
		RPobj.Country();
		RPobj.getUsername().sendKeys(Username);
		RPobj.getPassword().sendKeys(Password);
		RPobj.getConfirmpassword().sendKeys(Confirmpassword);
		RPobj.Submitbutton();
	}

	@DataProvider
	public Iterator<Object[]> getTestData() {
		ArrayList<Object[]> testdata = TestUtil.getDataFromExcel();
		return testdata.iterator();
	}

}
