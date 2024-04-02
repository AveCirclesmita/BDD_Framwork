package com.cjc.cucumber.Magento.page;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Manu_click 
{

	WebDriver driver;
		
	public Manu_click(WebDriver driver)
	{
		this.driver=driver;
		
	}
	static Logger log = Logger.getLogger(Manu_click.class.getName());

	@CacheLookup
	@FindBy(css="a[href='https://magento.softwaretestingboard.com/women.html']")
	WebElement Mov_Woman;
	
	@CacheLookup
	@FindBy(css="a[href=\"https://magento.softwaretestingboard.com/women/tops-women.html\"]")
	WebElement Mov_Top;
	
	@CacheLookup
	@FindBy(css="a[href=\"https://magento.softwaretestingboard.com/women/tops-women/jackets-women.html\"]")
	WebElement Mov_Jacket;
	
	@CacheLookup
	@FindBy(css="#maincontent > div.columns > div.column.main > div.products.wrapper.grid.products-grid > ol > li:nth-child(2) > div > a > span > span > img")
	WebElement Mov_Juno_Jacket;
	
	@CacheLookup
	@FindBy(css="div[id=\"option-label-size-143-item-166\"]")
	WebElement Pro_size;
	
	@CacheLookup
	@FindBy(css="div[id=\"option-label-color-93-item-53\"]")
	WebElement Pro_color;
	
	@FindBy(css="input[id='qty']")
	WebElement qty;
	
	@CacheLookup
	@FindBy(css="button[id=\"product-addtocart-button\"]")
	WebElement addtocart;
	
	
	public void mo_Weman() throws InterruptedException
	{
		Thread.sleep(1500);
		Actions act= new Actions(driver);
		WebElement list=Mov_Woman;
		act.moveToElement(list).build().perform();
		
		
	}
	
	public void mo_Top() throws InterruptedException
	{
		Thread.sleep(1500);
		Actions act= new Actions(driver);
		WebElement list=Mov_Top;
		act.moveToElement(list).build().perform();
	}
	
	public void mo_Jacket() throws InterruptedException
	{
		Thread.sleep(1500);
		Actions act= new Actions(driver);
		WebElement list=Mov_Jacket;
		act.moveToElement(list).click().build().perform();
		
		
	}
	public void Click_jacket() throws InterruptedException
	{
		Thread.sleep(1500);
		Mov_Juno_Jacket.click();
		
	}
	public void size() throws InterruptedException
	{
		Thread.sleep(1500);
		Pro_size.click();
		
	}
	
	public void color() throws InterruptedException
	{
		Thread.sleep(1500);
		Pro_color.click();
		
	}
	public void quentity() throws InterruptedException
	{
		Thread.sleep(1500);
		qty.clear();
		Thread.sleep(1500);
		qty.sendKeys("2");;
	}
	
	public void Add_to_cart() throws InterruptedException
	{
		Thread.sleep(1500);
		addtocart.click();
		
	}
	

}
