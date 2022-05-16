package org.Test;
import org.testng.annotations.Test;
import java.io.FileReader;
import java.io.IOException;
import org.Pages.RegistrationPage;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class ReadJSONDataTest extends BaseTest {
	WebDriver driver;
@Test(dataProvider="json")
	public void VerifyJSONData(String data) {
	    String user[]=data.split(",");
		RegistrationPage RPobj = new RegistrationPage(BaseTest.driver);
		RPobj.Registerlink();
//Argument passed will be used here as String Variable
		RPobj.getFirstname().sendKeys(user[0]);
		RPobj.getLastname().clear();
		RPobj.getLastname().sendKeys(user[1]);
		RPobj.getPhonenumber().sendKeys(user[2]);
		RPobj.getEmail().sendKeys(user[3]);
		RPobj.getAddress1().sendKeys(user[4]);
		RPobj.getCity().sendKeys(user[5]);
		RPobj.getState().sendKeys(user[6]);
		RPobj.getPostalcode().sendKeys(user[7]);
		RPobj.Country();
		RPobj.getUsername().sendKeys(user[8]);
		RPobj.getPassword().sendKeys(user[9]);
		RPobj.getConfirmpassword().sendKeys(user[10]);
		RPobj.Submitbutton();
}
@DataProvider(name="json")
	public String[] readJSON() throws IOException, ParseException {
		JSONParser jsonparser=new JSONParser();
		FileReader reader = new FileReader(".\\Config\\TestData.json");
		Object obj=	jsonparser.parse(reader);
		JSONObject UserRegistrationjsonobj=(JSONObject) obj;
		JSONArray UserRegistrationArray=(JSONArray)UserRegistrationjsonobj.get("UserRegistration");
		String arr[]=new String[UserRegistrationArray.size()];
		for(int i=0;i<UserRegistrationArray.size();i++)
		{
			JSONObject user=(JSONObject)UserRegistrationArray.get(i);
			String Firstname=(String)user.get("Firstname");
			String Lastname=(String)user.get("Lastname");
			String Phonenumber=(String)user.get("Phonenumber");
			String Email=(String)user.get("Email");
			String Address1=(String)user.get("Address");
			String City=(String)user.get("City");
			String State=(String)user.get("State");
			String Postalcode=(String)user.get("Postalcode");
			String Username=(String)user.get("Username");
			String Password=(String)user.get("Password");
			String Confirmpassword=(String)user.get("Confirmpassword");
			arr[i]=Firstname+","+Lastname+","+Phonenumber+","+Email+","+Address1+","+City+","+State+","+Postalcode+","+Username+","+Password+","+Confirmpassword;
		}
		return arr;
	}

		
}