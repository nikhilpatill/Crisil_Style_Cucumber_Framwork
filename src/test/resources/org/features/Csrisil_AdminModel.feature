 
 @date
Feature: Login Functionality

   Scenario: verify Dashboad page
    Given user_is_on_Admin_module_pageee
    When Enter "Admin" in "Username" field
    When Enter "admin123" in "password" field
    When Click on "Login" button
    Then varify DashboadPagee "Url" IsDisplayedd "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"
    Then varify DashboadPagee "Title" IsDisplayedd "OrangeHRM"
  

    Scenario: verify Dashboad Admin_page
    Given user_is_on_Admin_module_pageee
    When Enter "Admin" in "Username" field
    When Enter "admin123" in "password" field
    When Click on "Login" button
    When Click on "Admin" button
    When Click on "Add" button
    Then varify DashboadPagee "TXT" IsDisplayedd "Add User"
    When click "Admin" in "User Role" field
    When Enter "R" in "Employee Name" field
    When click "Enabled" in "Status" field
    When Enter "nikhilpatil" in "AddUsername" field   
    When Enter "nik@1345" in "AddPassword" field  
    When Enter "nik@1345" in "AddConfirm Password" field 
    When Click on "Save" button 
    When Click on "nikhilpatil" button 
     
    
    
   
  
      
    
    