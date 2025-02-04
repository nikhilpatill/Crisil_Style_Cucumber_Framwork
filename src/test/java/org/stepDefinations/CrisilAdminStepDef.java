package org.stepDefinations;

import java.util.ArrayList;

import org.BaseUtility.startUp;
import org.hooks.AppHooks;
import org.openqa.selenium.WebDriver;
import org.pages.AdminPage;
import org.pages.LoginPage;
import org.testng.Assert;
import org.utilities.BaseUtility;
import org.utilities.ConfigReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CrisilAdminStepDef {

	public static WebDriver driver;
	AdminpageOpeartion adminpageOpeartion;
	public static startUp sb;

	public CrisilAdminStepDef() {
		adminpageOpeartion = new AdminpageOpeartion(AppHooks.driver);
		sb = new startUp();

	}

	@Given("user_is_on_Admin_module_pageee")
	public void user_is_on_admin_module_pageee() {

	}

	@When("Enter {string} in {string} field")
	public void enter_in_field(String inputtext, String textFieldLabel) throws InterruptedException {

		if (textFieldLabel.equalsIgnoreCase("Username")) {
			adminpageOpeartion.enterInTextfield(inputtext, textFieldLabel);

		} else if (textFieldLabel.equalsIgnoreCase("password")) {
			adminpageOpeartion.enterInTextfield(inputtext, textFieldLabel);

		} else if (textFieldLabel.equalsIgnoreCase("AddUsername")) {
			adminpageOpeartion.enterInTextfield(inputtext, textFieldLabel);

		} else if (textFieldLabel.equalsIgnoreCase("AddPassword")) {
			adminpageOpeartion.enterInTextfield(inputtext, textFieldLabel);

		} else if (textFieldLabel.equalsIgnoreCase("AddConfirm Password")) {
			adminpageOpeartion.enterInTextfield(inputtext, textFieldLabel);

		} else if (textFieldLabel.equalsIgnoreCase("Employee Name")) {
			adminpageOpeartion.enterInTextfieldeployeename(inputtext, textFieldLabel);

		}

	}

	@When("click {string} in {string} field")
	public void click_in_field(String inputtext, String textFieldLabel) {

		if (textFieldLabel.equalsIgnoreCase("User Role")) {
			adminpageOpeartion.clickonTextfieldDropdown(inputtext, textFieldLabel);

		} else if (textFieldLabel.equalsIgnoreCase("Status")) {
			adminpageOpeartion.clickonTextfieldDropdown(inputtext, textFieldLabel);

		}

	}

	@When("Click on {string} button")
	public void click_on_button(String txt) {

		if (txt.equalsIgnoreCase("nikhilpatil")) {

			adminpageOpeartion.delete_user(txt);

		} else {
			adminpageOpeartion.clickloginnbutton(txt);

		}

	}

	@Then("varify DashboadPagee {string} IsDisplayedd {string}")
	public void varify_dashboad_pagee_is_displayedd(String Label, String expectedtext) {

		if (Label.equalsIgnoreCase("Url")) {
			adminpageOpeartion.varify_CurrentUrl(expectedtext);

		} else if (Label.equalsIgnoreCase("Title")) {
			adminpageOpeartion.varify_CurrentTitle(expectedtext);

		} else if (Label.equalsIgnoreCase("TXT")) {
			adminpageOpeartion.varify_CurrentText(expectedtext);

		}

	}

}
