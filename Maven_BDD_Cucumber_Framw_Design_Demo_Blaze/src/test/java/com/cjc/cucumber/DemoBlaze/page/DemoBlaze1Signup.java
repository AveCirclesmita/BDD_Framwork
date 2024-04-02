package com.cjc.cucumber.DemoBlaze.page; //20.01.2023 C-BDD Frame Work Designing

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.cjc.cucumber.DemoBlaze.Utility.CommonUtility;

public class DemoBlaze1Signup {
	// This Cucumber Behavior Driven Development Framework Performed On the Demo
	// Blaze Shop Web site
	// TestNG Cucumber Behavior Driven Development Framework Script Created By The
	// Harshit Bisen TB-18B Offline.
	WebDriver driver;
	static Logger log = Logger.getLogger(DemoBlaze1Signup.class.getName());

	@FindBy(css = "[id='signin2']")
	WebElement signupClick1;

	@FindBy(css = "[id='sign-username']")
	WebElement usernameSignup;

	@FindBy(css = "[id='sign-password']")
	WebElement passowrdSignup;

	@FindBy(css = "button[onclick='register()']")
	@CacheLookup
	WebElement signUpClick2;

	public DemoBlaze1Signup(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void DemoBlaze1SignupHyperlinkMethod() throws InterruptedException, IOException {
		signupClick1.click();
		Thread.sleep(500);
	}
	public void DemoBlaze1SignupUserName() throws InterruptedException, IOException {
		CommonUtility.signUpMethod();
		String cv1 = CommonUtility.signUpName;
		System.out.println("sign up cv1 value = " + cv1);
		usernameSignup.sendKeys(cv1);
		Thread.sleep(500);
	}
	public void DemoBlaze1SignupUserPass() throws InterruptedException, IOException {
		CommonUtility.signUpMethod();
		String cv2 = CommonUtility.signUpPass;
		System.out.println("sign up cv2 value = " + cv2);
		passowrdSignup.sendKeys(cv2);
		Thread.sleep(1000);
	}
	public void DemoBlaze1SignupButtonMethod() throws InterruptedException, IOException {
		signUpClick2.click();
		Thread.sleep(1500);
	}
	public void DemoBlaze1SignupAlertMethod() throws InterruptedException, IOException {
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
	}

}
