package com.cjc.cucumber.Magento.runner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src//test//resources//Features File"},
tags = "@Registrationmagento or @Loginmagento or @ClickonManu or @AddtoCart or @Product_Add",
glue = {"com.cjc.cucumber.Magento_stepdef"},
plugin = {"pretty","html:target/destination.html"}, monochrome = true)
public class Runner 
{

}

