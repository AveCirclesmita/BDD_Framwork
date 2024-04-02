package com.cjc.cucumber.DemowebShop.page;  //DemowebShop5 18.01.2023 HDF Framework Designing

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class AddtoCartBooksPage {

	//This Is Hybrid Driven Framework Performed On The Demo Web Shop Website.
	// TestNG Hybrid Driven Framework Script Created By The Harshit Bisen TB-18B Offline.
	WebDriver driver;
	static Logger log = Logger.getLogger(AddtoCartBooksPage.class.getName());

	@FindBy(css = "input[id='small-searchterms']")
	WebElement searchBooks;
	@FindBy(css = "input[class='button-1 search-box-button']")
	WebElement searchButton;
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[3]/div[1]/div/div/div[2]/div[3]/div[2]/input")
	WebElement addtocartbook;
	@FindBy(xpath = "//*[@id='topcartlink']/a/span[1]")
	WebElement shoppingcart;
	@FindBy(css = "select#CountryId")
	WebElement country1;
	//@FindBy(xpath = "//input[@name='removefromcart']")
	//WebElement removeproduct;
	@FindBy(xpath = "//input[@name='termsofservice']")
	WebElement termsandcondition;
	@FindBy(xpath = "//button[@id='checkout']")
	WebElement checkout;

	public AddtoCartBooksPage(WebDriver driver) throws IOException{
		this.driver = driver;
	}

	public void addToCartBooksSearchTextboxMethod() throws InterruptedException, IOException {
		Thread.sleep(500);
		searchBooks.sendKeys("book");
	}
	public void addToCartBooksSearchButtonClickMethod() throws InterruptedException, IOException {
	Thread.sleep(500);
	searchButton.click();
	}
	public void addToCartBooksButtonClickMethod() throws InterruptedException, IOException {
	Thread.sleep(500);
	addtocartbook.click();
	}
	public void addToCartClickShoppingCartHyLinkMethod() throws InterruptedException, IOException {
	Thread.sleep(500);
	shoppingcart.click();
	}
	public void addToCartSelectCountryMethod() throws InterruptedException, IOException {
	Thread.sleep(500);
	WebElement ddc = country1;
	Select select = new Select(ddc);
	select.selectByIndex(2);
	}
//	public void addToCartBooksRemoveProductCboxMethod() throws InterruptedException, IOException {
//	removeproduct.click();
//	}
	public void addToCartTermConditionCheckboxMethod() throws InterruptedException, IOException {
	Thread.sleep(500);
	termsandcondition.click();
	}
	
	public void addToCartCheckoutButtonClickMethod() throws InterruptedException, IOException {
	Thread.sleep(500);
	checkout.click();
	log.info("Add To Cart Book Is Succesfull with Complete Checkout");
}
}
