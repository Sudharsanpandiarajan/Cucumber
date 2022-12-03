package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@C:\\Users\\Sudharsan p\\Downloads\\ParthibanAndDeepan\\src\\test\\resources\\failed.txt",
glue= "org.stepdefinition",
monochrome = true)


public class TestRerunner {

}
