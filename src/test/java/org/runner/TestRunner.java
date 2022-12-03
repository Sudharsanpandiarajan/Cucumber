package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.Report;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources", 
glue = "org.stepdefinition" , monochrome = true,
dryRun= false,
snippets = SnippetType.CAMELCASE,
plugin = {"html:target","junit:C:\\Users\\Sudharsan p\\Downloads\\ParthibanAndDeepan\\Junit\\report.xml","json:src\\test\\resources\\jsonreport.json","rerun:src\\test\\resources\\failed.txt"})


public class TestRunner {
	
	
@AfterClass
public static void report() {
	
	Report.createJvmReport("C:\\Users\\Sudharsan p\\Downloads\\ParthibanAndDeepan\\src\\test\\resources\\jsonreport.json");
	
	

}

	// createJvmReport(json file)
	
	// and ====="regression","smoke "
	// or ======="regression , smoke "
	
	
	
}

