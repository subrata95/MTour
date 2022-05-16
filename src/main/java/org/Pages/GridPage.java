package org.Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class GridPage {
	WebDriver driver;

/* Locators assined to variables*/

/*
 * WebElement Registerlink =
 * driver.findElement(By.xpath("//a[@href='register.php' and text()='REGISTER']"
 * )); WebElement Firstname =
 * driver.findElement(By.xpath("//input[@name='firstName']")); WebElement
 * Lastname = driver.findElement(By.xpath("//input[@name='lastName']"));
 * WebElement Phonenumber =
 * driver.findElement(By.xpath("//input[@name='phone']")); WebElement Email =
 * driver.findElement(By.xpath("//input[@name='userName']")); WebElement
 * Address1 = driver.findElement(By.xpath("//input[@name='address1']"));
 * WebElement City = driver.findElement(By.xpath("//input[@name='city']"));
 * WebElement State = driver.findElement(By.xpath("//input[@name='state']"));
 * WebElement Postalcode =
 * driver.findElement(By.xpath("//input[@name='postalCode']")); WebElement
 * Country=driver.findElement(By.name("country"));//
 * (WebElement.xpath("//select[@name='country']/option[9]")); WebElement
 * Username=driver.findElement(By.xpath("//input[@name='email']")); WebElement
 * Password = driver.findElement(By.xpath("//input[@name='password']"));
 * WebElement Confirmpassword =
 * driver.findElement(By.xpath("//input[@name='confirmPassword']")); WebElement
 * Submitbutton = driver.findElement(By.xpath("//input[@name='submit']"));
 */

/**
 * Parameterized constructor to initiate the driver in focus
 * @param driver
 */

  public GridPage(WebDriver driver) { this.driver=driver; }
 
 /**
  * Method to tap on Registration link
  */ 

 public void Registerlink()
 {  
	 WebElement Registerlink=driver.findElement(By.xpath("//a[@href='register.php' and text()='REGISTER']"));
	 Registerlink.click();
}
public void setFirstname(String fname) 
 {
	WebElement Firstname=driver.findElement(By.xpath("//input[@name='firstName']"));
	Firstname.sendKeys(fname); //driver.findElement(Firstname).sendKeys(fname);
 }
 public void setLastname(String lname) 
 {
	 WebElement Lastname=driver.findElement(By.xpath("//input[@name='lastName']"));
	 Lastname.sendKeys(lname);//driver.findElement(Lastname).sendKeys(lname);
 }
 public void setPhonenumber(String pnumber) 
 {
	 WebElement Phonenumber=driver.findElement(By.xpath("//input[@name='phone']"));
	 Phonenumber.sendKeys(pnumber);//driver.findElement(Phonenumber).sendKeys(pnumber);
 }
 public void setEmail(String email) 
 {
	 WebElement Email=driver.findElement(By.xpath("//input[@name='userName']"));
	 Email.sendKeys(email);
 }
 public void setAddress1(String address) 
 {
	 WebElement Address1=driver.findElement(By.xpath("//input[@name='address1']"));
	 Address1.sendKeys(address);
 }
 public void setCity(String city) 
 {
	 WebElement City=driver.findElement(By.xpath("//input[@name='city']"));
	 City.sendKeys(city);
 }
 public void setState(String state) 
 {
	 WebElement State=driver.findElement(By.xpath("//input[@name='state']"));
	 State.sendKeys(state);
 }
 public void setPostalcode(String pscode) 
 {
	WebElement Postalcode=driver.findElement(By.xpath("//input[@name='postalCode']")); 
	Postalcode.sendKeys(pscode);
}
 public void Country() 
 {
	 WebElement Country=driver.findElement(By.name("country"));//(WebElement.xpath("//select[@name='country']/option[9]"));
	 Select drpCountry = new Select(Country);
	 drpCountry.selectByIndex(9);
}
 public void setUsername(String uname) 
 {
	 WebElement Username=driver.findElement(By.xpath("//input[@name='email']"));
	 Username.sendKeys(uname);
}
 public void setPassword(String pword) 
 {
	 WebElement Password=driver.findElement(By.xpath("//input[@name='password']"));
	 Password.sendKeys(pword);
}
 public void setConfirmpassword(String cpword) 
 {
	WebElement Confirmpassword=driver.findElement(By.xpath("//input[@name='confirmPassword']"));
	Confirmpassword.sendKeys(cpword);
}
 public void Submitbutton() 
 {
    WebElement Submitbutton=driver.findElement(By.xpath("//input[@name='submit']"));
    Submitbutton.click();
}
}

