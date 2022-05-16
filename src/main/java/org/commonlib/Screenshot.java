package org.commonlib;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	static WebDriver driver;
public static String TakeScreenshot() {
	/*
	 * TakesScreenshot ts=(TakesScreenshot) driver; File
	 * sourceFile=ts.getScreenshotAs(OutputType.FILE); File destFile=new
	 * File("./Screenshot"+filename); try { FileUtils.copyFile(sourceFile,
	 * destFile); } catch (IOException e) { e.printStackTrace(); } return
	 * destFile.getAbsolutePath();
	 */
	  TakesScreenshot ts=(TakesScreenshot) driver; 
	  String base64code=ts.getScreenshotAs(OutputType.BASE64); 
	  return base64code;
}
}
