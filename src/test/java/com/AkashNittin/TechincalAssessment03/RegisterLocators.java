package com.AkashNittin.TechincalAssessment03;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterLocators {
	
	
	@FindBy(className="ico-register")
	WebElement register;
	
	@FindBy(id = "gender-male")
	WebElement gender;
	
	@FindBy(id="FirstName")
	WebElement firstname;
	
	@FindBy(id="LastName")
	WebElement lastname;
	
	@FindBy(id = "Email")
	WebElement email;
	
	@FindBy(id = "Password")
	WebElement password;
	
	@FindBy(id="ConfirmPassword")
	WebElement cpassword;

	@FindBy(id="register-button")
	WebElement registerbutton;
	

	@FindBy(xpath="//div[@class='result']")
	WebElement cmessage;
	
	@FindBy(className = "ico-logout")
	WebElement logout;
}
