package com.cjc.cucumber.DemoBlaze.page; //20.01.2023 C-BDD Frame Work Designing

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.cjc.cucumber.DemoBlaze.Utility.CommonUtility;

public class DemoBlaze2Login {
	// This Cucumber Behavior Driven Development Framework Performed On the Demo
	// Blaze Shop Web site
	// TestNG Cucumber Behavior Driven Development Framework Script Created By The
	// Harshit Bisen TB-18B Offline.
	WebDriver driver;
	static Logger log = Logger.getLogger(DemoBlaze2Login.class.getName());
	@FindBy(css = "[id='login2']")
	WebElement loginClick1;

	@FindBy(css = "[id='loginusername']")
	WebElement usernameLogin;

	@FindBy(css = "[id='loginpassword']")
	WebElement passowrdLogin;

	@FindBy(css = "button[onclick='logIn()']")
	@CacheLookup
	WebElement loginClick2;

	public DemoBlaze2Login(WebDriver driver) {
		this.driver = driver;
	}

	public void DemoBlaze2LoginHyperlinkMethod() throws InterruptedException, IOException {
		Thread.sleep(200);
		loginClick1.click();
		Thread.sleep(500);
	}

	public void DemoBlaze2LoginUserName() throws InterruptedException, IOException {
		CommonUtility.signUpMethod();
		String cv1 = CommonUtility.loginName;
		System.out.println("sign up cv1 value = " + cv1);
		usernameLogin.sendKeys(cv1);
		Thread.sleep(500);
	}

	public void DemoBlaze2LoginUserPass() throws InterruptedException, IOException {
		CommonUtility.signUpMethod();
		String cv2 = CommonUtility.loginPass;
		System.out.println("sign up cv2 value = " + cv2);
		passowrdLogin.sendKeys(cv2);
		Thread.sleep(500);
	}

	public void DemoBlaze1loginButtonMethod() throws InterruptedException, IOException {
		loginClick2.click();
		Thread.sleep(1000);
		log.info("User Login");

	}
}
