package com.cjc.cucumber.DemowebShop.stepDef; 

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cjc.cucumber.DemowebShop.page.AddtoCartBooksPage;
import com.cjc.cucumber.DemowebShop.page.AddtoGiftCardPage;
import com.cjc.cucumber.DemowebShop.page.BillingAdressPage;
import com.cjc.cucumber.DemowebShop.page.LoginPage;
import com.cjc.cucumber.DemowebShop.page.LogoutPage;
import com.cjc.cucumber.DemowebShop.page.RegistrationPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoWebShopStepDef {

	  static WebDriver driver;
		Properties ps = new Properties();
		static Logger log = Logger.getLogger(DemoWebShopStepDef.class.getName());
		
		{FileInputStream fi = new FileInputStream("src//test//resources//PropertiesFile//DemowebShop.properties");
		ps.load(fi);}
		public DemoWebShopStepDef()throws InterruptedException, IOException
		{	
			
		}
//**********************************Registration**Page*************************************************		
		@Given("^User open the chrome browser$")
		public void browserOpen() throws IOException 
		{
			log.info("Welcome To J-Unit BDD Cucumber Framework");
			log.info("Demo Web Shop BDD Cucumber Framework Designing");
			System.setProperty(ps.getProperty("driverKey"), ps.getProperty("driverValue"));
			log.info("Launch Browser");
			driver = new ChromeDriver();
			driver.get(ps.getProperty("url"));
			log.debug("Send URL to the browser By XML Parameter");
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			log.info("Maximizing The Window");
			Set<Cookie> cook = driver.manage().getCookies();
			int cookiesLength = cook.size();
			log.info("Cookies Length Before = " + cookiesLength);
		}
	
		    @When("^User enter the gender$")
			public void genButton() throws InterruptedException, IOException
			{
		    	RegistrationPage registration = PageFactory.initElements(driver, RegistrationPage.class);
		    	registration.registerGenderClickButtonMethod();
		    	log.info("Enter The Grnder Button Click");
			}
		
		@And("^User enter the First Name$")
		public void enterFname() throws InterruptedException, IOException {
			RegistrationPage registration = PageFactory.initElements(driver, RegistrationPage.class);
			registration.registerEnterFirstNameMethod();
			log.info("Enter The First Name Details");
		}
		
		@And("^User enter the Last Name$")
		public void enterLname() throws InterruptedException, IOException {
			RegistrationPage registration = PageFactory.initElements(driver, RegistrationPage.class);
			registration.registerEnterLastNameMethod();
			log.info("Enter The Last Name Details");
		}
		
		@And("^User enter the email address$")
		public void enterEmail() throws InterruptedException, IOException {
			RegistrationPage registration = PageFactory.initElements(driver, RegistrationPage.class);
			registration.registerEnterEmailMethod();
			log.info("Enter The Email Details");
		}
		
		@And("^User enter the password$")
		public void enterPassword() throws InterruptedException, IOException {
			RegistrationPage registration = PageFactory.initElements(driver, RegistrationPage.class);
			registration.registerEnterPasswordMethod();
			log.info("Enter The password Details");
		}
		
		@And("^User enter the confirm password$")
		public void enterCassword() throws InterruptedException, IOException {
			RegistrationPage registration = PageFactory.initElements(driver, RegistrationPage.class);
			registration.registerEnterConfirmPasswordMethod();
			log.info("Enter The Confirm Password Details");
		}
		
		@And("^Click on the register button")
		public void clickRegister() throws InterruptedException, IOException {
			RegistrationPage registration = PageFactory.initElements(driver, RegistrationPage.class);
			registration.registerClickRegisterButtonMethod();
			log.info("Click on The Register Button");
		}
		
		@Then("^User able to see the demo web shop registration success$")
		public void registerSuccess()
		{
			log.info("User able to see the demo web shop registration successfull");
		}
//******************************Logout**Page***********************************************************	
		@Given("^User Able to see Successful register Page$")
		public void registerSuccessfull()
		{
			log.info("User Able To See The Successfull Register Page");
		}
		
		@When("^User want click The logout button on the page$")
		public void logoutThePage() throws InterruptedException
		{
			LogoutPage logout = PageFactory.initElements(driver, LogoutPage.class);
			logout.logoutHyperlinkClickMethod();
			log.info("Click on the logout Hyperlink");
		}
		
		@Then("^Page logout successfully$")	
		public void logoutSuccess() throws InterruptedException, IOException {
			log.info("User Successfully Logout The Page");
		}
		
//**********************************Login**Page********************************************************	
		@Given("^User able to see the successfull logout page$")
		public void logoutSuccessfullyPage()
		{
			log.info("User able to see successfull logout page");
		}
		
		@When("^User to click the login button$")
		public void enterclickOnLoginHyLink() throws InterruptedException, IOException
		{
			LoginPage login = PageFactory.initElements(driver, LoginPage.class);
			login.loginClickHyperlinkMethod();
			log.info("Successfully Click On login Hyper Link");
		}
		
		@And("^User Enter The User name$")
		public void enterUsernamelogin() throws InterruptedException, IOException
		{
			LoginPage login = PageFactory.initElements(driver, LoginPage.class);
			login.loginEnterUserNameMethod();
			log.info("Enter The username/email for login");
		}
		
		@And("^User Enter The Password$")
		public void enterPasswordlogin() throws InterruptedException, IOException
		{
			LoginPage login = PageFactory.initElements(driver, LoginPage.class);
			login.loginEnterPasswordMethod();
			log.info("Enter The Password for login");
		}
		
		@And("^User Click on the Remember Checkbox$")
		public void rememberCheckbox() throws InterruptedException, IOException
		{
			LoginPage login = PageFactory.initElements(driver, LoginPage.class);
			login.loginClickRemebermeCheckboxMethod();
			log.info("Click on the remember me checkbox");
		}
		
		@And("^User click on the login button$")
		public void outclickOnTheLoginButton() throws InterruptedException, IOException
		{
			LoginPage login = PageFactory.initElements(driver, LoginPage.class);
			login.loginClickButtonMethod();
			log.info("Login Click Is Successful");
		}
		
		@Then("^Now user able to see successfull login page$")
		public void loginSuccess() throws InterruptedException, IOException
		{
			LoginPage login = PageFactory.initElements(driver, LoginPage.class);
			login.loginSuccessMethod();
			log.info("User able to see the successfully login page");
		}
//******************************Add**To**Gift**Card****************************************************	
		
		@Given("^User able to see the successfull login page$")
		public void loginSuccessfullypage()
		{
			log.info("User able to see successfull login page");
		}
		
		@When("^User to click the addtocart first$")
		public void clickAddToCartHyperlinkFirst() throws InterruptedException, IOException
		{
			AddtoGiftCardPage addToGiftCard = PageFactory.initElements(driver, AddtoGiftCardPage.class);
			addToGiftCard.addToCartGiftCardHyClickMethod();
			log.info("User Click To The Add To Cart Hyperlink First");
		}
		
		@And("^User Enter The recepient full name$")
		public void enterRecipientName() throws InterruptedException, IOException
		{
			AddtoGiftCardPage addToGiftCard = PageFactory.initElements(driver, AddtoGiftCardPage.class);
			addToGiftCard.addToCartRecepientNameMethod();
			log.info("User Enter The Recipient Names");
		}
		
		@And("^User Enter The recipient email address$")
		public void enterRecipientEmail() throws InterruptedException, IOException
		{
			AddtoGiftCardPage addToGiftCard = PageFactory.initElements(driver, AddtoGiftCardPage.class);
			addToGiftCard.addToCartRecepientEmailMethod();
			log.info("User Enter The Recipient Email");
		}
		
		@And("^User to click the addtocart secound$")
		public void clickAddToCartSecond() throws InterruptedException, IOException
		{
			AddtoGiftCardPage addToGiftCard = PageFactory.initElements(driver, AddtoGiftCardPage.class);
			addToGiftCard.addToCartButtonClick1Method();
			log.info("User Succesfully Add To Gift Card");
		}
		
		
		@Then("^Now user able to see successfull Adding the product on the cart$")
		public void successfulAddToCart()
		{
			log.info("User Sucessfully Add The Product Gift Card On Their Cart");
		}
//***********************************Add**To**Books****************************************************	
		
		@Given("^User able to see the successfull Adding the product on the cart$")
		public void successAddToCart()
		{
			log.info("User Able See Success Add to cart with Gift Card");
		}
		
		@When("^User want to Add Book on the cart and send data on search product textbox$")
		public void sendValueForSearchProduct() throws InterruptedException, IOException
		{
			AddtoCartBooksPage addToBook = PageFactory.initElements(driver, AddtoCartBooksPage.class);
			addToBook.addToCartBooksSearchTextboxMethod();
			log.info("User want to search another product For cart");
		}
		
		@And("^User click on the search box button$")
		public void clickOnSearchBoxButton() throws InterruptedException, IOException
		{
			AddtoCartBooksPage addToBook = PageFactory.initElements(driver, AddtoCartBooksPage.class);
			addToBook.addToCartBooksSearchButtonClickMethod();
			log.info("User Click on search box Button");
		}
		
		@And("^User add the book on the cart$")
		public void clickOnAddToCartButtonForBook() throws InterruptedException, IOException
		{
			AddtoCartBooksPage addToBook = PageFactory.initElements(driver, AddtoCartBooksPage.class);
			addToBook.addToCartBooksButtonClickMethod();
			log.info("User Click on Add To Cart Of Book Button");
		}
		
		@And("^User want to click the shopping cart$")
		public void clickOnShoppingCart() throws InterruptedException, IOException
		{
			AddtoCartBooksPage addToBook = PageFactory.initElements(driver, AddtoCartBooksPage.class);
			addToBook.addToCartClickShoppingCartHyLinkMethod();
			log.info("User Succesfully Click on the shopping cart Hyperlink");
		}
		
		@And("^User select the country from dropdown$")
		public void selectCountryDroDown() throws InterruptedException, IOException
		{
			AddtoCartBooksPage addToBook = PageFactory.initElements(driver, AddtoCartBooksPage.class);
			addToBook.addToCartSelectCountryMethod();
			log.info("User Select The Country");
		}
		
		@And("^User want click terms and condition checkbox$")
		public void termsAndConditionBox() throws InterruptedException, IOException
		{
			AddtoCartBooksPage addToBook = PageFactory.initElements(driver, AddtoCartBooksPage.class);
			addToBook.addToCartTermConditionCheckboxMethod();
			log.info("User Click Terms and condition checkbox");
		}
		
		
		@And("^User want to click on the checkout button$")
		public void clickonCheckOut() throws InterruptedException, IOException
		{
			AddtoCartBooksPage addToBook = PageFactory.initElements(driver, AddtoCartBooksPage.class);
			addToBook.addToCartCheckoutButtonClickMethod();
			log.info("Add To Shopping Cart Of Book Is Succesfull And Checkout");
		}
		
		@Then("^Now user able to see successfull Filling Shopping Cart Details$")
		public void successShoppingCartCheckout()
		{
			log.info("User able to see successfull Filling Shopping Cart Details");
		}
		
//**********************************Billing**Address***************************************************	
		
		@Given("^User able to see successfull Filling Shopping Cart Details$")
		public void successShoppingCart()
		{
			log.info("User able to see successfull Filling Shopping Cart Details");
		}
		
		@When("^User enter the Company name$")
		public void enterCompanyName() throws InterruptedException, IOException
		{
			BillingAdressPage ba = PageFactory.initElements(driver, BillingAdressPage.class);
			ba.billingAdrressCompanyName();
			log.info("Enter The Company Name");
		}
		
		@And("^User select the country$")
		public void selectCountry() throws InterruptedException, IOException
		{
			BillingAdressPage ba = PageFactory.initElements(driver, BillingAdressPage.class);
			ba.billingAdrressCountryNameSelect();
			log.info("Select The Country");
		}
		
		@And("^User enter the city name$")
		public void enterCityName() throws InterruptedException, IOException
		{
			BillingAdressPage ba = PageFactory.initElements(driver, BillingAdressPage.class);
			ba.billingAdrressCityName();
			log.info("Enter The City Name");
		}
		
		@And("^User enter the address one details$")
		public void enterAddress1() throws InterruptedException, IOException
		{
			BillingAdressPage ba = PageFactory.initElements(driver, BillingAdressPage.class);
			ba.billingAdrressAddressOne();
			log.info("Enter The Address 1");
		}
		
		@And("^User enter the address two details$")
		public void enterAddress2() throws InterruptedException, IOException
		{
			BillingAdressPage ba = PageFactory.initElements(driver, BillingAdressPage.class);
			ba.billingAdrressAddressTwo();
			log.info("Enter The Address 2");
		}
		
		@And("^User enter the postal code or zip code$")
		public void enterPostalCode() throws InterruptedException, IOException
		{
			BillingAdressPage ba = PageFactory.initElements(driver, BillingAdressPage.class);
			ba.billingAdrressZipCode();
			log.info("Enter The Postal Code");
		}
		
		
		@And("^User enter the phone number$")
		public void enterMobNO() throws InterruptedException, IOException
		{
			BillingAdressPage ba = PageFactory.initElements(driver, BillingAdressPage.class);
			ba.billingAdrressPhoneNumber();
			log.info("Enter The Phone Number");
		}
		
		@And("^User enter the fax number$")
		public void enterFaxNo() throws InterruptedException, IOException
		{
			BillingAdressPage ba = PageFactory.initElements(driver, BillingAdressPage.class);
			ba.billingAdrressFaxNumber();
			log.info("Enter The fax No");
		}
		
		@And("^User want to click on continue$")
		public void clickContinueBilling() throws InterruptedException, IOException
		{
			BillingAdressPage ba = PageFactory.initElements(driver, BillingAdressPage.class);
			ba.billingAdrressContinueButtonClick();
			log.info("Click on the Billing Button Continue");
		}
		
		@Then("^Now user able to see successfull Billing Address Details$")
		public void successBilling()
		{
			log.info("User able to see success billing address window");
		}
//*************************Payment**Method**And**Product**Book*****************************************	
		
		@Given("^User able to see successfull Billing Address Details Completion$")
		public void billingSuccessfully()
		{
			log.info("User able to successfully adding billing address");
		}
		
		@When("^User Choose The payment method and continue$")
		public void paymentMethodChoice() throws InterruptedException, IOException
		{
			BillingAdressPage ba = PageFactory.initElements(driver, BillingAdressPage.class);
			ba.PayAndBookProductContinue1ButtonClick();
			log.info("Payment method successfully choosen");
		}
		
		@And("^User want get payment information and continue$")
		public void paymentInformation() throws InterruptedException, IOException
		{
			BillingAdressPage ba = PageFactory.initElements(driver, BillingAdressPage.class);
			ba.PayAndBookProductContinue2ButtonClick();
			log.info("Getting Payment Information and continue");
		}
		
		@And("^User is ready to confirm the order$")
		public void confirmOrder() throws InterruptedException, IOException
		{
			BillingAdressPage ba = PageFactory.initElements(driver, BillingAdressPage.class);
			ba.PayAndBookProductConfirmOrderButtonClick();
			log.info("Order Confirm By The User");
			
		}
		
		@And("^User want go to home page then click last contiue$")
		public void lastContinueClick() throws InterruptedException, IOException
		{
			BillingAdressPage ba = PageFactory.initElements(driver, BillingAdressPage.class);
			ba.PayAndBookProductLastContinueButtonClick();
			log.info("Order Confirm By The User and go back to the home page");
			
		}
		
		@Then("Now user able to see confirm order successfully")
		public void confirmOrderSuccessfully() throws InterruptedException
		{
			Thread.sleep(2000);
			driver.close();
			log.info("Now user able to see confirm order successfully in the demo web shop");
		}
		
		
//*****************************************************************************************************	
		
}
