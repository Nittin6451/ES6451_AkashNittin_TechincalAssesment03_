package com.AkashNittin.TechincalAssessment03;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class RegisterHookClass {

	

		@Before
		public void setup() {
			HelperClass.setUpDriver();
		}
//		@After
//		public static void tearDown(Scenario scenario) {
//			if(scenario.isFailed()) {
//				final byte[] screenshot = ((TakesScreenshot) RegisterHelperClass.getDriver()).getScreenshotAs(OutputType.BYTES);
//				scenario.attach(screenshot,"image/png",scenario.getName());
//			}
//			RegisterHelperClass.tearDown();
//		}

				
	}

