package org.stepdefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Report {
	
	public static void createJvmReport(String jsonfile) {
		
		
		// mention  the path loaction of the Jvm report
		File f = new File("C:\\Users\\Sudharsan p\\Downloads\\ParthibanAndDeepan\\JvmReport");
		
	
		// object
		
		Configuration c = new Configuration(f, "Facebook and Amazon");
		
		
		c.addClassifications("Platform", "Windows 11");
		c.addClassifications("Sprint ", "3");
		c.addClassifications("Browser", "ChromeBrowser");
		
		// add json file
		List<String> li = new ArrayList<String>();
		li.add(jsonfile);
		
		// 
		
		ReportBuilder  r = new ReportBuilder(li, c);
		
		r.generateReports();
		
		
		
		
		
		
		
		
		
	}
	

}
