package com.cjc.cucumber.DemoBlaze.stepDef;   //20.01.2023 C-BDD Frame Work Designing

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
import com.cjc.cucumber.DemoBlaze.page.DemoBlaze1Signup;
import com.cjc.cucumber.DemoBlaze.page.DemoBlaze2Login;
import com.cjc.cucumber.DemoBlaze.page.DemoBlaze3AddToCart;
import com.cjc.cucumber.DemoBlaze.page.DemoBlaze4PlaceOrder;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoBlazeStepDef {
   static WebDriver driver;
	    //Okay whole Which Comment Out
		Properties ps = new Properties();
		static Logger log = Logger.getLogger(DemoBlazeStepDef.class.getName());
		
		{FileInputStream fi = new FileInputStream("src//test//resources//Features File//DemoBlaze.feature");
		ps.load(fi);}
		public DemoBlazeStepDef()throws InterruptedException, IOException
		{	
		}
		
		@Given("^User open the chrome browser$")
		public void browserOpen() throws IOException {
			log.info("Welcome To Cucumber J-Unit");
			log.info("Demo Blaze Shop Register J-Unit Script In BDD Cucumber Framework ");
			System.setProperty("webdriver.chrome.driver", "src//test//resources//BrowserExe//chromedriver.exe");
			log.info("Launch Browser");
			driver = new ChromeDriver();
			driver.get("https://www.demoblaze.com/index.html");
			log.debug("Send URL to the browser By XML Parameter Concept");
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			log.info("Maximizing The Window");
			Set<Cookie> cook = driver.manage().getCookies();
			int cookiesLength = cook.size();
			log.info("Cookies Length Before = " + cookiesLength);
		}
//*********************************Sign**Up**Details********************************************************************		

		@When("^user want to click on sign up hyperlink$")
		public void signUpHyClick() throws InterruptedException, IOException {
			
			DemoBlaze1Signup dbsup = PageFactory.initElements(driver,DemoBlaze1Signup.class);
			dbsup.DemoBlaze1SignupHyperlinkMethod();
			log.info("Click On The Signup Hyperlink");
			
		}

		@And("^enter the signup username$")
		public void enterSignUserName() throws InterruptedException, IOException {
			DemoBlaze1Signup dbsup = PageFactory.initElements(driver,DemoBlaze1Signup.class);
			dbsup.DemoBlaze1SignupUserName();
			log.info("Enter The User Name Details In Sign Up");
		}
		
		@And("^enter the signup password$")
		public void enterSignPassword() throws InterruptedException, IOException {
			DemoBlaze1Signup dbsup = PageFactory.initElements(driver,DemoBlaze1Signup.class);
			dbsup.DemoBlaze1SignupUserPass();
			log.info("Enter The Password Details In Sign Up");
		}
		
		@And("^user click on sign up button$")
		public void signUpButtonClick() throws InterruptedException, IOException {
			DemoBlaze1Signup dbsup = PageFactory.initElements(driver,DemoBlaze1Signup.class);
			dbsup.DemoBlaze1SignupButtonMethod();
			log.info("Click On The Sign Up Button");
		}
		
		@And("^user handle the alert of sign up page$")
		public void signUpAlertHandle() throws InterruptedException, IOException {
			DemoBlaze1Signup dbsup = PageFactory.initElements(driver,DemoBlaze1Signup.class);
			dbsup.DemoBlaze1SignupAlertMethod();
			log.info("User The Handle The Alert Successfully");
		}

		@Then("^User Able To See Successfull Sign Up Screen$")
		public void signUpSuccess()
		{
			log.info("User able to see the Demo Blaze Sign Up SuccessFul");
		}
//***************************************Login**Details*****************************************************************	
		@Given("^User is able to sign up successfull in the sign up page$")
		public void signupSuccessfull()
		{
			log.info("See To The Successfull Sign up Page");
		}
		
		@When("^user want to click on login hyperlink$")
		public void loginHyClick() throws InterruptedException, IOException
		{
			DemoBlaze2Login dblogin = PageFactory.initElements(driver,DemoBlaze2Login.class);
			dblogin.DemoBlaze2LoginHyperlinkMethod();
			log.info("Click on the Login hyperlink");
		}
		
		@And("^enter the login username$")
		public void enterLoginUserName() throws InterruptedException, IOException
		{
			DemoBlaze2Login dblogin = PageFactory.initElements(driver,DemoBlaze2Login.class);
			dblogin.DemoBlaze2LoginUserName();
			log.info("Enter The login User Name Details");
		}
		
		@And("^enter the login password$")
		public void enterLoginPassword() throws InterruptedException, IOException
		{
			DemoBlaze2Login dblogin = PageFactory.initElements(driver,DemoBlaze2Login.class);
			dblogin.DemoBlaze2LoginUserPass();
			log.info("Enter The login Password Details");
		}
		
		@And("^user click on login button$")
		public void loginButtonClick() throws InterruptedException, IOException
		{
			DemoBlaze2Login dblogin = PageFactory.initElements(driver,DemoBlaze2Login.class);
			dblogin.DemoBlaze1loginButtonMethod();
			log.info("Click On The Login Button");
		}
		
		@Then("^User Able To See Successfull Login Screen$")	
		public void loginSuccess() throws InterruptedException, IOException {
			log.info("User Able To See Successfull Login Screen");
		}
		
//************************************Product**Add**To**Cart*************************************************************	
		@Given("^User is able to See successfull Login page$")
		public void logoutSuccessfullyPage()
		{
			log.info("User able to see successfull Login page of DBS");
		}
		
		@When("^user click on the product one hyperlink$")
		public void clickOnProductOneHyperlink() throws InterruptedException
		{
			DemoBlaze3AddToCart dbAddToCart = PageFactory.initElements(driver,DemoBlaze3AddToCart.class);
			dbAddToCart.DemoBlaze3AddToCartProLink1Method();
			log.info("Click On Product One Hyperlink");
		}
		
		@And("^user click on the add to cart button one$")
		public void clickOnProductOneAddToCartButton() throws InterruptedException
		{
			DemoBlaze3AddToCart dbAddToCart = PageFactory.initElements(driver,DemoBlaze3AddToCart.class);
			dbAddToCart.DemoBlaze3AddToCartButtonClick1Method();
			log.info("Click On The Product One Add To Cart Button");
		}
		
		@And("^user handle the alert of add to cart product one page$")
		public void clickOnAlert1Button() throws InterruptedException
		{
			DemoBlaze3AddToCart dbAddToCart = PageFactory.initElements(driver,DemoBlaze3AddToCart.class);
			dbAddToCart.DemoBlaze3AddToCartAlert1Method();
			log.info("Click On The Okay Button Of Alert Button 1");
		}
		
		@And("^user want to click on the home page hyperlink$")
		public void clickOnHomeHyperlink() throws InterruptedException
		{
			DemoBlaze3AddToCart dbAddToCart = PageFactory.initElements(driver,DemoBlaze3AddToCart.class);
			dbAddToCart.DemoBlaze3HomePHyperLinkClickMethod();
			log.info("Click on the Home Hyperlink To Go In Home Page");
		}
		
		@And("^user click on the product two hyperlink$")
		public void clickOnProductTwoHyperlink() throws InterruptedException
		{
			DemoBlaze3AddToCart dbAddToCart = PageFactory.initElements(driver,DemoBlaze3AddToCart.class);
			dbAddToCart.DemoBlaze3AddToCartProLink2Method();
			log.info("Click On The Product Two Hyperlink");
		}
		
		@And("^user click on the add to cart button two$")
		public void clickOnProductAddCartTwoButton() throws InterruptedException
		{
			DemoBlaze3AddToCart dbAddToCart = PageFactory.initElements(driver,DemoBlaze3AddToCart.class);
			dbAddToCart.DemoBlaze3AddToCartButtonClick2Method();
			log.info("Click On The Product Two Add To Cart Button");
		}
		
		@And("^user handle the alert of add to cart product two page$")
		public void clickOnProductTwoAlertButton() throws InterruptedException
		{
			DemoBlaze3AddToCart dbAddToCart = PageFactory.initElements(driver,DemoBlaze3AddToCart.class);
			dbAddToCart.DemoBlaze3AddToCartAlert2Method();
			log.info("Click On The Okay Button And Handle The Alert Two");
		}
		
		@And("^user want to click on the cart hyperlink$")
		public void clickOnCartHyperlink() throws InterruptedException
		{
			DemoBlaze3AddToCart dbAddToCart = PageFactory.initElements(driver,DemoBlaze3AddToCart.class);
			dbAddToCart.clickOnTheCartHyperlinkMethod();
			log.info("Click On The Cart Hyperlink In DBS");
		}
		
		@Then("^User Able To See Successfull Add To Carts Screen$")
		public void addToCartSuccess() throws InterruptedException
		{
			log.info("User able to see the successfull Add To Cart page On Screen");
		}
//********************************Purchasing**Details*******************************************************
		
		@Given("^User is able to See successfull Add To Cart page$")
		public void addToCartSuccessfully()
		{
			log.info("User able to see successfully Added Product On The Add To Cart ");
		}
		
		@When("^user click on the place order button$")
		public void clickPlaceOrderButton() throws InterruptedException, IOException
		{
			DemoBlaze4PlaceOrder dbplaceOrder = PageFactory.initElements(driver,DemoBlaze4PlaceOrder.class);
			dbplaceOrder.DemoBlaze4PlaceOrderButtonClickMethod();
			log.info("User Click on The Place Order Button");
		}
		
		@And("^user enter the name$")
		public void enterPlaceOrderName() throws InterruptedException, IOException
		{
			DemoBlaze4PlaceOrder dbplaceOrder = PageFactory.initElements(driver,DemoBlaze4PlaceOrder.class);
			dbplaceOrder.DemoBlaze4PlaceOrderEnterNameMethod();
			log.info("User Enter The Place Order Name");
		}
		
		@And("^user enter the country name$")
		public void enterPlaceOrderCountry() throws InterruptedException, IOException
		{
			DemoBlaze4PlaceOrder dbplaceOrder = PageFactory.initElements(driver,DemoBlaze4PlaceOrder.class);
			dbplaceOrder.DemoBlaze4PlaceOrderEnterCountryMethod();
			log.info("User Enter The Place Order Country");
		}
		
		@And("^user enter the city name$")
		public void enterPlaceOrderCity() throws InterruptedException, IOException
		{
			DemoBlaze4PlaceOrder dbplaceOrder = PageFactory.initElements(driver,DemoBlaze4PlaceOrder.class);
			dbplaceOrder.DemoBlaze4PlaceOrderEnterCityMethod();
			log.info("User Enter The Place Order Country");
		}
		
		@And("^user enter the credit card details$")
		public void enterPlaceOrderCreditCard() throws InterruptedException, IOException
		{
			DemoBlaze4PlaceOrder dbplaceOrder = PageFactory.initElements(driver,DemoBlaze4PlaceOrder.class);
			dbplaceOrder.DemoBlaze4PlaceOrderEnterCreditCardMethod();
			log.info("User Enter The Place Order Credit Card");
		}
		
		@And("^user enter the month$")
		public void enterPlaceOrderMonth() throws InterruptedException, IOException
		{
			DemoBlaze4PlaceOrder dbplaceOrder = PageFactory.initElements(driver,DemoBlaze4PlaceOrder.class);
			dbplaceOrder.DemoBlaze4PlaceOrderEnterMonthMethod();
			log.info("User Enter The Place Order Month");
		}
		
		@And("^user enter the year$")
		public void enterPlaceOrderYear() throws InterruptedException, IOException
		{
			DemoBlaze4PlaceOrder dbplaceOrder = PageFactory.initElements(driver,DemoBlaze4PlaceOrder.class);
			dbplaceOrder.DemoBlaze4PlaceOrderEnterYearMethod();
			log.info("User Enter The Place Order Year");
		}
		
		@And("^User want to click on purchase button$")
		public void clickOnPurchaseButton() throws InterruptedException, IOException
		{
			DemoBlaze4PlaceOrder dbplaceOrder = PageFactory.initElements(driver,DemoBlaze4PlaceOrder.class);
			dbplaceOrder.DemoBlaze4PlaceOrderClickOnPurchaseButton();
			log.info("User Click On The Purchse Button");
		}
		
		@And("^user want to click last ok button and go to home$")
		public void clickOnLastOkayButton() throws InterruptedException, IOException
		{
			DemoBlaze4PlaceOrder dbplaceOrder = PageFactory.initElements(driver,DemoBlaze4PlaceOrder.class);
			dbplaceOrder.DemoBlaze4PlaceOrderClickOnLastOkButton();
			log.info("User Click On The Last Okay Button");
		}
	
		@Then("^User Successfully Purchase The Product In The DBS$")
		public void successfulBookTheProduct()
		{
			log.info("User Sucessfully Book The Product In DBS");
		}
//****************************************************************************************************
}
