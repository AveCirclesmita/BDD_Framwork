package com.cjc.cucumber.DemowebShop.page;  //DemowebShop6 18.01.2023 HDF Framework Design

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class BillingAdressPage {

	 //This Is Hybrid Driven Framework Performed On The Demo Web Shop Website.
	// TestNG Hybrid Driven Framework Script Created By The Harshit Bisen TB-18B Offline.
		WebDriver driver;
		Properties ps = new Properties();
		static Logger log = Logger.getLogger(BillingAdressPage.class.getName());
		
		@FindBy(xpath = "//input[@id='BillingNewAddress_Company']")
		WebElement companyname;
		@FindBy(xpath = "//select[@name='BillingNewAddress.CountryId']")
		WebElement country;
		@FindBy(xpath = "//input[@id='BillingNewAddress_City']")
		WebElement city;
		@FindBy(xpath = "//input[@id='BillingNewAddress_Address1']")
		WebElement address1;
		@FindBy(xpath = "//input[@id='BillingNewAddress_Address2']")
		WebElement address2;
		@FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
		WebElement zipcode;
		@FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
		WebElement phoneno;
		@FindBy(xpath = "//input[@name='BillingNewAddress.FaxNumber']")
		WebElement faxno;
		@FindBy(xpath = "//input[@title='Continue']")
		WebElement continues;
		@FindBy(css = "#PickUpInStore")
		WebElement pickupinstore;
		@FindBy(css = "#shipping-buttons-container > input")
		WebElement con;
		@FindBy(xpath = "//*[@id='payment-method-buttons-container']/input")
		WebElement continue1;
		@FindBy(xpath = "//*[@id='payment-info-buttons-container']/input ")
		WebElement continue2;
		@FindBy(xpath = "//*[@id='confirm-order-buttons-container']/input")
		WebElement confirm;
		@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/ul/li[1]")
		WebElement ordernumber;
		@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/div[2]/input")
		WebElement continue3;

		public BillingAdressPage(WebDriver driver)throws IOException {
			this.driver = driver;
		}

		public void billingAdrressCompanyName() throws InterruptedException, IOException {
			FileInputStream fi = new FileInputStream("src//test//resources//PropertiesFile//DemowebShop.properties");
			ps.load(fi);
			Thread.sleep(500);
			companyname.sendKeys(ps.getProperty("cname"));
		}
		
		public void billingAdrressCountryNameSelect() throws InterruptedException, IOException {
			Thread.sleep(500);
			WebElement ddc = country;
			Select select = new Select(ddc);
			select.selectByIndex(25);
		}
		
		public void billingAdrressCityName() throws InterruptedException, IOException {
			FileInputStream fi = new FileInputStream("src//test//resources//PropertiesFile//DemowebShop.properties");
			ps.load(fi);
			Thread.sleep(500);
			city.sendKeys(ps.getProperty("cname1"));
		}
		
		public void billingAdrressAddressOne() throws InterruptedException, IOException {
			FileInputStream fi = new FileInputStream("src//test//resources//PropertiesFile//DemowebShop.properties");
			ps.load(fi);
			Thread.sleep(500);
			address1.sendKeys(ps.getProperty("addr1"));
		}
		
		public void billingAdrressAddressTwo() throws InterruptedException, IOException {
			FileInputStream fi = new FileInputStream("src//test//resources//PropertiesFile//DemowebShop.properties");
			ps.load(fi);
			Thread.sleep(500);
			address2.sendKeys(ps.getProperty("addr2"));
		}
		
		public void billingAdrressZipCode() throws InterruptedException, IOException {
			FileInputStream fi = new FileInputStream("src//test//resources//PropertiesFile//DemowebShop.properties");
			ps.load(fi);
			Thread.sleep(500);
			zipcode.sendKeys(ps.getProperty("zip"));
		}
			
		public void billingAdrressPhoneNumber() throws InterruptedException, IOException {
			FileInputStream fi = new FileInputStream("src//test//resources//PropertiesFile//DemowebShop.properties");
			ps.load(fi);
			Thread.sleep(500);
			phoneno.sendKeys(ps.getProperty("pn"));
		}	
		
		public void billingAdrressFaxNumber() throws InterruptedException, IOException {
			FileInputStream fi = new FileInputStream("src//test//resources//PropertiesFile//DemowebShop.properties");
			ps.load(fi);
			Thread.sleep(500);
			faxno.sendKeys(ps.getProperty("fn1"));
		}	
			
		public void billingAdrressContinueButtonClick() throws InterruptedException, IOException {
			Thread.sleep(500);
			continues.click();
			Thread.sleep(1500);
			pickupinstore.click();
			Thread.sleep(500);
			con.click();
			Thread.sleep(500);
		}
			
		public void PayAndBookProductContinue1ButtonClick() throws InterruptedException, IOException {	
			continue1.click();
			Thread.sleep(500);
		}
		
		public void PayAndBookProductContinue2ButtonClick() throws InterruptedException, IOException {	
			continue2.click();
			Thread.sleep(500);
		}
		
		public void PayAndBookProductConfirmOrderButtonClick() throws InterruptedException, IOException {	
			confirm.click();
			Thread.sleep(2000);
			File src1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFileToDirectory(src1, new File("src//test//resources//Screenshot"));
			log.info("Screen Shot After For Booking Confirmation");
			WebElement oc = ordernumber;
			String s1 = oc.getText();
			log.info(s1);
		}
		
		public void PayAndBookProductLastContinueButtonClick() throws InterruptedException, IOException {	
			continue3.click();
			Thread.sleep(500);
			log.info("Go to Home Page After Clicking The Last Continue Button");
		}
}
