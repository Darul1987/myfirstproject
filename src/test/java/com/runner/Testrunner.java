package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.masterthought.cucumber.ReportBuilder;

@RunWith(Cucumber.class)
@CucumberOptions(stepNotifications=true ,publish=true,dryRun=false,monochrome=true,plugin= {"usage","json:target\\index.json"},name= "verifying omr login with valid data",glue = "com.stepdefinition",features="src\\test\\resources")
public class Testrunner {
	@AfterClass
	public static void afterclass() {
		Reporting.generateJVMReport("C:\\Users\\Tawfiq\\eclipse-workspace\\Cucumber1\\target\\index.json");
	

	}
	
	
	
	

}
