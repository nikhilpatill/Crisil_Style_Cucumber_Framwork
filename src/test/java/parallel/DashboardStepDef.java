package parallel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hooks.AppHooks;
import org.pages.DashboardPage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DashboardStepDef {
	private DashboardPage dp_obj;
		

		@Given("user_is_on_dashboad_page")
		public void user_is_on_dashboad_page() {
			dp_obj = new DashboardPage(AppHooks.driver);
			AppHooks.scn.log("Dashboard page is displayed");
	    
			
		}
	   
		@When("Enter LoginPagee Username_field")
		public void enter_login_pagee_username_field() {
		 
			dp_obj.placeholder_Username_inputField();
			
		}
		@When("Enter LoginPagee Password_field")
		public void enter_login_pagee_password_field() {
			dp_obj.placeholder_Password_inputField();
		}
		@When("Enter LoginPagee submitBtn")
		public void enter_login_pagee_submit_btn() {
			dp_obj.submitBtn();
			
			
		}
		
		@When("click DashboadPage Assign_Leave")
		public void click_dashboad_page_assign_leave() {
			dp_obj.Assign_Leave();
		}
		
		@When("click DashboadPage Leave_List")
		public void click_dashboad_page_leave_list() {
			dp_obj.Leave_List(); 
		}
		
		@When("click DashboadPage Apply_Leave")
		public void click_dashboad_page_apply_leave() {
		   
			dp_obj.Apply_Leave();
		}
		
		@When("click DashboadPage Timesheets")
		public void click_dashboad_page_timesheets() {
			dp_obj.Timesheets();
		}

		
		
		@When("click Caret_down_fill")
		public void click_caret_down_fill() {
			
			dp_obj.Caret_down_fill();
		}
		
		
		@Then("varify DashboadPage {string} IsDisplayed {string}")
		public void varify_dashboad_page_is_displayed(String string, String val) {
		   
			if(string.equalsIgnoreCase("Url"))
			{
				
				AppHooks.ac.assertEquals(dp_obj.getDashboardURL(),val);	
				AppHooks.scn.log("Dashboard page URL is displayed as :"+dp_obj.getDashboardURL());
				
			}
			
			else if(string.equalsIgnoreCase("Title"))
			{
				
				AppHooks.ac.assertEquals(dp_obj.getDashboardTitle(),val);	
				AppHooks.scn.log("Dashboard page URL is displayed as :"+dp_obj.getDashboardTitle());
				
			}
			
			
			else if(string.equalsIgnoreCase("dashboadTxt"))
			{
				
				AppHooks.ac.assertEquals(dp_obj.dashboadTxt(),val);	
				AppHooks.scn.log("Dashboard page URL is displayed as :"+dp_obj.dashboadTxt());
				
			}
			
			else if(string.equalsIgnoreCase("AboutTXT"))
			{
				
				AppHooks.ac.assertEquals(dp_obj.AboutTXT(),val);	
				AppHooks.scn.log("Dashboard page URL is displayed as :"+dp_obj.AboutTXT());
				
			}
			
			
			
		}
		
		@When("click AboutOption")
		public void click_about_option() {
		
			dp_obj.AboutOption();
		
		}
		
		@When("click SupportOption")
		public void click_Support_Option() {
		
			dp_obj.SupportOption();
		
		}
		
		
		@When("click Change_PassworOption")
		public void click_Change_PassworOption() {
		
			dp_obj.Change_PassworOption();
		
		}
		
		
		@When("click LogoutOption")
		public void click_LogoutOption() {
		
			dp_obj.LogoutOption();
		
		}
		
		@Then("varify DashboadPage dashboadpage_Cards IsDisplayed")
		public void varify_dashboad_page_dashboadpage_cards_is_displayed() {
			AppHooks.ac.assertTrue(dp_obj.dashboadpage_Cards());
	    	AppHooks.scn.log("Dashboard page dashboadpage_Cards displayed as :"+dp_obj.dashboadpage_Cards());
		   
			
		}
		
		@Then("varify DashboadPage My_Actions_Cards_symbol IsDisplayed")
		public void varify_dashboad_page_My_Actions_Cards_symbol_is_displayed() {
			AppHooks.ac.assertTrue(dp_obj.My_Actions_Cards_symbol_symbol());
	    	AppHooks.scn.log("Dashboard page dashboadpage_Cards displayed as :"+dp_obj.My_Actions_Cards_symbol_symbol());
		   
			
		}
		
		@Then("varify DashboadPage quick_launch_Card_icon IsDisplayed")
		public void varify_dashboad_page_quick_launch_Card_icon_symbol_is_displayed() {
			AppHooks.ac.assertTrue(dp_obj.quick_launch_Card_icon());
	    	AppHooks.scn.log("Dashboard page dashboadpage_Cards displayed as :"+dp_obj.quick_launch_Card_icon());
		   
			
		}
		
		
		
		@When("Enter LoginPagee DashboardBtn")
		public void enter_login_pagee_dashboard_btn() {
		
			dp_obj.DashboardBtn();
		}
		
		@When("Enter LoginPagee AdminBtn")
		public void enter_login_pagee_admin_btn() {
			dp_obj.AdminBtn();
		}
		
		@When("Enter LoginPagee Directory")
		public void enter_login_pagee_directory() {
			dp_obj.Directory();
		}
		
		@When("Enter LoginPagee PerformanceBtn")
		public void enter_login_pagee_performance_btn() {
			dp_obj.PerformanceBtn();
		}
		
		@When("Enter LoginPagee Claim")
		public void enter_login_pagee_claim() {
			dp_obj.Claim();
		}
		
		@When("Enter LoginPagee Maintenance")
		public void enter_login_pagee_Maintenance() {
			dp_obj.Maintenance();
		}
		@When("Enter LoginPagee RecruitmentBtn")
		public void enter_login_pagee_recruitment_btn() {
			dp_obj.RecruitmentBtn();
		}
		
		
		@When("Enter LoginPagee My_InfoBtn")
		public void enter_login_pagee_my_info_btn() {
			dp_obj.My_InfoBtn();  
		}
		
		
		@When("Enter LoginPagee TimeBtn")
		public void enter_login_pagee_time_btn() {
		 
			dp_obj.TimeBtn();
		}
		
		@When("Enter LoginPagee PIMBtn")
		public void enter_login_pagee_pim_btn() {
			dp_obj.PIMBtn();
			
		}

	
	    @Then("Dashboard page has {int} tabs")
		public void dashboard_page_has_tabs(int expTabCount) {
	    	AppHooks.ac.assertTrue(dp_obj.getDashboardTabCount()== expTabCount);
	    	AppHooks.scn.log("Dashboard page tabs are displayed as :"+ dp_obj.getDashboardTabCount());
		   
		}
	    

	    @Then("Dashboard page has {int} DropdownList")
		public void dashboard_page_has_DropdownList(int expTabCount) {
	    	AppHooks.ac.assertTrue(dp_obj.Dropdown_Options()== expTabCount);
	    	AppHooks.scn.log("Dashboard page dropdown List are displayed as :"+dp_obj.Dropdown_Options());
		   
		}
		
		@Then("Dashboard page has {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
		public void dashboard_page_has(String tab1, String tab2, String tab3, String tab4,String tab5, String tab6, String tab7, String tab8,String tab9, String tab10, String tab11, String tab12) {
		  
		    ArrayList<String> actTabNames = dp_obj.getDashboardTabNames(); 
		    
		    AppHooks.ac.assertEquals(actTabNames.get(0),tab1);
		    AppHooks.ac.assertEquals(actTabNames.get(1),tab2);
		    AppHooks.ac.assertEquals(actTabNames.get(2),tab3);
		    AppHooks.ac.assertEquals(actTabNames.get(3),tab4);
		    AppHooks.ac.assertEquals(actTabNames.get(4),tab5);
		    AppHooks.ac.assertEquals(actTabNames.get(5),tab6);
		    AppHooks.ac.assertEquals(actTabNames.get(6),tab7);
		    AppHooks.ac.assertEquals(actTabNames.get(7),tab8);
		    AppHooks.ac.assertEquals(actTabNames.get(8),tab9);
		    AppHooks.ac.assertEquals(actTabNames.get(9),tab10);
		    AppHooks.ac.assertEquals(actTabNames.get(10),tab11);
		    AppHooks.ac.assertEquals(actTabNames.get(11),tab12);
		    AppHooks.ac.assertAll();
			AppHooks.scn.log("Dashboard page tabs names are as expected");
		}
		
		@Then("Dashboard DropdownList has {string},{string},{string},{string}")
		public void dashboard_DropdownList_has(String tab1, String tab2, String tab3, String tab4) {
		  
			ArrayList <String> actTabName= dp_obj.Dropdown_OptionsName();
			
			 AppHooks.ac.assertEquals(actTabName.get(0), tab1);
			 AppHooks.ac.assertEquals(actTabName.get(1), tab2);
			 AppHooks.ac.assertEquals(actTabName.get(2), tab3);
			 AppHooks.ac.assertEquals(actTabName.get(3), tab4);
		    AppHooks.ac.assertAll();
			AppHooks.scn.log("Dashboard page tabs names are as expected");
		}
		@Then("Dashboard page has {string}")
		public void dashboard_page_has(String tabs) {
			//String[] expTabNames = tabs.split(",");
			List<String> expList = Arrays.asList(tabs.split(","));
			ArrayList<String> actTabNames = dp_obj.getDashboardTabNames();
			Assert.assertTrue(actTabNames.containsAll(expList));
			//Assert.assertTrue((actTabNames.containsAll(expList))&&(expList.containsAll(actTabNames)));
			AppHooks.scn.log("Dashboard page tabs names are as expected");
		}
		
		@Then("{string} tab is selected")
		public void tab_is_selected(String tabName) {
			Assert.assertEquals(dp_obj.getSelectedTabName(),tabName);
			AppHooks.scn.log("Dashboard page selected tabs is : "+dp_obj.getSelectedTabName());
		   
		}
				
	}

