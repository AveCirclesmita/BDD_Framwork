package com.cjc.cucumber.DemoBlaze.stepDef; //20.01.2023 C-BDD Frame Work Designing

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class DemoBlazeHook {

	//This Cucumber Behavior Driven Development Framework Performed On the Demo Blaze Shop Web site
    // TestNG Cucumber Behavior Driven Development Framework Script Created By The Harshit Bisen TB-18B Offline.

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
