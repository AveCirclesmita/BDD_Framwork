
Feature: User Want To Book The Product From The Demo Blaze Shop Website

  @SignUpDBS
  Scenario: First Step User Want To Sign Up In DBS
    Given  User open the chrome browser
    When user want to click on sign up hyperlink
    And enter the signup username
    And enter the signup password
    And user click on sign up button
    And user handle the alert of sign up page
    Then User Able To See Successfull Sign Up Screen

  @LoginDBS
  Scenario: Second Step User Want To Login Up In DBS
  Given User is able to sign up successfull in the sign up page
  When user want to click on login hyperlink
  And enter the login username
  And enter the login password
  And user click on login button
  Then User Able To See Successfull Login Screen
  
  @AddToCartDBS
  Scenario: Third Step User Want To Add Product In DBS Cart
  Given User is able to See successfull Login page
  When user click on the product one hyperlink
  And user click on the add to cart button one
  And user handle the alert of add to cart product one page 
  And user want to click on the home page hyperlink
  And user click on the product two hyperlink
  And user click on the add to cart button two
  And user handle the alert of add to cart product two page 
  And user want to click on the cart hyperlink
  Then User Able To See Successfull Add To Carts Screen
   
   
   @PlaceOrderDBS
  Scenario: Fourth Step User Want To Fill Place Order Details and Book The Product In DBS
  Given User is able to See successfull Add To Cart page
  When user click on the place order button
  And user enter the name
  And user enter the country name
  And user enter the city name
  And user enter the credit card details
  And user enter the month
  And user enter the year
  And User want to click on purchase button
  And user want to click last ok button and go to home
  Then User Successfully Purchase The Product In The DBS
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   

