package com.stepdefinition;

import com.libglobal.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {

	@Before
	public void beforeScenario() {
		System.out.println("before...");
		launchBrowser("chrome");
		maximizeWindow();
		implicitWait(20);
		loadUrl("https://adactinhotelapp.com/");

	}

	@After
	public void afterScenario(Scenario scenario) {
		System.out.println("after...");
		if (scenario.isFailed()) {// scenario failed -->true
			scenario.embed(takeScreenshot(), "image/png");
		}
		deleteCookies();
		closeBrowser();

	}

}
