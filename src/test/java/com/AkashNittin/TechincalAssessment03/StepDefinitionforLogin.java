package com.AkashNittin.TechincalAssessment03;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionforLogin {
	
	LoginAction action = new LoginAction();
	LoginUtilityClass util = new LoginUtilityClass(); 

	@Given("User is on the Home Page")
	public void user_is_on_the_home_page() {
	   HelperClass.openPage(util.strUrl);
	}
	@When("clicks the Login Homepage")
	public void clicks_the_login_homepage() {
	    action.login();
	}


	@Then("entering the Email")
	public void entering_the_email() {
		action.setEmail(util.strEmail);
	}

	@Then("entring the password")
	public void entring_the_password() {
		action.setPassword(util.strPassword);
	}

	@Then("clicks the LoginButton")
	public void clicks_the_login_button(){
	   action.logbutton();
	}

	@Then("login is successfull")
	public void login_is_successfull() {
	    
	}

	@Given("user in the home page")
	public void user_in_the_home_page() {
		HelperClass.openPage(util.strUrl);
	}
	
	@When("clicks the Login in Hompage2")
	public void clicks_the_login_in_hompage2() {
		 action.login();
	}

	@Then("entering the inavlidemail <{string}>")
	public void entering_the_inavlidemail(String Invalidemail) {
	    action.setInvaildEmail(Invalidemail);
	}

	@Then("entering the invaildpassword <{string}>")
	public void entering_the_invaildpassword(String Invaildpassword) {
		 action.setInvaildPassword( Invaildpassword);
	}
	  
	@Then("clicks the LoginButton2")
	public void clicks_the_login_button2() {
		 action.logbutton();
	}


	@Then("login is unsuccessfull")
	public void login_is_unsuccessfull() {
	    
	}


}
