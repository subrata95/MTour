package org.Test;
import org.commonlib.ConfigFileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	static WebDriver driver;
	static Logger logger = LoggerFactory.getLogger(BaseTest.class);
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("MercuryTourSparkExtentReport.html");

	@BeforeMethod
	public void setup() {
		ConfigFileReader CFR = new ConfigFileReader();
		//System.setProperty("webdriver.chrome.driver", CFR.getDriverPath());
		ChromeOptions option=new ChromeOptions(); 
		option.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		option.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		driver = WebDriverManager.chromedriver().capabilities(option).create();
		driver.manage().window().maximize();
		logger.info("Page opened");
		driver.get(CFR.getApplicationUrl());
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("MyReport");
		extent.attachReporter(spark);
	}

	@AfterMethod
	public void Teardown() {
		extent.flush();
		driver.quit();
	}
}