package com.cjc.cucumber.DemoBlaze.runner;   
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Features File/DemoBlaze.feature"},
tags = "@SignUpDBS or @LoginDBS or  @AddToCartDBS or @PlaceOrderDBS",
glue = {"com.cjc.cucumber.DemoBlaze.stepDef"},
plugin = {"pretty","html:target/destination.html"}, monochrome = true)
public class DemoBlazeRunner {
	
}
