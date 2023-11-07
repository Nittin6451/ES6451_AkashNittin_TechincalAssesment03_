package com.AkashNittin.TechincalAssessment03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginUtilityClass {
	
	String strEmail,strPassword,strUrl;
	public LoginUtilityClass() {
		login2();
	}
	public void login2(){
	File file = new File("C:\\Users\\aricharddaniel\\eclipse-workspace\\AkashNittin_TechincalAssessment03_ES6451\\TechincalAssessment03\\src\\test\\resources\\Feature\\data.properties");
	FileInputStream fileInput = null;
	try {
		fileInput = new FileInputStream(file);
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	Properties prop = new Properties();
	try {
		prop.load(fileInput);
	}catch(IOException e) {
		e.printStackTrace();
	}
	strUrl = prop.getProperty("url");
	strEmail = prop.getProperty("email");
	strPassword = prop.getProperty("password");
	}
}
