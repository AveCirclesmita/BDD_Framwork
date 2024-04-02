package com.cjc.cucumber.Magento_stepdef;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cjc.cucumber.Magento.page.Add_To_Card;
import com.cjc.cucumber.Magento.page.Address_page;
import com.cjc.cucumber.Magento.page.Manu_click;
import com.cjc.cucumber.Magento.page.RegistrationPage_Magento;
import com.cjc.cucumber.Magento.page.loging_page;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Magento_Stepdefination
{
	static WebDriver driver;
	//Properties pro= new Properties();
	static Logger log = Logger.getLogger(Magento_Stepdefination.class.getName());
	
	@Given("^User navigate to magento site$")
	public void openbrowser()
	{
		System.out.println("This is chrome page");
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\updatasoft\\files\\exc\\109\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//object creation
	     JavascriptExecutor js=(JavascriptExecutor)driver ;
	     
	     //method of javaScript
	     js.executeScript("scrollBy(0, 250)");
	     

  }
	@When("^User enter the First Name$")
	public void enterFname() throws InterruptedException, IOException
	{
		RegistrationPage_Magento registration = PageFactory.initElements(driver, RegistrationPage_Magento.class);
		registration.registerEnterFirstNameMethod();
		log.info("Enter The First Name Details");
	}
	
	@And("^User enter the Last Name$")
	public void enterLname() throws InterruptedException, IOException {
		RegistrationPage_Magento registration = PageFactory.initElements(driver, RegistrationPage_Magento.class);
		registration.registerEnterLastNameMethod();
		log.info("Enter The Last Name Details");
	}
	
	@And("^User enter the email address$")
	public void enterEmail() throws InterruptedException, IOException {
		RegistrationPage_Magento registration = PageFactory.initElements(driver, RegistrationPage_Magento.class);
		registration.registerEnterEmailMethod();
		log.info("Enter The Email Details");
	}
	
	@And("^User enter the password$")
	public void enterPassword() throws InterruptedException, IOException {
		RegistrationPage_Magento registration = PageFactory.initElements(driver, RegistrationPage_Magento.class);
		registration.registerEnterPasswordMethod();
		log.info("Enter The password Details");
	}
	
	@And("^User enter the confirm password$")
	public void enterCassword() throws InterruptedException, IOException {
		RegistrationPage_Magento registration = PageFactory.initElements(driver, RegistrationPage_Magento.class);
		registration.registerEnterConfirmPasswordMethod();
		log.info("Enter The Confirm Password Details");
		JavascriptExecutor js=(JavascriptExecutor)driver ;
	     
	     //method of javaScript
	     js.executeScript("scrollBy(0, 250)");

	}
	
	@Then("^Click on the Create an Account button$")
	public void clickRegister() throws InterruptedException, IOException 
	{
		Thread.sleep(1000);
		RegistrationPage_Magento registration = PageFactory.initElements(driver, RegistrationPage_Magento.class);
		registration.registerClickRegisterButtonMethod();
		log.info("Click on The Register Button");
		
	     
	}
////	//******************************Loging**Page***********************************************************	
		
	@Given ("^User able to see the successfull logout page$")
	public void LogoutPage()
	{
		log.info("Logout the page of Magneto");
	}
	
    @When ("^User to click the login button$")
    public void Loging_hyperLink() throws InterruptedException
    {
    	loging_page lp = PageFactory.initElements(driver, loging_page.class);
    	lp.sing_Link();
		log.info("Enter The Loging_hyperLink Details");
    }
    
    @And  ("^User Enter The User name$") 
    public void Loging_enterEmail() throws InterruptedException
    {
    	loging_page lp = PageFactory.initElements(driver, loging_page.class);
    	lp.Loging_user();
		log.info("Enter The nterEmail Details");
    }
    
    @And  ("^User Enter The Password$")
    public void Loging_password () throws InterruptedException
    {
    	loging_page lp = PageFactory.initElements(driver, loging_page.class);
    	lp.Loging_pass();
		log.info("Enter The Loging_password Details");
    }
    
    @And  ("^User click on the login button$")
    public void Loging_ButtonClick() throws InterruptedException
    {
    	loging_page lp = PageFactory.initElements(driver, loging_page.class);
    	lp.Loging_Button();
    	log.info("Loging button ");
    	
    }
    
    @Then ("^Now user able to see successfull login page$")
    public void Loging_page()
    {
    	log.info("Loing the succfully");
    }
//////----------------------------------------Women_Section----------------------------------------

    @Given  ("^click on Women Manu cart$")
    public void Manu() 
    {
    	log.info("Moven on women_Manu");
    }
    
    @When ("^User to click the Tops first$")
    public void Top_fist() throws InterruptedException
    {
    	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
    	Manu_click mc=PageFactory.initElements(driver, Manu_click.class);
    	mc.mo_Weman();
    	
    	
    }
   
   @And  ("^User to click the Tops Jackets$")
   public void Top_jacket() throws InterruptedException
   {
	   driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	   Manu_click mc=PageFactory.initElements(driver, Manu_click.class);
	   mc.mo_Top();
   }
   
    @And  ("^User to click on Jackets$") 
    public void Jacket() throws InterruptedException
    {
    	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
    	Manu_click mc=PageFactory.initElements(driver, Manu_click.class);
    	mc.mo_Jacket();
    }
    
    @And  ("^User to click on Jackets select size color Qty$")
    public void size_co_qt() throws InterruptedException
    {
    	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
    	Manu_click mc=PageFactory.initElements(driver, Manu_click.class);
    	mc.Click_jacket();
    	mc.size();
    	mc.color();
    	mc.quentity();
    }
    
    @And  ("^User to click the addtocart$") 
    public void add_cart() throws InterruptedException
    {
    	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
    	Manu_click mc=PageFactory.initElements(driver, Manu_click.class);
    	mc.Add_to_cart();
    }
    
    @Then ("^Now user able to see successfull Adding the product on the cart$")
    public void cart_button()
    {
    	log.info("Product on the cart");
    }
 
////    //-----------------------------------------Add_Card_Page-----------------------------------------------------
    
   
    @Given  ("^click on Add_to_cart basket$")
    public void Add_to_cart() 
    {
    	log.info("Add_card view ");
    }
    
    @When ("^click on Add_to_cart$")
    public void click_Add() throws InterruptedException
    {
    	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
    	Add_To_Card ad=PageFactory.initElements(driver, Add_To_Card.class);
    	ad.showcart();
    	log.info("Click on Card");
    }
    
    @And  ("^User to click on Proceed and chckout$")
    public void product_Process() throws InterruptedException
    {
    	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
    	Add_To_Card ad=PageFactory.initElements(driver, Add_To_Card.class);
    	ad.checkout();
    	log.info("Product order");
    }
    
    @And  ("^User to view the addtocart$") 
    public void View_cart()
    {
    	log.info("View the Add_to_cart");
    	
    }
    
    @Then ("^Now user able to order successfully$")
    public void order()
    {
    	log.info("Successfully");
    }
    
//    //------------------------------------Address_Page----------------------------------
    
  
@Given("^user name is TATA$")
public void comp_name() throws IOException, InterruptedException 
{
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	Address_page Ade=PageFactory.initElements(driver, Address_page.class);
	Ade.company_name();
	log.info("Properties file call");
}
@When ("^send the Company Street Address$")
public void Company_add() throws IOException, InterruptedException
{
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	Address_page Ade=PageFactory.initElements(driver, Address_page.class);
	Ade.Street_Address();
	log.info("Company Street Address");
}

@And ("^User send the city name$")
public void City_name() throws IOException, InterruptedException
{
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	Address_page Ade=PageFactory.initElements(driver, Address_page.class);
	Ade.city_name();

}
@And ("^user send name Country by Select method$")
public void Country() throws IOException, InterruptedException
{
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	Address_page Ade=PageFactory.initElements(driver, Address_page.class);
	Ade.Country();
}

@And("^user send name of State/Province by select method$")
public void State() throws InterruptedException
{
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	Address_page Ade=PageFactory.initElements(driver, Address_page.class);
	Ade.State_Province();
}

@And ("^user  send the Zip Postal Code$")
public void zip()throws IOException, InterruptedException
{
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	Address_page Ade=PageFactory.initElements(driver, Address_page.class);
	Ade.Zip_Postal_Code();

}

@And ("^user send name of State Province by select method$")
public void state() throws IOException, InterruptedException
{
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	Address_page Ade=PageFactory.initElements(driver, Address_page.class);
	Ade.State_Province();
	
}
@And("^User send the Phone Number$")
public void Ph_no() throws IOException, InterruptedException
{
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	Address_page Ade=PageFactory.initElements(driver, Address_page.class);
	Ade.Phone_Number();

}

@And("^Shipping Methods select the frist option Best way$")
public void Flat_Rate_radio() throws InterruptedException
{
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	Address_page Ade=PageFactory.initElements(driver, Address_page.class);
    Ade.Best_way();
}

@Then("^User click on Next Button$")
public void next_Button() throws InterruptedException
{
//	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	
	Address_page Ade=PageFactory.initElements(driver, Address_page.class);
	Ade.Next_Button();
}

}
