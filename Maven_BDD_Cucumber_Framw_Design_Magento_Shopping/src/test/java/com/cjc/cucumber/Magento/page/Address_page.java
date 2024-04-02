package com.cjc.cucumber.Magento.page;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Address_page 
{
	WebDriver driver;
	Properties pro=new Properties();
	public Address_page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	// @FindBy(xpath  ="//*[@name='shippingAddress.city']/parent::div//*[@name='company']")
	 //@CacheLookup
	 @FindBy(css = "input[name='company']")
     WebElement Add_comp;
     
     @FindBy(xpath  = "//*[@name='shippingAddress.city']/parent::div//*[@name='street[0]']")
     WebElement Street_Address;
     
     @FindBy(xpath  ="/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form/div/div[4]/div/input")
     WebElement city;
     
     @CacheLookup
     @FindBy(css = "select[name='region_id'] > option[value='553']")
     WebElement State;
     
     @FindBy(xpath = "/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form/div/div[7]/div/input")
     WebElement Zip_code;
     
     @CacheLookup
     @FindBy(css = "select[name='country_id'] > option[value=\"IN\"]")
     WebElement Country;
     
     @FindBy(css =  "input[name='telephone']")
     WebElement Phone_No;
     
     @CacheLookup
     @FindBy(css = "/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[2]/div/div[3]/form/div[1]/table/tbody/tr[2]/td[1]/input")
     WebElement radio;
     
     @CacheLookup
     @FindBy(css =  "#shipping-method-buttons-container > div > button")
     WebElement Shipping;
     
//     @CacheLookup
//     @FindBy(xpath = "//div[@id='checkout-payment-method-load']/div/div/div[2]/div[2]/div[4]/div/button")
//     WebElement continious;

	public void company_name() throws IOException, InterruptedException
	{
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		FileInputStream fis=new FileInputStream("src//test//resources//Properties_file//Maganeto.properties");
		pro.load(fis);
		Add_comp.sendKeys(pro.getProperty("company"));
	  
	}
	public void Street_Address() throws IOException, InterruptedException
	{
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		FileInputStream fis=new FileInputStream("src//test//resources//Properties_file//Maganeto.properties");
		pro.load(fis);
		Street_Address.sendKeys(pro.getProperty("Street_Add"));
		
	}
	public void city_name() throws IOException, InterruptedException
	{
		Thread.sleep(1000);
		FileInputStream fis=new FileInputStream("src//test//resources//Properties_file//Maganeto.properties");
		pro.load(fis);
		city.sendKeys(pro.getProperty("c_name"));	
	}
	public void Zip_Postal_Code() throws InterruptedException, IOException
	{
		Thread.sleep(1000);
		FileInputStream fis=new FileInputStream("src//test//resources//Properties_file//Maganeto.properties");
		pro.load(fis);
		Zip_code.sendKeys(pro.getProperty("Zip_Co"));
	}
	public void Country() throws InterruptedException
	{
		Thread.sleep(1000);
		Country.click();
	
	}
	public void State_Province() throws InterruptedException
	{
		Thread.sleep(1000);
		State.click();
	}
	
	public void Phone_Number() throws IOException, InterruptedException
	{
		Thread.sleep(1000);
		FileInputStream fis=new FileInputStream("src//test//resources//Properties_file//Maganeto.properties");
		pro.load(fis);
		Phone_No.sendKeys(pro.getProperty("Phone_Number"));
		
	}
	public void Best_way() throws InterruptedException
	{
		//Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("(scrollBy(0,500))");

		Thread.sleep(1000);
		radio.click();
		
	}
	public void Next_Button() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("(scrollBy(0,500))");

		Thread.sleep(1000);
		Shipping.click();
	}
	
//	public void conti() throws InterruptedException
//	{
////		Thread.sleep(1000);
////		JavascriptExecutor js = (JavascriptExecutor) driver;
////		js.executeScript("(scrollBy(0,100))");
//
//		Thread.sleep(1000);
//		continious.click();
//	}
}
