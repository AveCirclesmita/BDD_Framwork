package com.cjc.cucumber.DemowebShop.page; //DemowebShop3 18.01.2023 HDF Framework Designing

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cjc.cucumber.DemowebShop.Utility.CommonUtility;

public class LoginPage {

	WebDriver driver;
	Logger log = Logger.getLogger(LoginPage.class.getName());

	@FindBy(xpath = "//a[@class='ico-login']")
	WebElement login;
	@FindBy(xpath = "//input[@class='email']")
	WebElement email1;
	@FindBy(xpath = "//input[@name='Password']")
	WebElement password1;
	@FindBy(css = "#RememberMe")
	WebElement RememberMe;
	@FindBy(xpath = "//input[@class='button-1 login-button']")
	WebElement loginClick;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void loginClickHyperlinkMethod() throws InterruptedException, IOException {
		Thread.sleep(1500);
		login.click();
	}

	public void loginEnterUserNameMethod() throws InterruptedException, IOException {
		CommonUtility.registrationMethod();
		String cv1 = CommonUtility.loginUsername;
		System.out.println("Login Username = " + cv1);
		Thread.sleep(1500);
		email1.sendKeys(cv1);
	}

	public void loginEnterPasswordMethod() throws InterruptedException, IOException {
		CommonUtility.registrationMethod();
		String cv2 = CommonUtility.loginPassword;
		System.out.println("Login Password = " + cv2);
		Thread.sleep(500);
		password1.sendKeys(cv2);
	}

	public void loginClickRemebermeCheckboxMethod() throws InterruptedException, IOException {
		Thread.sleep(500);
		RememberMe.click();
	}

	public void loginClickButtonMethod() throws InterruptedException, IOException {
		Thread.sleep(1000);
		loginClick.click();

	}

	public void loginSuccessMethod() throws InterruptedException {
		Thread.sleep(500);
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("scrollBy(0,500)");
		log.info("Login Check Is Successful");
	}

}
