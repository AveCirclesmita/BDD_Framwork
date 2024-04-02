package com.cjc.cucumber.DemowebShop.page; //DemowebShop1 21.01.2023 BDD Cucumber Framework designing

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage {

	 //This Is BDD Cucumber Framework Performed On The Demo Web Shop Website.
	// TestNG BDD Cucumber Framework Script Created By The Harshit Bisen TB-18B Offline.
		WebDriver driver;
		static Logger log = Logger.getLogger(LogoutPage.class.getName());

		@FindBy(xpath = "//a[@class='ico-logout']")
		WebElement logout;

		public LogoutPage(WebDriver driver) {
			this.driver = driver;
		}

		public void logoutHyperlinkClickMethod() throws InterruptedException {
			Thread.sleep(1500);
			logout.click();
			log.info("Logout Check Is Successful");
		}
}
