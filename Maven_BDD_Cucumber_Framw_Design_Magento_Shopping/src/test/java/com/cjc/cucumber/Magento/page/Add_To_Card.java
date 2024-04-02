package com.cjc.cucumber.Magento.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Add_To_Card 
{
	WebDriver driver;
	
	public Add_To_Card(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@CacheLookup
	@FindBy(css="a[class=\"action showcart\"]")
	WebElement Add_cart;
	
	@CacheLookup
	@FindBy(css="button[id=\"top-cart-btn-checkout\"]")
	
	WebElement pro_add;
	
	public void showcart() throws InterruptedException
	{
		Thread.sleep(1500);
		Add_cart.click();
	}
	 public void checkout() throws InterruptedException
	 {
		// driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		 Thread.sleep(1000);
		 pro_add.click();
	 }
}
