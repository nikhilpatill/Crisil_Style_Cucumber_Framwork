package org.stepDefinations;

import java.util.ArrayList;

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

public class N_AdminStepDef1 {

	public static WebDriver driver;
	private AdminPage ap;

	@Given("user_is_on_Admin_module_page")
	public void user_is_on_Admin_module_page() {

		ap = new AdminPage(AppHooks.driver);
	}

	@When("Enter LoginPageee Username_field")
	public void enter_login_pageee_username_field() {

		ap.placeholder_Username_inputField();

	}

	@When("Enter LoginPageee Title_field")
	public void enter_login_pageee_Title_field() {

	}

	@When("Enter JibTitlePage Job_Title_field")
	public void enter_jib_title_page_job_title_field() {

		ap.JobTitle_field();
	}

	@When("Enter JibTitlePage Job_Description_field")
	public void enter_jib_title_page_job_description_field() {

		ap.Job_Description();

	}

	@When("Enter JibTitlePage Note_field")
	public void enter_jib_title_page_note_field() {

		ap.Note();

	}

	@When("Enter JibTitlePage Job_Specification_Fileuplod_field")
	public void enter_jib_title_page_job_specification_fileuplod_field() {

		ap.Job_Specification_Fileuplod_field();

	}

	@When("Enter JibTitlePage SubmitBtn")
	public void enter_jib_title_page_submit_btn() {

		ap.title_page_submit_btn();

	}

	@When("Click Job_Pay GradesBtn")
	public void click_job_pay_grades_btn() {

		ap.Pay_GradesBtn();

	}

	@When("Enter Job_PayGradesPage Name_field")
	public void enter_job_pay_grades_page_name_field() {

		ap.Job_PayGradesPage_Name_field();

	}

	@When("Enter  Job_PayGradesPage SubmitBtn")
	public void enter_job_pay_grades_page_submit_btn() {

		ap.Job_PayGradesPage_submit_btn();
	}

	@When("Enter LoginPageee submitBtn")
	public void enter_login_pageee_submit_btn() {
		ap.submitBtn();
	}

	@When("Enter LoginPageee Password_field")
	public void enter_login_pageee_password_field() {
		ap.placeholder_Password_inputField();
	}

	@When("Click JobBtn")
	public void click_JobBtn() {

		ap.JobBtn();
	}

	@When("Click  Add_Btn")
	public void click_add_btn() {
		try {
			ap.AddBtn();
		} catch (Exception e) {

			System.out.println("does not click on ADD btn please check");
		}
	}

	@When("Click Job_TitlesBtn")
	public void click_Job_TitlesBtn() {

		ap.Job_TitlesBtn();
	}

	@When("Click Job_Work_ShiftsBtn")
	public void click_job_work_shifts_btn() {

		ap.Job_Work_ShiftsBtn();
	}

	@When("Enter Job_Work_Shifts_page Name_field")
	public void enter_job_work_shifts_page_name_field() {

		ap.Job_Work_Shifts_page_Name_field();
	}

	@When("Enter Job_Work_Shifts_page Working_Hours")
	public void enter_job_work_shifts_page_working_hours() {

		ap.enter_job_work_shifts_page_working_hours();
	}

	@When("Click EditBtn")
	public void click_edit_btn() {

		ap.EditBtn_btn();
	}

	
	
	@When("Enter Add Organization  Unit_Id_field")
	public void enter_add_organization_unit_id_field() {
		
		ap.Unit_Id_field();
		
	  
	}
	@When("Enter Add Organization  Name_field")
	public void enter_add_organization_name_field() {
		
		ap.Name_field();
	    
	}
	@When("Enter Add Organization  Description_field")
	public void enter_add_organization_description_field() {
	  
		ap.Description();
		
		
	}
	
	
	@When("Click OrganizationModule SubmitBtn")
	public void click_organization_module_submit_btn() {
	  
		ap.click_organization_module_submit_btn();
		
	}
	
	
	
	
	
	@When("Enter  Job_Work_Shifts_page SubmitBtn")
	public void enter_job_work_shifts_page_submit_btn() {

		ap.Job_Work_Shifts_page_submit_btn();
	}
	
		@When("Enter Add_Organization_Unit Save_btn")
		public void enter_add_organization_unit_save_btn() {
		   
			ap.Add_Organization_Unit_Save_btn();
		}




	@When("Click Job_CategoriesBtn")
	public void click_Job_CategoriesBtn() {

		ap.Job_CategoriesBtn();
	}

	@When("Click Pay_GradesBtn")
	public void click_Pay_GradesBtn() {

		ap.Pay_GradesBtn();
	}

	@When("Click Employment_StatusBtn")
	public void click_Employment_StatusBtn() {

		ap.Employment_StatusBtn();
	}

	@When("Click Work_ShiftsBtn")
	public void Work_ShiftsBtn() {

		ap.Work_ShiftsBtn();
	}

	@When("Click General_InformationBtn")
	public void click_General_InformationBtn() {

		ap.General_InformationBtn();
	}

	@When("Enter Job_Work_Shifts_page Working_Minut")
	public void enter_job_work_shifts_page_working_minut() {
		ap.enter_job_work_shifts_page_working_minut();
	}

	@When("Click OrganizationBtn")
	public void click_OrganizationBtn() {

		ap.OrganizationBtn();
	}

	@When("Click StructureBtn")
	public void click_StructureBtnBtn() {

		ap.StructureBtn();
	}

	@When("Click LocationsBtn")
	public void click_LocationsBtnBtn() {

		ap.LocationsBtn();
	}

	@When("Click LDAP_Configuration")
	public void click_LDAP_Configuration() {

		ap.LDAP_Configuration();
	}

	@When("Click ConfigurationBtn")
	public void click_ConfigurationBtn() {

		ap.ConfigurationBtn();
	}

	@When("Click Email_Configurationbtn")
	public void click_Email_Configurationbtn() {

		ap.Email_Configurationbtn();
	}

	@When("Click EmailSubscriptionsbth")
	public void click_EmailSubscriptionsbth() {

		ap.EmailSubscriptionsbth();
	}

	@When("Click Localization")
	public void click_Localization() {

		ap.Localization();
	}

	@When("Click Language_Packages")
	public void click_Language_Packages() {

		ap.Language_Packages();
	}

	@When("Click Modules")
	public void click_Modules() {

		ap.Modules();
	}

	@When("Click Social_Media_Authentication")
	public void click_Social_Media_Authentication() {

		ap.Social_Media_Authentication();
	}

	@When("Click Register_OAuth_Client")
	public void click_Register_OAuth_Client() {

		ap.Register_OAuth_Client();
	}

	@When("Click Admin_module")
	public void click_admin_module() {

		ap.AdminBtn();
	}

	@When("Click QualificationsBtn")
	public void click_QualificationsBtn() {

		ap.QualificationsBtn();
	}

	@When("Click SkillsBtn")
	public void click_SkillsBtn() {

		ap.SkillsBtn();
	}

	@When("Click EducationBtn")
	public void click_EducationBtn() {

		ap.EducationBtn();
	}

	@When("Click LicensesBtn")
	public void click_LicensesBtn() {

		ap.LicensesBtn();
	}

	@When("Click LangesBtn")
	public void click_LangesBtn() {

		ap.LanguagesBtn();
	}

	@When("Click membershipBtn")
	public void click_membershipBtn() {

		ap.MembershipsBtn();
	}

	@When("Click Job_Employment_StatusBtn")
	public void click_job_employment_status_btn() {

		ap.Employment_StatusBtn();

	}

	@When("Enter  Job_Employment_StatusPage SubmitBtn")
	public void enter_job_employment_status_page_submit_btn() {

		ap.Job_Employment_StatusPage_submit_btn();
	}

	@When("Click Job_Category")
	public void click_job_category() {

		ap.Job_PayGradesPage_Name_field();
	}

	@When("Enter Job_CategoryPage Name_field")
	public void enter_job_category_page_name_field() {
		ap.Job_CategoryPage_Name_field();
	}

	@When("Enter  Job_CategoryPage SubmitBtn")
	public void enter_job_category_page_submit_btn() {

		ap.Job_CategoryPage_submit_btn();
	}

	@When("Click UserBtn")
	public void click_UserBtn() {

		ap.UserBtn();
		;
	}

	

	@When("Click Save_Btn")
	public void click_UserRoll() {

		ap.UserRoll();
	}

	@When("Click Job_DeleteAction")
	public void click_job_delete_action() {
		ap.Job_DeleteAction_perform();
	}

	@When("Click Job_EditAction")
	public void click_job_edit_action() {

		ap.Job_EditAction_perform();

	}

	@When("Click JobJob_Work_Shifts_EditAction")
	public void click_job_job_work_shifts_edit_action() {
		ap.click_job_job_work_shifts_edit_action();

	}

	@When("Click SystemUser_ADD_BTN")
	public void SystemUser_ADD_BTN() {

		ap.SystemUser_ADD_BTN();
	}

	@When("Click User_ManagementBtn")
	public void click_User_ManagementBtn() {

		ap.User_ManagementBtn();
	}

	@Then("ADDUsers_labels page has {string},{string},{string},{string},{string},{string}")
	public void ADDUsers_labels_page_has(String tag1, String tag2, String tag3, String tag4, String tag5, String tag6) {

		ArrayList<String> ele = ap.ADDUsers_labels();

		AppHooks.ac.assertEquals(ele.get(0), tag1);

		AppHooks.ac.assertEquals(ele.get(1), tag2);

		AppHooks.ac.assertEquals(ele.get(2), tag3);

		AppHooks.ac.assertEquals(ele.get(3), tag4);

		AppHooks.ac.assertEquals(ele.get(4), tag5);

		AppHooks.ac.assertEquals(ele.get(5), tag6);

	}

	@Then("System_Users_labels page has {string},{string},{string},{string}")
	public void system_users_labels_page_has(String tag1, String tag2, String tag3, String tag4) {

		ArrayList<String> ele = ap.System_Users_labels();

		AppHooks.ac.assertEquals(ele.get(0), tag1);

		AppHooks.ac.assertEquals(ele.get(1), tag2);

		AppHooks.ac.assertEquals(ele.get(2), tag3);

		AppHooks.ac.assertEquals(ele.get(3), tag4);

	}

	@Then("Qualifications_navOption page has {string},{string},{string},{string},{string}")
	public void Qualifications_navOption_module_page_has(String tag1, String tag2, String tag3, String tag4,
			String tag5) {

		ArrayList<String> ele = ap.Qualifications_navOption();
		AppHooks.ac.assertEquals(ele.get(0), tag1);
		AppHooks.ac.assertEquals(ele.get(1), tag2);
		AppHooks.ac.assertEquals(ele.get(2), tag3);
		AppHooks.ac.assertEquals(ele.get(3), tag4);
		AppHooks.ac.assertEquals(ele.get(4), tag5);

	}

	@Then("ConfigurationModule page has {string},{string},{string},{string},{string},{string},{string},{string}")
	public void configuration_module_page_has(String tag1, String tag2, String tag3, String tag4, String tag5,
			String tag6, String tag7, String tag8) {
		ArrayList<String> ele = ap.Admin_ConfigurationOption();
		AppHooks.ac.assertEquals(ele.get(0), tag1);
		AppHooks.ac.assertEquals(ele.get(1), tag2);
		AppHooks.ac.assertEquals(ele.get(2), tag3);
		AppHooks.ac.assertEquals(ele.get(3), tag4);
		AppHooks.ac.assertEquals(ele.get(4), tag5);
		AppHooks.ac.assertEquals(ele.get(5), tag6);
		AppHooks.ac.assertEquals(ele.get(6), tag7);
		AppHooks.ac.assertEquals(ele.get(7), tag8);

	}

	@Then("AdminModule page has {string},{string},{string},{string},{string}")
	public void AdminModule_page_has(String tag1, String tag2, String tag3, String tag4, String tag5) {

		ArrayList<String> element = ap.Admin_navOptionname();

		AppHooks.ac.assertEquals(element.get(0), tag1);
		AppHooks.ac.assertEquals(element.get(1), tag2);
		AppHooks.ac.assertEquals(element.get(2), tag3);
		AppHooks.ac.assertEquals(element.get(3), tag4);
		AppHooks.ac.assertEquals(element.get(4), tag5);

	}

	@Then("JobModule page has {string},{string},{string},{string},{string}")
	public void JobModule_page_has(String tag1, String tag2, String tag3, String tag4, String tag5) {

		ArrayList<String> element = ap.AdminJobOptions();

		AppHooks.ac.assertEquals(element.get(0), tag1); // true
		AppHooks.ac.assertEquals(element.get(1), tag2);
		AppHooks.ac.assertEquals(element.get(2), tag3);
		AppHooks.ac.assertEquals(element.get(3), tag4);
		AppHooks.ac.assertEquals(element.get(4), tag5);

	}

	@Then("OrganizationModule page has {string},{string},{string}")
	public void OrganizationModule_page_has(String tag1, String tag2, String tag3) {

		ArrayList<String> element = ap.Admin_organizationOption();

		AppHooks.ac.assertEquals(element.get(0), tag1);
		AppHooks.ac.assertEquals(element.get(1), tag2);
		AppHooks.ac.assertEquals(element.get(2), tag3);

	}

	@Then("varify DashboadPagee {string} IsDisplayed {string}")
	public void varify_dashboad_pagee_is_displayed(String http, String val) {

		if (http.equalsIgnoreCase("Url")) {
			AppHooks.ac.assertEquals(ap.CurrentUrl(), val);
			AppHooks.ac.assertAll();
		} else if (http.equalsIgnoreCase("Title")) {
			AppHooks.ac.assertEquals(ap.Title(), val);
			AppHooks.ac.assertAll();
		} else if (http.equalsIgnoreCase("dashboadTxt")) {
			AppHooks.ac.assertEquals(ap.dashboadTxt(), val);
			AppHooks.ac.assertAll();
		} else if (http.equalsIgnoreCase("MessageTxt")) {
			AppHooks.ac.assertEquals(ap.SuccessMessageTxt(), val);
			AppHooks.ac.assertAll();
		}

		else if (http.equalsIgnoreCase("ErrorMessageTxt")) {
			AppHooks.ac.assertEquals(ap.ErrorMessageTxt(), val);
			AppHooks.ac.assertAll();
		}

	}

}
