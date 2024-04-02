package com.cjc.cucumber.Magento.page;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.cjc.cucumber.Magento.Utility.CommonUtility;

public class loging_page 
{
	WebDriver driver;
	static Logger log = Logger.getLogger(loging_page.class.getName());
	public loging_page(WebDriver driver)
	{
		this.driver=driver;
	}

	@CacheLookup
	@FindBy(css="body > div.page-wrapper > header > div.panel.wrapper > div > ul > li.authorization-link > a")
	WebElement sing_in;
	
	
	@FindBy(css = "#email")
	WebElement us_name;
	
	
	@FindBy(css="#pass")
	WebElement password;
	
	@CacheLookup
	@FindBy(xpath = "/html/body/div[2]/main/div[3]/div/div[2]/div[1]/div[2]/form/fieldset/div[4]/div[1]/button")
	WebElement Log_Button;
	
	public void sing_Link() throws InterruptedException
	{
		Thread.sleep(1000);
		sing_in.click();
	}
		
    public void Loging_user() throws InterruptedException
    {
	   Thread.sleep(1000);
		String log_us=CommonUtility.loginUsername;
		log.info(log_us);
		us_name.sendKeys(log_us);
	}
	
	public void Loging_pass() throws InterruptedException
	{
		Thread.sleep(1000);
		String Log_pass=CommonUtility.loginPassword;
		log.info(Log_pass);
		password.sendKeys(Log_pass);
		
	}
	public void Loging_Button() throws InterruptedException
	{
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		JavascriptExecutor js=(JavascriptExecutor)driver ;
	     
	     //method of javaScript
	     js.executeScript("scrollBy(0, 250)");
		Thread.sleep(500);
		Log_Button.click();
	}
	
}
