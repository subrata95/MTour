package org.Test;

import org.testng.annotations.Test;
import org.Pages.SignOnPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignOnTest {
	WebDriver driver;

	@Test
	public void VerifySignOn() {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
		SignOnPage SOPobj = new SignOnPage(driver);
		SOPobj.Registerlink();
		SOPobj.setUsername("Tester5");
		SOPobj.setPassword("12345");
		SOPobj.Submitbutton();
		if (driver.getPageSource().contains("Login Successfully")) {
			System.out.println("Text is Present");
		} else {
			System.out.println("Text is absent");
		}
		driver.close();
	}
}