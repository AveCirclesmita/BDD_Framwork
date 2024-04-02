Feature: User want to Book a product in Demo Web Shop 
  
  @RegistrationDWS
  Scenario: First Step User Want To Register In Demo Web Shop website
    Given User open the chrome browser
    When User enter the gender
    And User enter the First Name
    And User enter the Last Name
    And User enter the email address
    And User enter the password
    And User enter the confirm password
    And Click on the register button
    Then User able to see the demo web shop registration success
   

  @LogoutDWS
  Scenario: Second Step To logout The Demo Web Shop Page
    Given User Able to see Successful register Page
    When  User want click The logout button on the page
    Then Page logout successfully

    
  @LoginDWS
  Scenario: Third Step To login The Demo Web Shop Page
    Given User able to see the successfull logout page
    When User to click the login button
    And  User Enter The User name 
    And  User Enter The Password
    And  User Click on the Remember Checkbox
    And  User click on the login button
    Then Now user able to see successfull login page
    
    
  @AddToGiftCardDWS
  Scenario: Fourth Step To Add The Gift Card 
    Given User able to see the successfull login page
    When User to click the addtocart first
    And  User Enter The recepient full name
    And  User Enter The recipient email address
    And  User to click the addtocart secound
    Then Now user able to see successfull Adding the product on the cart
    
  @AddToBookDWS
  Scenario: Fifth Step User Want To Click On Shopping Cart and Fill details
    Given User able to see the successfull Adding the product on the cart
    When  User want to Add Book on the cart and send data on search product textbox
    And  User click on the search box button
    And  User add the book on the cart
    And  User want to click the shopping cart
    And  User select the country from dropdown
    And  User want click terms and condition checkbox
    And  User want to click on the checkout button
    Then Now user able to see successfull Filling Shopping Cart Details
     
  @BillingDWS
  Scenario: Sixth Step User Want To Give Billing Address Details
    Given User able to see successfull Filling Shopping Cart Details
    When  User enter the Company name
    And   User select the country
    And   User enter the city name
    And   User enter the address one details
    And   User enter the address two details
    And   User enter the postal code or zip code
    And   User enter the phone number
    And   User enter the fax number
    And   User want to click on continue
    Then Now user able to see successfull Billing Address Details 
    
    
  @PayAndBookProductDWS
  Scenario: Seventh Step User Want To Chose Payment Method
    Given User able to see successfull Billing Address Details Completion
    When  User Choose The payment method and continue 
    And  User want get payment information and continue
    And  User is ready to confirm the order
    And  User want go to home page then click last contiue
    Then Now user able to see confirm order successfully
     
    
    
    
    
    
    
    
    
    
    
    
    
    