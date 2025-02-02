  
Feature: PIM  Functionality

 
    Scenario: verify PIM page
    Given user_is_on_PIM_module_page
    When Enter LoginnPage Username_field
    When Enter LoginnPageee Password_field
    When Enter LoginnPageee submitBtn
    When Click PIMButton 
    Then varify PIMPagee "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList"
    Then varify PIMPagee "Title" IsDisplayed "OrangeHRM"
      

     
    Scenario: verify PIM page
    Given user_is_on_PIM_module_page
    When Enter LoginnPage Username_field
    When Enter LoginnPageee Password_field
    When Enter LoginnPageee submitBtn
    When Click PIMButton 
    Then varify PIMPagee "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList"
    Then varify PIMPagee "Title" IsDisplayed "OrangeHRM"
    Then varify PIMPagee "PIMtext" IsDisplayed "PIM"
       
      
   Scenario: verify PIM page
    Given user_is_on_PIM_module_page
    When Enter LoginnPage Username_field
    When Enter LoginnPageee Password_field
    When Enter LoginnPageee submitBtn
    When Click PIMButton 
    When Click ConfigrationBTN 
    Then PIM page has "Optional Fields","Custom Fields","Data Import","Reporting Methods","Termination Reasons"
    
    
    
      Scenario: verify PIM page
    Given user_is_on_PIM_module_page
    When Enter LoginnPage Username_field
    When Enter LoginnPageee Password_field
    When Enter LoginnPageee submitBtn
    When Click PIMButton 
    When Click ConfigrationBTN 
    When Click Optional_Fieldslinktext 
    Then varify PIMPagee "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/pim/configurePim"
    
      
      Scenario: verify PIM page
    Given user_is_on_PIM_module_page
    When Enter LoginnPage Username_field
    When Enter LoginnPageee Password_field
    When Enter LoginnPageee submitBtn
    When Click PIMButton 
    When Click ConfigrationBTN 
    When Click Custom_Fieldslinktext 
    Then varify PIMPagee "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/pim/listCustomFields"
    
      
    Scenario: verify PIM page
    Given user_is_on_PIM_module_page
    When Enter LoginnPage Username_field
    When Enter LoginnPageee Password_field
    When Enter LoginnPageee submitBtn
    When Click PIMButton 
    When Click ConfigrationBTN 
    When Click Data_Importlinktext 
    Then varify PIMPagee "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/pim/pimCsvImport"
    
      
    Scenario: verify PIM page
    Given user_is_on_PIM_module_page
    When Enter LoginnPage Username_field
    When Enter LoginnPageee Password_field
    When Enter LoginnPageee submitBtn
    When Click PIMButton 
    When Click ConfigrationBTN 
    When Click Reporting_Methodslinktext 
    Then varify PIMPagee "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewReportingMethods"
    
      
    Scenario: verify PIM page
    Given user_is_on_PIM_module_page
    When Enter LoginnPage Username_field
    When Enter LoginnPageee Password_field
    When Enter LoginnPageee submitBtn
    When Click PIMButton 
    When Click ConfigrationBTN 
    When Click Termination_Reasonslinktext   
    Then varify PIMPagee "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewTerminationReasons"
    
    
    