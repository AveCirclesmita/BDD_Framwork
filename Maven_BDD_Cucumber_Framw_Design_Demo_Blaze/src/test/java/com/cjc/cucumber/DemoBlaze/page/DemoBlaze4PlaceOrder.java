package com.cjc.cucumber.DemoBlaze.page;  

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

public class DemoBlaze4PlaceOrder 
{
	
	WebDriver driver;
	Properties ps = new Properties();
	static Logger log = Logger.getLogger(DemoBlaze4PlaceOrder.class.getName());
	
	@FindBy(css = "[class='btn btn-success']")
	WebElement placeOrderClick1;
	
	@FindBy(css = "[id='name']")
	WebElement placeOrderName;
	
	@FindBy(css = "[id='country']")
	WebElement placeOrderCountry;
	
	@FindBy(css = "[id='city']")
	WebElement placeOrderCity;
	
	@FindBy(css = "[id='card']")
	WebElement placeOrderCard;
	
	@FindBy(css = "[id='month']")
	WebElement placeOrderMonth;
	
	@FindBy(css = "[id='year']")
	WebElement placeOrderYear;
			
	@FindBy(css = "[onclick='purchaseOrder()']")
	WebElement purchaseClick;	
	
	@FindBy(css = "[class='lead text-muted ']")
	WebElement orderingDeatils;
	
	@FindBy(css = "[class='confirm btn btn-lg btn-primary']")
	WebElement lastOkayClick;
	
	public DemoBlaze4PlaceOrder(WebDriver driver) {
		this.driver = driver;
	}
	
	public void DemoBlaze4PlaceOrderButtonClickMethod() throws InterruptedException, IOException {
		placeOrderClick1.click();
		Thread.sleep(500);
	}
	
	public void DemoBlaze4PlaceOrderEnterNameMethod() throws InterruptedException, IOException {
		FileInputStream fi = new FileInputStream("src//test//resources//PropertiesFile//demoBlaze.properties");
		ps.load(fi);
		placeOrderName.sendKeys(ps.getProperty("name"));
		Thread.sleep(500);
	}	
	public void DemoBlaze4PlaceOrderEnterCountryMethod() throws InterruptedException, IOException {
		FileInputStream fi = new FileInputStream("src//test//resources//PropertiesFile//demoBlaze.properties");
		ps.load(fi);
		placeOrderCountry.sendKeys(ps.getProperty("country"));
		Thread.sleep(500);
	}	
	
	public void DemoBlaze4PlaceOrderEnterCityMethod() throws InterruptedException, IOException {
		FileInputStream fi = new FileInputStream("src//test//resources//PropertiesFile//demoBlaze.properties");
		ps.load(fi);
		placeOrderCity.sendKeys(ps.getProperty("city"));
		Thread.sleep(500);
	}
	
	public void DemoBlaze4PlaceOrderEnterCreditCardMethod() throws InterruptedException, IOException {
		FileInputStream fi = new FileInputStream("src//test//resources//PropertiesFile//demoBlaze.properties");
		ps.load(fi);
		placeOrderCard.sendKeys(ps.getProperty("creditCard"));
		Thread.sleep(500);
	}	
	
	public void DemoBlaze4PlaceOrderEnterMonthMethod() throws InterruptedException, IOException {
		FileInputStream fi = new FileInputStream("src//test//resources//PropertiesFile//demoBlaze.properties");
		ps.load(fi);
		placeOrderMonth.sendKeys(ps.getProperty("month"));
		Thread.sleep(500);
	}	
	
	public void DemoBlaze4PlaceOrderEnterYearMethod() throws InterruptedException, IOException {
		FileInputStream fi = new FileInputStream("src//test//resources//PropertiesFile//demoBlaze.properties");
		ps.load(fi);
		placeOrderYear.sendKeys(ps.getProperty("year"));
		Thread.sleep(500);
	}	
	
	public void DemoBlaze4PlaceOrderClickOnPurchaseButton() throws InterruptedException, IOException {
		purchaseClick.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		File src1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFileToDirectory(src1, new File("src//test//resources//Screenshot"));
		log.info("Screen Shot After For Booking Confirmation");
		String orderDetail = orderingDeatils.getText();
		System.out.println(orderDetail);
		Thread.sleep(300);
	}
	
    public void DemoBlaze4PlaceOrderClickOnLastOkButton() throws InterruptedException, IOException {	
		lastOkayClick.click();
		Thread.sleep(2000);
		driver.close();
		log.info("Place The Order");
	}
}
