package org.stepdefinition;

import org.utility.AmazonLogin;
import org.utility.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonCode extends BaseClass {
	
	@Given("To launch the browser and url")
	public void to_launch_the_browser_and_url() {
		
		launchTheBrowser();
		
	    
	}
	
	@When("To launch the url")
	public void to_launch_the_url() {
		urlLaunch("https://www.amazon.in/");
	}

	@When("To click the sign in btn")
	public void to_click_the_sign_in_btn() {
	    
		AmazonLogin a = new AmazonLogin();
		
		clickBtn(a.getSignIn());
		
		
	}

	@When("To pass the mobile num")
	public void to_pass_the_mobile_num() {
	    AmazonLogin a = new AmazonLogin();
	    
	    passText(a.getEmailBox(), "8667250947");
		
		
	}

	@When("To click the continue btn")
	public void to_click_the_continue_btn() {
	    AmazonLogin a = new AmazonLogin();
	    
	    clickBtn(a.getContinuebtn());
	    
	}

	@When("To pass the password")
	public void to_pass_the_password() {
	    
		AmazonLogin a = new AmazonLogin();
		
		passText(a.getPass(), "2323");
		
		
	}

	@When("Click the Signin btn")
	public void click_the_Signin_btn() {
	    AmazonLogin a = new AmazonLogin();
	   
	    clickBtn(a.getSigninsubmit());
	    
	    
	    
	    
	}

	@Then("Close the Browser")
	public void close_the_Browser() {
	   closeTheBrowser();
	}


}
