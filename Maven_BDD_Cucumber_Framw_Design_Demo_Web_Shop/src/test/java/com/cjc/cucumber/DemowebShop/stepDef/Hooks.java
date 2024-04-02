package com.cjc.cucumber.DemowebShop.stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	
		@Before
		public void beforeScript()
		{
			System.out.println("Before The Script");
		}
		@After
		public void afterScript()
		{
			System.out.println("After The Script");
		}
}
