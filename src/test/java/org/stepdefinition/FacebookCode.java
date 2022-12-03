package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.utility.BaseClass;
import org.utility.FacebookLogin;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class FacebookCode extends BaseClass{
	@Given("To launch the browser and maxi")
	public void to_launch_the_browser_and_maxi() {
	    
		launchTheBrowser();
		
	
		
	}

	@When("To launch the url of the application '")
	public void to_launch_the_url_of_the_application() {
	    
		urlLaunch("https://www.facebook.com/");
		
		
		
	}

	@When("To pass the data to the email box")
	public void to_pass_the_data_to_the_email_box(DataTable dt) {
	    
		FacebookLogin f = new FacebookLogin();
		
		Map<String, String> asMap = dt.asMap(String.class, String.class);
		
		String a = asMap.get("emailtwo");
		
		Assert.assertEquals("Chech the message", "Facebook","facebook");
	
		
		
		passText(f.getEmailtxt(), a);
		
		
	}

	@When("To pass the data to the Password box")
	public void to_pass_the_data_to_the_Password_box(DataTable dt) {
		FacebookLogin f = new FacebookLogin();
		
	
		List<Map<String, String>> asMaps = dt.asMaps(String.class, String.class);
		
		String b = asMaps.get(0).get("password");
		
		passText(f.getPasstxt(), b);
		
		 
	    
	}

	@When("To click the login Btn")
	public void to_click_the_login_Btn() {
		FacebookLogin f = new FacebookLogin();
		
	clickBtn(f.getLoginBtn());
	    
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
	    
		closeTheBrowser();
		
	}
	
	
	
	
	
	
	
	

}
