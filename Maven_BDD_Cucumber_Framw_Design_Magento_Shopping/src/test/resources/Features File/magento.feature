Feature: User want to Book a product in Demo Web Shop 
  
  @Registrationmagento
  Scenario: First Step User Want To Reg In magento
    Given User navigate to magento site
    When User enter the First Name
    And User enter the Last Name
    And User enter the email address
    And User enter the password
    And User enter the confirm password
    Then Click on the Create an Account button
   
    @Loginmagento
    Scenario: sencond Step To login The magento Page
    Given User able to see the successfull logout page
    When User to click the login button
    And  User Enter The User name 
    And  User Enter The Password
    And  User click on the login button
    Then Now user able to see successfull login page
   
    @ClickonManu
  Scenario: Third Step To click Manu card
    Given  click on Women Manu cart
    When User to click the Tops first
    And  User to click the Tops Jackets
    And  User to click on Jackets 
    And  User to click on Jackets select size color Qty
    And  User to click the addtocart 
    Then Now user able to see successfull Adding the product on the cart
 
   @AddtoCart
     Scenario: four step To move to Cart
    Given  click on Add_to_cart basket
    When click on Add_to_cart
    And  User to click on Proceed and chckout
    And  User to view the addtocart 
    Then Now user able to order successfully
    
   @Product_Add
   Scenario:  Step to going to Address
	    Given user name is TATA
	   When send the Company Street Address
	   And User send the city name
	   And user send name Country by Select method
	   And user send name of State Province by select method
		And user  send the Zip Postal Code
		And User send the Phone Number
		#And Shipping Methods select the frist option Best way
		Then User click on Next Button
   
   
  
   
   
   
   
   
   
   
  