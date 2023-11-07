package com.AkashNittin.TechincalAssessment03;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginLocators {

	
	@FindBy(className ="ico-login")
	WebElement Login;
	
	@FindBy(id = "Email")
	WebElement EmailId;
	
	@FindBy(id = "Password")
	WebElement password;
	
	@FindBy(className = "button-1 login-button")
	WebElement LogInButton;
	
	@FindBy(xpath = "//a[@class='account']")
	WebElement verifylogin;
}
