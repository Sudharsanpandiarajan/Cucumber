package org.stepdefinition;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.utility.BaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends BaseClass {
	
	
	@Before(order = 2)
	public void precondition2() {
		
		
		maxi();
		System.out.println("Maximaize");

	}
	@Before(order= 1)
	public void precondition() {
		
		launchTheBrowser();
		
		System.out.println("Launch the browser");

	}
	
	
	
	
	@After(order = 2)
	public void postCondition2(Scenario s) {
		 
		if (s.isFailed()) {
			
			TakesScreenshot t = (TakesScreenshot)driver;
			byte[] b = t.getScreenshotAs(OutputType.BYTES);
			
			s.embed(b, "image/png");
			
			
			System.out.println("Failed scenario name : "+s.getName());
			
		}
		
		
		
		

	}
	@After(order =1 )
	public void postCondition1() {
		closeTheBrowser();
		System.out.println("Close the browser");

	}
	
	
	

}
