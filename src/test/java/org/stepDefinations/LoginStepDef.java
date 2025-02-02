package org.stepDefinations;

import org.hooks.AppHooks;
import org.openqa.selenium.WebDriver;
import org.pages.LoginPage;
import org.testng.Assert;
import org.utilities.BaseUtility;
import org.utilities.ConfigReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {

	public static WebDriver driver;
	private LoginPage lp;

	String Username;
	String Password;

	@When("Enter LoginPage {string} in Username_field")
	public void enter_login_page_in_username_field(String Username) {

		this.Username = Username;

	}

	@When("Enter LoginPage {string} in Password_field")
	public void enter_login_page_in_password_field(String string) {

		this.Password = Password;
	}

	@Given("user_is_on_LoginPage")
	public void user_is_on_login_page() {

		lp = new LoginPage(AppHooks.driver);
	}

	@When("When Enter LoginPage Reset_usernameinputfiled")
	public void when_enter_login_page_reset_usernameinputfiled() {

		lp.Reset_usernameinputfiled();
	}

	@When("Enter LoginPage Username_field")
	public void enter_login_page_username_field() {

		lp.placeholder_Username_inputField();

	}

	@When("Enter LoginPage Password_field")
	public void enter_login_page_password_field() {
		lp.placeholder_Password_inputField();
	}

	@When("Enter LoginPage submitBtn")
	public void enter_login_page_submit_btn() {
		lp.submitBtn();
	}

	@When("Enter LoginPag Reset_Cancalbtn")
	public void enter_login_pag_reset_cancalbtn() {

		lp.Reset_Cancalbtn();
	}

	@When("Enter LoginPage forgetpasswordclick")
	public void enter_login_page_forgetpasswordclick() {

		lp.forgetpasswordclick();
		AppHooks.scn.log("Forget password Button Click ");
	}

	@When("Enter LoginPage  Reset_usernameinputfiled")
	public void enter_login_page_reset_usernameinputfiled() {
		lp.Reset_usernameinputfiled();

	}

	@When("Enter LoginPag  Reset_Passwordbtn")
	public void enter_login_pag_reset_passwordbtn() {

		lp.Reset_Passwordbtn();

	}

	@Then("varify LoginPage {string} IsDisplayed {string}")
	public void varify_login_page_is_displayed(String http, String val) {

		if (http.equalsIgnoreCase("Url")) {
			AppHooks.ac.assertEquals(lp.CurrentUrl(), val);
			AppHooks.ac.assertAll();
		} else if (http.equalsIgnoreCase("Title")) {
			AppHooks.ac.assertEquals(lp.Title(), val);
			AppHooks.ac.assertAll();
		} else if (http.equalsIgnoreCase("Login_txt")) {
			AppHooks.ac.assertEquals(lp.Login_txt(), val);
			AppHooks.ac.assertAll();
		} else if (http.equalsIgnoreCase("Username_Admin_txt")) {
			AppHooks.ac.assertEquals(lp.Username_Admin_txt(), val);
			AppHooks.ac.assertAll();
		} else if (http.equalsIgnoreCase("Reset_Password_link_sent_successfully")) {
			AppHooks.ac.assertEquals(lp.Reset_Password_link_sent_successfully(), val);
			AppHooks.ac.assertAll();
		} else if (http.equalsIgnoreCase("Password_admin123_txt")) {
			AppHooks.ac.assertEquals(lp.Password_admin123_txt(), val);
			AppHooks.ac.assertAll();
		}

		else if (http.equalsIgnoreCase("Username_txt")) {
			AppHooks.ac.assertEquals(lp.Username_txt(), val);
			AppHooks.ac.assertAll();
		}

		else if (http.equalsIgnoreCase("Password_txt")) {
			AppHooks.ac.assertEquals(lp.Password_txt(), val);
			AppHooks.ac.assertAll();
		}

		else if (http.equalsIgnoreCase("placeholder_Username_txt")) {
			AppHooks.ac.assertEquals(lp.placeholder_Username_txt(), val);
			AppHooks.ac.assertAll();
		}

		else if (http.equalsIgnoreCase("placeholder_Password_txt")) {
			AppHooks.ac.assertEquals(lp.placeholder_Password_txt(), val);
			AppHooks.ac.assertAll();
		}

		else if (http.equalsIgnoreCase("dashboadTxt")) {
			AppHooks.ac.assertEquals(lp.dashboadTxt(), val);
			AppHooks.ac.assertAll();
		}

		else if (http.equalsIgnoreCase("Errormessage")) {
			AppHooks.ac.assertEquals(lp.Errormessage(), val);
			AppHooks.ac.assertAll();
		}

		else if (http.equalsIgnoreCase("forgetpasswordTxt")) {
			AppHooks.ac.assertEquals(lp.forgetpasswordTxt(), val);
			AppHooks.ac.assertAll();
		}

		else if (http.equalsIgnoreCase("Reset_PasswordTxt")) {
			AppHooks.ac.assertEquals(lp.Reset_PasswordTxt(), val);
			AppHooks.ac.assertAll();
		}

	}

}