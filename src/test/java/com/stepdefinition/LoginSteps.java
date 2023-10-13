package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.libglobal.BaseClass;
import com.pages.AdactinLoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends BaseClass {

	@Given("User is on adactin login page")
	public void user_is_on_adactin_login_page() {

	}

	@When("User enters username and password and click on login button")
	public void user_enters_username_and_password_and_click_on_login_button(io.cucumber.datatable.DataTable dataTable) {

		List<Map<String, String>> list = dataTable.asMaps();
		Map<String, String> mp = list.get(0);

		AdactinLoginPage loginPage = new AdactinLoginPage();
		elementSendKeys(loginPage.getTxtUserName(), mp.get("userName"));
		elementSendKeys(loginPage.getTxtPassword(), mp.get("password"));
		elementClick(loginPage.getBtnLogin());

	}

	@Then("User verify login success message")
	public void user_verify_login_success_message() {
		Assert.assertTrue("verify", false);
	}

	@When("User enters {string} and {string} and click on login button")
	public void user_enters_and_and_click_on_login_button(String userName, String password) {
		AdactinLoginPage loginPage = new AdactinLoginPage();
		elementSendKeys(loginPage.getTxtUserName(), userName);
		elementSendKeys(loginPage.getTxtPassword(), password);
		elementClick(loginPage.getBtnLogin());
	}
}
