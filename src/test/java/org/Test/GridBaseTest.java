/*package org.Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.commonlib.ConfigFileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;

public class GridBaseTest {
	static WebDriver driver;
public WebDriver openbrowser(String browser) throws MalformedURLException {
	ConfigFileReader CFR = new ConfigFileReader();
	String url=CFR.gethuburl();
	DesiredCapabilities dc=new DesiredCapabilities();
	if(browser.equalsIgnoreCase("chrome")) {
		dc.setBrowserName("chrome");
		driver=new RemoteWebDriver(new URL(url),dc);
	}else if(browser.equalsIgnoreCase("firefox")) {
		dc.setBrowserName("firefox");
		driver=new RemoteWebDriver(new URL(url),dc);
	}else if(browser.equalsIgnoreCase("edge")) {
		dc.setBrowserName("MicrosoftEdge");
		driver=new RemoteWebDriver(new URL(url),dc);
	}
    driver= new RemoteWebDriver(new URL(url),dc);
    driver.manage().window().maximize();
	driver.get(CFR.getApplicationUrl());
	return driver;
}
	@AfterMethod
	public void Teardown() {
		driver.quit();
	}
}*/
