package org.stepDefinations;

import java.time.Duration;
import java.util.ArrayList;

import org.hooks.AppHooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pages.AdminPage;
import org.pages.LoginPage;
import org.testng.Assert;
import org.utilities.BaseUtility;
import org.utilities.ConfigReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminpageOpeartion {

	WebDriver driver = AppHooks.driver;
	AdminPageObject adminPageObject;
	Compoent_Operation Compoent_Operation;

	public AdminpageOpeartion(WebDriver driver) {

		adminPageObject = new AdminPageObject();
		Compoent_Operation = new Compoent_Operation();

	}
	
	

	public void enterInTextfield(String inputtext, String textfiledlabel) throws InterruptedException {
		Waitlogic.waitForSecond(1);
		Compoent_Operation.insertXpathElementText(adminPageObject.getinputTextFieldNameXpat(textfiledlabel), inputtext);
		Compoent_Operation.waitForsecond(3);
	}

	public void enterInTextfieldeployeename(String inputtext, String textfiledlabel) throws InterruptedException {
		Waitlogic.waitForSecond(1);
		Compoent_Operation.insertEployeenameText(adminPageObject.getinputTextFieldNameXpat(textfiledlabel), inputtext);
		Compoent_Operation.waitForsecond(3);
	}

	public void clickonTextfieldDropdown(String inputtext, String textfiledlabel) {
		Waitlogic.waitForSecond(1);
		Compoent_Operation.clickElemet(adminPageObject.clickOnDropdown(textfiledlabel));
		Compoent_Operation.waitForsecond(1);
		Compoent_Operation.clickElemet(adminPageObject.clickOnDropdownvalue(inputtext));
		Compoent_Operation.waitForsecond(3);

	}

	public void clickloginnbutton(String textfiledlabel) {

		Compoent_Operation.clickElemet(adminPageObject.clickOnButton(textfiledlabel));

	}

	public void varify_CurrentUrl(String ExpectdUrl) {
		Waitlogic.waitForSecond(1);
		AppHooks.ac.assertEquals(Compoent_Operation.getCurrentURL(), ExpectdUrl);

	}

	public void varify_CurrentTitle(String ExpectdUrl) {
		Waitlogic.waitForSecond(1);
		AppHooks.ac.assertEquals(Compoent_Operation.getCurrentTitle(), ExpectdUrl);

	}

	public void varify_CurrentText(String ExpectdUrl) {
		Waitlogic.waitForSecond(1);
		AppHooks.ac.assertEquals(Compoent_Operation.getElemettext(adminPageObject.adminText(ExpectdUrl)), ExpectdUrl);

	}

}
