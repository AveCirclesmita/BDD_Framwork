package com.cjc.cucumber.Magento.page;  //DemowebShop1 21.01.2023 BDD Cucumber Framework designing


import java.io.IOException;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.cjc.cucumber.Magento.Utility.CommonUtility;




public class RegistrationPage_Magento
{

	 
		WebDriver driver;
			
		static Logger log = Logger.getLogger(RegistrationPage_Magento.class.getName());

		
		@FindBy(css = "input#firstname")
		WebElement firstName1;
		@FindBy(css = "input#lastname")
		WebElement lastName1;
		@FindBy(css = "input[name='email']")
		WebElement email1;
		@FindBy(css = "input[name='password']")
		WebElement password1;
		@FindBy(css = "input[name='password_confirmation']")
		WebElement cpassword;
		@FindBy(css = "button[class=\"action submit primary\"]")
		@CacheLookup
		WebElement registration1;
		@CacheLookup
		@FindBy(css = "button[data-action='customer-menu-toggle']")
		WebElement Account;
		
		@CacheLookup
		@FindBy(css="body > div.page-wrapper > header > div.panel.wrapper > div > ul > li.customer-welcome.active > div > ul > li.authorization-link > a")
		WebElement logout;
		
		
		
		
		

		public RegistrationPage_Magento(WebDriver driver)throws IOException
		{
			this.driver = driver;
		}

		
			
		public void registerEnterFirstNameMethod() throws InterruptedException, IOException
		{	
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
			
		}	
			
		public void registerClickRegisterButtonMethod() throws InterruptedException
		{		//Thread.sleep(1000);
			registration1.click();
			log.info("Registration Check Is Successful");
			Thread.sleep(1000);
			Account.click();
			Thread.sleep(1000);
			logout.click();
			
		}
		
		}
