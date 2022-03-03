package com.Cucumber.Rrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Cucu_BDD_BaseClass.Cucu_BDD_BaseClass;

//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;

import  io.cucumber.junit.*;
@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\test\\java\\com\\Cucuadactin\\feature\\adactin.feature",
	glue ="com.StepDefinition",
	monochrome = true, 
	
	dryRun = false,
	
	publish = true, 
	
	plugin = {
			"html:Cucumberoutput/Html_Report",
			"pretty",
			"json:Cucumberoutput/JsonReport.json",
			//"com.cucumber.listener.ExtentCucumberFormatter:ExtentRport/extentsreport.html",	
}
	)
public class Test_Runner {
	
	public static WebDriver driver;
	 @BeforeClass
	public static void  set_Up() {
		driver= Cucu_BDD_BaseClass.getBrowser("chrome");
		 
	 }
	 @AfterClass
	public static void tear_Down() {
		driver.close();
	}
	 
}
