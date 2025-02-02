package parallel;

import java.util.ArrayList;

import org.hooks.AppHooks;
import org.openqa.selenium.WebDriver;
import org.pages.PIMpage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PIMStepDefination {
	
	
	public WebDriver driver ;	
	public PIMpage pm;
	
	
	@Given("user_is_on_PIM_module_page")
	public void user_is_on_pim_module_page() {
		
	    pm=new PIMpage(AppHooks.driver);
	}
	
	@When("Enter LoginnPage Username_field")
	public void enter_loginn_page_username_field() {
	   
		pm.placeholder_Username_inputField();
		
	}
	@When("Enter LoginnPageee Password_field")
	public void enter_loginn_pageee_password_field() {
	  
		pm.placeholder_Password_inputField();
	}
	@When("Enter LoginnPageee submitBtn")
	public void enter_loginn_pageee_submit_btn() {
	   
		pm.submitBtn();
	}
	@Then("varify PIMPagee {string} IsDisplayed {string}")
	public void varify_pim_pagee_is_displayed(String string, String val) {
	  
		if(string.equalsIgnoreCase("Url"))
		{
			 AppHooks.ac.assertEquals(pm.CurrentUrl(),val);
			
		}
		else if(string.equalsIgnoreCase("Title"))
		{
	       AppHooks.ac.assertEquals(pm.Title(), val);		
		}
		else if(string.equalsIgnoreCase("PIMtext"))
		{
	       AppHooks.ac.assertEquals(pm.PIMtext(), val);		
		}
		
		
	}

	
	@When("Click PIMButton")
	public void click_pim_button() {
	     pm.PIMButton();
	}
	
	
	@When("Click Optional_Fieldslinktext")
	public void click_Optional_Fieldslinktext() {
	     pm.Optional_Fieldslinktext();
	}
	
	
	@When("Click Custom_Fieldslinktext")
	public void click_Custom_Fieldslinktext() {
	     pm.Custom_Fieldslinktext();
	}
	
	@When("Click Data_Importlinktext")
	public void click_Data_Importlinktext() {
	     pm.Data_Importlinktext();
	}
	
	@When("Click Reporting_Methodslinktext")
	public void click_Reporting_Methodslinktext() {
	     pm.Reporting_Methodslinktext();
	}
	
	@When("Click Termination_Reasonslinktext")
	public void click_Termination_Reasonslinktext() {
	     pm.Termination_Reasonslinktext();
	}
	
	
	
	
	
	
	
	@When("Click ConfigrationBTN")
	public void click_ConfigrationBTN() {
	     pm.ConfigrationBTN();
	}
	

	@Then("PIM page has {string},{string},{string},{string},{string}")
	public void pim_page_has(String tab1, String tab2, String tab3, String tab4, String tab5) {
	   
		ArrayList<String> ele = pm.ConfigrationOption();
		
		AppHooks.ac.assertEquals(ele.get(0),tab1);
		AppHooks.ac.assertEquals(ele.get(1),tab2);
		AppHooks.ac.assertEquals(ele.get(2),tab3);
		AppHooks.ac.assertEquals(ele.get(3),tab4);
		AppHooks.ac.assertEquals(ele.get(4),tab5);
		
		
		
	}

	
	

}
