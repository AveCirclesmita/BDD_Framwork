package com.cjc.cucumber.DemowebShop.page;  //DemowebShop4 18.01.2023 HDF Framework Design.

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AddtoGiftCardPage {

	 //This Is Hybrid Driven Framework Performed On The Demo Web Shop Website.
	// TestNG Hybrid Driven Framework Script Created By The Harshit Bisen TB-18B Offline.
			WebDriver driver;
			Logger log = Logger.getLogger(AddtoGiftCardPage.class.getName());
			Properties ps = new Properties();
			@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[2]/div/div[2]/div[3]/div[2]/input")
			WebElement addtocartclick;
			@FindBy(xpath = "//input[@class='recipient-name']")
			WebElement recipientname;
			@FindBy(xpath = "//input[@class='recipient-email']")
			WebElement recipientemail;
			@FindBy(xpath = "//input[@id='add-to-cart-button-2']")
			WebElement addtocartclick2;
			public AddtoGiftCardPage(WebDriver driver)throws IOException{
				this.driver = driver;	
			}
			
			public void addToCartGiftCardHyClickMethod() throws InterruptedException, IOException {
				Thread.sleep(500);
				addtocartclick.click();
				Thread.sleep(500);
				JavascriptExecutor js = ((JavascriptExecutor) driver);
				js.executeScript("scrollBy(0,300)");
				Thread.sleep(500);
			}
			public void addToCartRecepientNameMethod() throws InterruptedException, IOException {
				FileInputStream fi = new FileInputStream("src//test//resources//PropertiesFile//DemowebShop.properties");
				ps.load(fi);
				recipientname.sendKeys(ps.getProperty("rpn"));
				Thread.sleep(500);
			}
			
			public void addToCartRecepientEmailMethod() throws InterruptedException, IOException {
				FileInputStream fi = new FileInputStream("src//test//resources//PropertiesFile//DemowebShop.properties");
				ps.load(fi);
				recipientemail.sendKeys(ps.getProperty("rpe"));
				Thread.sleep(500);
			}
			
			public void addToCartButtonClick1Method() throws InterruptedException, IOException {
				addtocartclick2.click();
				Thread.sleep(500);
				log.info("Add To Gift Card Successfully Product One");
			}
			
}
