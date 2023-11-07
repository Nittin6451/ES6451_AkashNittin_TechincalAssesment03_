package com.AkashNittin.TechincalAssessment03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class LoginAction {

	 WebDriver driver;
	 LoginLocators locator = null;
	 
	 public LoginAction(){
		 this.locator = new LoginLocators();
		 PageFactory.initElements(HelperClass.getDriver(),locator);
	 }
	 public void logbutton() {
		 locator.Login.click();
	}
	  
	  public void setEmail(String strEmail) {
		  locator.EmailId.sendKeys(strEmail);
	}
	  
	  public void setPassword(String strPassword) {
		  locator.password.sendKeys(strPassword);
	}
	 public void setInvaildEmail(String Invalidemail) {
		 locator.EmailId.sendKeys(Invalidemail);
	 }
	 
	 public void setInvaildPassword(String Invalidpassword) {
		 locator.password.sendKeys(Invalidpassword);
	 }
	  
	  public void login() {
		  locator.LogInButton.click();
	}
	  
	 
	 
	 
}
