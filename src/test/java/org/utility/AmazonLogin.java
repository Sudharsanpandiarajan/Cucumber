package org.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLogin extends BaseClass {
	
	public AmazonLogin() {
			
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath ="//a[contains(@id ,'nav-link-accountList')]")
	private WebElement signIn;
	
	@FindBy(name = "email")
	private WebElement  emailBox;
	
	@FindBy(id="continue")
	private WebElement  continuebtn;
	
	@FindBy(name = "password")
	private WebElement  pass;
	
	
	@FindBy(id="signInSubmit")
	private WebElement signinsubmit;


	public WebElement getSignIn() {
		return signIn;
	}


	public WebElement getEmailBox() {
		return emailBox;
	}


	public WebElement getContinuebtn() {
		return continuebtn;
	}


	public WebElement getPass() {
		return pass;
	}


	public WebElement getSigninsubmit() {
		return signinsubmit;
	}

}
