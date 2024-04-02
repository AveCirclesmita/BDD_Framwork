package com.cjc.cucumber.DemoBlaze.page;  //20.01.2023 C-BDD Frame Work Designing

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoBlaze3AddToCart {
	//This Cucumber Behavior Driven Development Framework Performed On the Demo Blaze Shop Web site
	// TestNG Cucumber Behavior Driven Development Framework Script Created By The Harshit Bisen TB-18B Offline.
	WebDriver driver;
	static Logger log = Logger.getLogger(DemoBlaze3AddToCart.class.getName());
	@FindBy(css = "#tbodyid > div:nth-child(1) > div > div > h4 > a")
	WebElement productLinkClick1;

	@FindBy(css = "[onclick='addToCart(1)']")
	WebElement addToCartLinkClick1;
	
	@FindBy(css = "#navbarExample > ul > li.nav-item.active > a")
	WebElement homeClick1;
	
	@FindBy(css = "#tbodyid > div:nth-child(2) > div > div > h4 > a")
	WebElement productLinkClick2;
	
	@FindBy(css = "[onclick='addToCart(2)']")
	WebElement addToCartLinkClick2;
	
	@FindBy(css = "[id='cartur']")
	WebElement CartLinkClick1;
	
//	@FindBy(css = "[class='btn btn-success']")
//	WebElement placeOrderClick1;
	
	public DemoBlaze3AddToCart(WebDriver driver) {
		this.driver = driver;
	}
	
	public void DemoBlaze3AddToCartProLink1Method() throws InterruptedException {
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("scrollBy(0,200)");
		Thread.sleep(300);
		productLinkClick1.click();
		Thread.sleep(500);
	}
	
	public void DemoBlaze3AddToCartButtonClick1Method() throws InterruptedException {
		addToCartLinkClick1.click();
		Thread.sleep(1000);
	}
	
	public void DemoBlaze3AddToCartAlert1Method() throws InterruptedException {
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
	}	
	
	public void DemoBlaze3HomePHyperLinkClickMethod() throws InterruptedException {
		homeClick1.click();
		Thread.sleep(1000);
		JavascriptExecutor js1 = ((JavascriptExecutor)driver);
		js1.executeScript("scrollBy(0,200)");
		Thread.sleep(300);
	}
	
	public void DemoBlaze3AddToCartProLink2Method() throws InterruptedException {	
		productLinkClick2.click();
		Thread.sleep(500);
	}	
	
	public void DemoBlaze3AddToCartButtonClick2Method() throws InterruptedException {
		addToCartLinkClick2.click();
		Thread.sleep(1000);
	}
	
	public void DemoBlaze3AddToCartAlert2Method() throws InterruptedException {
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
	}	
	
	public void clickOnTheCartHyperlinkMethod() throws InterruptedException {
		CartLinkClick1.click();
		Thread.sleep(1000);
		log.info("Product Add To Cart");
	}
	
//		placeOrderClick1.click();
//		Thread.sleep(500);
}
