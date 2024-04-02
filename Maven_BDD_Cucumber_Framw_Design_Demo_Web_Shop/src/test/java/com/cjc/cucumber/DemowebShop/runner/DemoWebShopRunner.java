package com.cjc.cucumber.DemowebShop.runner; 
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Features File/demowebshop.feature"},
tags = "@RegistrationDWS or @LogoutDWS or @LoginDWS or @AddToGiftCardDWS or @AddToBookDWS or @BillingDWS or @PayAndBookProductDWS",
glue = {"com.cjc.cucumber.DemowebShop.stepDef"},
plugin = {"pretty","html:target/destination.html"}, monochrome = true)
public class DemoWebShopRunner {
}
