
Feature: Dashboard page feature
  
  @smoke
   Scenario: verify Dashboad page
    Given user_is_on_dashboad_page
    When Enter LoginPagee Username_field
    When Enter LoginPagee Password_field
    When Enter LoginPagee submitBtn
    Then varify DashboadPage "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"
    Then varify DashboadPage "Title" IsDisplayed "OrangeHRM"
    Then varify DashboadPage "dashboadTxt" IsDisplayed "Dashboard"

 
  Scenario: Verify Dashboard page number of tabs
    Given user_is_on_dashboad_page
    When Enter LoginPagee Username_field
    When Enter LoginPagee Password_field
    When Enter LoginPagee submitBtn
    Then Dashboard page has 12 tabs
 

  Scenario: Verify Dashboard page tab names
  Given user_is_on_dashboad_page
    When Enter LoginPagee Username_field
    When Enter LoginPagee Password_field
    When Enter LoginPagee submitBtn
    Then Dashboard page has "Admin","PIM","Leave","Time","Recruitment","My Info","Performance","Dashboard","Directory","Maintenance","Claim","Buzz"
  
   Scenario: verify Dashboad page
    Given user_is_on_dashboad_page
    When Enter LoginPagee Username_field
    When Enter LoginPagee Password_field
    When Enter LoginPagee submitBtn
    Then varify DashboadPage "Url" IsDisplayed ""
 @smoke
   Scenario: verify Dashboad page
    Given user_is_on_dashboad_page
    When Enter LoginPagee Username_field
    When Enter LoginPagee Password_field
    When Enter LoginPagee submitBtn
     When Enter LoginPagee AdminBtn
    Then varify DashboadPage "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers"
    
     @smoke
   Scenario: verify Dashboad page
    Given user_is_on_dashboad_page
    When Enter LoginPagee Username_field
    When Enter LoginPagee Password_field
    When Enter LoginPagee submitBtn
    When Enter LoginPagee PIMBtn
    Then varify DashboadPage "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList"
   
   
   Scenario: verify Dashboad page
    Given user_is_on_dashboad_page
    When Enter LoginPagee Username_field
    When Enter LoginPagee Password_field
    When Enter LoginPagee submitBtn
    When Enter LoginPagee TimeBtn
    Then varify DashboadPage "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/time/viewEmployeeTimesheet"
    
      
   Scenario: verify Dashboad page
    Given user_is_on_dashboad_page
    When Enter LoginPagee Username_field
    When Enter LoginPagee Password_field
      When Enter LoginPagee submitBtn
    When Enter LoginPagee RecruitmentBtn
    Then varify DashboadPage "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/recruitment/viewCandidates"
    
  
   Scenario: verify Dashboad page
    Given user_is_on_dashboad_page
    When Enter LoginPagee Username_field
    When Enter LoginPagee Password_field
      When Enter LoginPagee submitBtn
    When Enter LoginPagee My_InfoBtn
    Then varify DashboadPage "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewPersonalDetails/empNumber/7"
    
    
   Scenario: verify Dashboad page
    Given user_is_on_dashboad_page
    When Enter LoginPagee Username_field
    When Enter LoginPagee Password_field
      When Enter LoginPagee submitBtn
    When Enter LoginPagee PerformanceBtn
    Then varify DashboadPage "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/performance/searchEvaluatePerformanceReview"
    
    
   Scenario: verify Dashboad page
    Given user_is_on_dashboad_page
    When Enter LoginPagee Username_field
    When Enter LoginPagee Password_field
      When Enter LoginPagee submitBtn
    When Enter LoginPagee DashboardBtn
    Then varify DashboadPage "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"
    
   
   Scenario: verify Dashboad page
    Given user_is_on_dashboad_page
    When Enter LoginPagee Username_field
    When Enter LoginPagee Password_field
      When Enter LoginPagee submitBtn
    When Enter LoginPagee Directory
    Then varify DashboadPage "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/directory/viewDirectory"
    
  
  
   Scenario: verify Dashboad page
    Given user_is_on_dashboad_page
    When Enter LoginPagee Username_field
    When Enter LoginPagee Password_field
      When Enter LoginPagee submitBtn
    When Enter LoginPagee Maintenance
    Then varify DashboadPage "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/maintenance/purgeEmployee"
    
   
   Scenario: verify Dashboad page
    Given user_is_on_dashboad_page
    When Enter LoginPagee Username_field
    When Enter LoginPagee Password_field
      When Enter LoginPagee submitBtn
    When Enter LoginPagee Claim
    Then varify DashboadPage "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/claim/viewAssignClaim"
  
    Scenario: Verify Dashboard page DropdownList Menu
    Given user_is_on_dashboad_page
    When Enter LoginPagee Username_field
    When Enter LoginPagee Password_field
    When Enter LoginPagee submitBtn
     When click Caret_down_fill
    And Dashboard page has 4 DropdownList
 
   Scenario: Verify Dashboard page DropdownList names
  Given user_is_on_dashboad_page
    When Enter LoginPagee Username_field
    When Enter LoginPagee Password_field
    When Enter LoginPagee submitBtn
     When click Caret_down_fill
    And Dashboard DropdownList has "About","Support","Change Password","Logout"
    
     
    Scenario: Verify Dashboard page DropdownList AboutOption Menu
    Given user_is_on_dashboad_page
    When Enter LoginPagee Username_field
    When Enter LoginPagee Password_field
    When Enter LoginPagee submitBtn
    When click Caret_down_fill
    When click AboutOption
    Then varify DashboadPage "AboutTXT" IsDisplayed "About"
   
   
     
    Scenario: Verify Dashboard page DropdownList SupportOption Menu
    Given user_is_on_dashboad_page
    When Enter LoginPagee Username_field
    When Enter LoginPagee Password_field
    When Enter LoginPagee submitBtn
    When click Caret_down_fill
    When click SupportOption
    Then varify DashboadPage "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/help/support"
    
    
     
    Scenario: Verify Dashboard page DropdownList Change_PassworOption Menu
    Given user_is_on_dashboad_page
    When Enter LoginPagee Username_field
    When Enter LoginPagee Password_field
    When Enter LoginPagee submitBtn
    When click Caret_down_fill
    When click Change_PassworOption
    Then varify DashboadPage "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/pim/updatePassword"
    
     
    Scenario: Verify Dashboard page DropdownList LogoutOption Menu
    Given user_is_on_dashboad_page
    When Enter LoginPagee Username_field
    When Enter LoginPagee Password_field
    When Enter LoginPagee submitBtn
    When click Caret_down_fill
    When click LogoutOption
    Then varify DashboadPage "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    
    
    Scenario: Verify Dashboard page dashboadpage_Cards
    Given user_is_on_dashboad_page
    When Enter LoginPagee Username_field
    When Enter LoginPagee Password_field
    When Enter LoginPagee submitBtn
   Then varify DashboadPage dashboadpage_Cards IsDisplayed
    
     
    Scenario: Verify Dashboard page dashboadpage_Cards
    Given user_is_on_dashboad_page
    When Enter LoginPagee Username_field
    When Enter LoginPagee Password_field
    When Enter LoginPagee submitBtn
    Then varify DashboadPage My_Actions_Cards_symbol IsDisplayed
    
   
    Scenario: Verify Dashboard page quick_launch_Cards
    Given user_is_on_dashboad_page
    When Enter LoginPagee Username_field
    When Enter LoginPagee Password_field
    When Enter LoginPagee submitBtn
    Then varify DashboadPage quick_launch_Card_icon IsDisplayed
    
   
   Scenario: Verify Dashboard page quick_launch_Cards
    Given user_is_on_dashboad_page
    When Enter LoginPagee Username_field
    When Enter LoginPagee Password_field
    When Enter LoginPagee submitBtn
     When click DashboadPage Assign_Leave
     Then varify DashboadPage "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/leave/assignLeave"
     
      
 
    Scenario: Verify Dashboard page quick_launch_Cards
    Given user_is_on_dashboad_page
    When Enter LoginPagee Username_field
    When Enter LoginPagee Password_field
    When Enter LoginPagee submitBtn
     When click DashboadPage Leave_List
     Then varify DashboadPage "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/leave/viewLeaveList"
     
   
    
    Scenario: Verify Dashboard page quick_launch_Cards
    Given user_is_on_dashboad_page
    When Enter LoginPagee Username_field
    When Enter LoginPagee Password_field
    When Enter LoginPagee submitBtn
    When click DashboadPage Apply_Leave
    Then varify DashboadPage "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/leave/applyLeave"
      
     
    Scenario: Verify Dashboard page quick_launch_Cards
    Given user_is_on_dashboad_page
    When Enter LoginPagee Username_field
    When Enter LoginPagee Password_field
    When Enter LoginPagee submitBtn
    When click DashboadPage Leave_List
    Then varify DashboadPage "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/leave/viewLeaveList"
     
   
    Scenario: Verify Dashboard page quick_launch_Cards
    Given user_is_on_dashboad_page
    When Enter LoginPagee Username_field
    When Enter LoginPagee Password_field
    When Enter LoginPagee submitBtn
    When click DashboadPage Timesheets
    Then varify DashboadPage "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/time/viewEmployeeTimesheet"
      
      
      
      
  