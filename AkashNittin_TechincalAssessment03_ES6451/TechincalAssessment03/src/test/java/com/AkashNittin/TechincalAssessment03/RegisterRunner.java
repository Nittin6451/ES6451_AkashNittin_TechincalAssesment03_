package com.AkashNittin.TechincalAssessment03;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\aricharddaniel\\eclipse-workspace\\AkashNittin_TechincalAssessment03_ES6451\\TechincalAssessment03\\src\\test\\resources\\Feature\\Register.feature",glue ="TechincalAssessment03",plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
		"junit:target/cucumber-reports/Cucumber.xml",
		"html:target/cucumber-reports/cucumber.html"})

public class RegisterRunner {

}

