package org.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLogin extends BaseClass {
	
	public FacebookLogin() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	//Private WebElements  
	
	@FindBy(id="email")
	private WebElement emailtxt;
	
	
	@FindBy(id="pass")
	private WebElement passtxt;
	
		
		@FindBy(name="login")
		private WebElement loginBtn;
		
	
		

	
	//Getters to access those private WebElements outside the class

	public WebElement getLoginBtn() {
			return loginBtn;
		}

	public WebElement getEmailtxt() {
		return emailtxt;
	}

	public WebElement getPasstxt() {
		return passtxt;
	}

 
	
	
}
	
	
	
	
	
	
	


