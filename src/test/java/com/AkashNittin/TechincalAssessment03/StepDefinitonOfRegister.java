package com.AkashNittin.TechincalAssessment03;



import java.util.List;
import java.util.Map;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitonOfRegister {
	String url ="https://demowebshop.tricentis.com/";
	RegisterAction register = new RegisterAction();

	@Given("user is on homepage")
	public void user_is_on_homepage() {
	    HelperClass.openPage(url);
	}

	@When("user clicks on Register")
	public void user_clicks_on_register() {
	   register.getRegister();
	}

	@Then("user selects the gender")
	public void user_selects_the_gender() {
	    register.getGender();
	}

	@Then("user enters the firstname")
	public void user_enters_the_firstname(io.cucumber.datatable.DataTable datatable) {
		List<Map<String,String>> signUpForm = datatable.asMaps(String.class, String.class);
	    for(Map<String,String> form : signUpForm) {
	    	String firstname = form.get("firstname");
	    	register.setFirstName(firstname);
	    	}
	}

	@Then("user enters the lastname")
	public void user_enters_the_lastname(io.cucumber.datatable.DataTable datatable) {
		List<Map<String,String>> signUpForm = datatable.asMaps(String.class, String.class);
	    for(Map<String,String> form : signUpForm) {
	    	String lastname = form.get("lastname");
	    	register.setLastName(lastname);
	    	}
	}

	@Then("user enters the emailid")
	public void user_enters_the_emailid(io.cucumber.datatable.DataTable datatable) {
		List<Map<String,String>> signUpForm = datatable.asMaps(String.class, String.class);
	    for(Map<String,String> form : signUpForm) {
	    	String emailid = form.get("emailid");
	    	register.setEmailid(emailid);
	    	}
	}

	@Then("user enters the password")
	public void user_enters_the_password(io.cucumber.datatable.DataTable datatable) {
		List<Map<String,String>> signUpForm = datatable.asMaps(String.class, String.class);
	    for(Map<String,String> form : signUpForm) {
	    	String password = form.get("password");
	    	register.setPassword(password);
	    	}
	}

	@Then("user enters the confirmpassword")
	public void user_enters_the_confirmpassword(io.cucumber.datatable.DataTable datatable) {
		List<Map<String,String>> signUpForm = datatable.asMaps(String.class, String.class);
	    for(Map<String,String> form : signUpForm) {
	    	String cpassword = form.get("cpassword");
	    	register.setConfirmationPassword(cpassword);
	    	}
	}

	@Then("user clicks the registerbutton")
	public void user_clicks_the_registerbutton() {
	   register.getRegister();
	}

	@Then("user gets the confirmation message")
	public void user_gets_the_confirmation_message() {
	   Assert.assertEquals(register.getConfirmationMessage(),"Your registration completed");
	   }

	@Then("user clicks the logout")
	public void user_clicks_the_logout() {
	    register.getLogout();
	}
}
