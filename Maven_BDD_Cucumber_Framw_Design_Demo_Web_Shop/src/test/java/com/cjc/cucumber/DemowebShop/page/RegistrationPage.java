package com.cjc.cucumber.DemowebShop.page;  //DemowebShop1 21.01.2023 BDD Cucumber Framework designing


import java.io.IOException;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.cjc.cucumber.DemowebShop.Utility.CommonUtility;


public class RegistrationPage {

		WebDriver driver;
			
		static Logger log = Logger.getLogger(RegistrationPage.class.getName());

		@FindBy(css = "input#gender-male")
		WebElement gender1;
		@FindBy(css = "input#FirstName")
		WebElement firstName1;
		@FindBy(css = "input[name^='L']")
		WebElement lastName1;
		@FindBy(css = "input[name='Email']")
		WebElement email1;
		@FindBy(css = "input[name$='d']")
		WebElement password1;
		@FindBy(css = "input[name*='C']")
		WebElement cpassword;
		@FindBy(css = "input[name*='re']")
		@CacheLookup
		WebElement registration1;

		public RegistrationPage(WebDriver driver)throws IOException{
			this.driver = driver;
		}

		public void registerGenderClickButtonMethod() throws InterruptedException, IOException {
			gender1.click();
			Thread.sleep(500);
		}
			
		public void registerEnterFirstNameMethod() throws InterruptedException, IOException {	
			CommonUtility.registrationMethod();
			String cv1 = CommonUtility.fname;
			System.out.println("Registration First Name = "+cv1);
			firstName1.sendKeys(cv1);  
			Thread.sleep(500);
		}
		
		public void registerEnterLastNameMethod() throws InterruptedException, IOException {	
			CommonUtility.registrationMethod();
			String cv2 = CommonUtility.lname;
			System.out.println("Registration Last Name = "+cv2);
			lastName1.sendKeys(cv2);     
			Thread.sleep(500);
		}	
		
		public void registerEnterEmailMethod() throws InterruptedException, IOException {	
			CommonUtility.registrationMethod();
			String cv3 = CommonUtility.email;
			System.out.println("Registration Email = "+cv3);
			email1.sendKeys(cv3);           
			Thread.sleep(500);
		}
		
		public void registerEnterPasswordMethod() throws InterruptedException, IOException {	
			CommonUtility.registrationMethod();
			String cv4 = CommonUtility.password;
			System.out.println("Registration Password = "+cv4);
			password1.sendKeys(cv4);         
			Thread.sleep(500);
		}
		
		public void registerEnterConfirmPasswordMethod() throws InterruptedException, IOException {	
			CommonUtility.registrationMethod();
			String cv5 = CommonUtility.cPassword;
			System.out.println("Registration Confirm Password = "+cv5);
			cpassword.sendKeys(cv5);           
			Thread.sleep(500);
		}	
			
		public void registerClickRegisterButtonMethod() throws InterruptedException, IOException {		
			registration1.click();
			log.info("Registration Check Is Successful");
		}
}
