package com.AkashNittin.TechincalAssessment03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RegisterAction {
	WebDriver driver;
	RegisterLocators locators = null;
	
	public RegisterAction() {
		this.locators = new RegisterLocators();
		PageFactory.initElements(HelperClass.getDriver(),locators);
	}
	
	public void getRegister() {
		locators.register.click();
	}
	public void getGender() {
		locators.gender.click();
	}
	public void setFirstName(String firstname) {
		locators.firstname.sendKeys(firstname);
	}
	public void setLastName(String lastname) {
		locators.lastname.sendKeys(lastname);
	}
	
	public void setEmailid(String emailid) {
		locators.email.sendKeys(emailid);
	}
	public void setPassword(String password) {
		locators.password.sendKeys(password);
	}
	public void setConfirmationPassword(String cpassword) {
		locators.cpassword.sendKeys(cpassword);
	}
	public void getRgisterButton() {
		locators.registerbutton.click();
	}
	public String getConfirmationMessage() {
		return locators.cmessage.getText();
	}
	public void getLogout() {
		locators.logout.click();
	}
	public void registeraction(String) {
		
	}
	
	

}
