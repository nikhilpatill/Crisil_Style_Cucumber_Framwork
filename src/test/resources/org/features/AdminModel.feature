 
Feature: Login Functionality


   Scenario: verify Dashboad page
    Given user_is_on_Admin_module_page
    When Enter LoginPageee Username_field
    When Enter LoginPageee Password_field
    When Enter LoginPageee submitBtn
    Then varify DashboadPagee "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"
    Then varify DashboadPagee "Title" IsDisplayed "OrangeHRM"
    Then varify DashboadPagee "dashboadTxt" IsDisplayed "Dashboard"
       

   Scenario: verify Dashboad page
    Given user_is_on_Admin_module_page
    When Enter LoginPageee Username_field
    When Enter LoginPageee Password_field
    When Enter LoginPageee submitBtn
    When Click Admin_module 
    Then varify DashboadPagee "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers"
 
 
   Scenario: verify Dashboad page
    Given user_is_on_Admin_module_page
    When Enter LoginPageee Username_field
    When Enter LoginPageee Password_field
    When Enter LoginPageee submitBtn
    When Click Admin_module 
    When Click User_ManagementBtn 
    When Click UserBtn 
    Then varify DashboadPagee "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers"
  
    
     
   Scenario: verify Dashboad page User_ManagementBtn in User modules 
    Given user_is_on_Admin_module_page
    When Enter LoginPageee Username_field
    When Enter LoginPageee Password_field
    When Enter LoginPageee submitBtn
    When Click Admin_module 
    When Click User_ManagementBtn 
    When Click UserBtn 
    Then System_Users_labels page has "Username","User Role","Employee Name","Status"
    
    
  
    
   
   Scenario: verify Dashboad page User_ManagementBtn in User modules 
    Given user_is_on_Admin_module_page
    When Enter LoginPageee Username_field
    When Enter LoginPageee Password_field
    When Enter LoginPageee submitBtn
    When Click Admin_module 
    When Click User_ManagementBtn 
    When Click UserBtn 
    When Click SystemUser_ADD_BTN 
    Then varify DashboadPagee "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/admin/saveSystemUser"
    
    
  
   Scenario: verify Dashboad page User_ManagementBtn in ADDUsers_labels modules 
    Given user_is_on_Admin_module_page
    When Enter LoginPageee Username_field
    When Enter LoginPageee Password_field
    When Enter LoginPageee submitBtn
    When Click Admin_module 
    When Click User_ManagementBtn 
    When Click UserBtn 
    When Click SystemUser_ADD_BTN 
    Then ADDUsers_labels page has "User Role","Employee Name","Status","Username","Password","Confirm Password" 
    
    
    
   
   
   Scenario: verify Admin page
    Given user_is_on_Admin_module_page
    When Enter LoginPageee Username_field
    When Enter LoginPageee Password_field
    When Enter LoginPageee submitBtn
    When Click Admin_module 
    Then AdminModule page has "User Management","Job","Organization ","Qualifications","More"   
    

   Scenario: verify AdminPage in JobModule page
    Given user_is_on_Admin_module_page
    When Enter LoginPageee Username_field
    When Enter LoginPageee Password_field
    When Enter LoginPageee submitBtn
    When Click Admin_module 
    When Click JobBtn 
    Then JobModule page has "Job Titles","Pay Grades","Employment Status","Job Categories","Work Shifts"
 
    Scenario: verify AdminPage in JobModule in Job_Titles page
    Given user_is_on_Admin_module_page
    When Enter LoginPageee Username_field
    When Enter LoginPageee Password_field
    When Enter LoginPageee submitBtn
    When Click Admin_module 
    When Click JobBtn 
    When Click Job_TitlesBtn 
    Then varify DashboadPagee "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewJobTitleList"
    
    
     Scenario: verify AdminPage in JobModule in Pay_GradesBtn page
    Given user_is_on_Admin_module_page
    When Enter LoginPageee Username_field
    When Enter LoginPageee Password_field
    When Enter LoginPageee submitBtn
    When Click Admin_module 
    When Click JobBtn 
    When Click Pay_GradesBtn 
    Then varify DashboadPagee "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewPayGrades"
    
    
   
     Scenario: verify AdminPage in JobModule in Employment_StatusBtn page
    Given user_is_on_Admin_module_page
    When Enter LoginPageee Username_field
    When Enter LoginPageee Password_field
    When Enter LoginPageee submitBtn
    When Click Admin_module 
    When Click JobBtn 
    When Click Employment_StatusBtn 
    Then varify DashboadPagee "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/admin/employmentStatus"
    
    
     Scenario: verify AdminPage in JobModule in Job_CategoriesBtn page
    Given user_is_on_Admin_module_page
    When Enter LoginPageee Username_field
    When Enter LoginPageee Password_field
    When Enter LoginPageee submitBtn
    When Click Admin_module 
    When Click JobBtn 
    When Click Job_CategoriesBtn 
    Then varify DashboadPagee "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/admin/jobCategory"
    
   
     Scenario: verify AdminPage in JobModule in Job_CategoriesBtn page
    Given user_is_on_Admin_module_page
    When Enter LoginPageee Username_field
    When Enter LoginPageee Password_field
    When Enter LoginPageee submitBtn
    When Click Admin_module 
    When Click JobBtn 
    When Click Work_ShiftsBtn 
    Then varify DashboadPagee "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/admin/workShift"
   
    
   Scenario: verify AdminPage in OrganizationModule page
    Given user_is_on_Admin_module_page
    When Enter LoginPageee Username_field
    When Enter LoginPageee Password_field
    When Enter LoginPageee submitBtn
    When Click Admin_module 
    When Click OrganizationBtn 
    Then OrganizationModule page has "General Information","Locations","Structure"
    
     
     Scenario: verify AdminPage in OrganizationModule in GeneralInformation page
    Given user_is_on_Admin_module_page
    When Enter LoginPageee Username_field
    When Enter LoginPageee Password_field
    When Enter LoginPageee submitBtn
    When Click Admin_module 
    When Click OrganizationBtn 
    When Click General_InformationBtn 
    Then varify DashboadPagee "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewOrganizationGeneralInformation"
  
      
     Scenario: verify AdminPage in OrganizationModule in LocationsBtn page
    Given user_is_on_Admin_module_page
    When Enter LoginPageee Username_field
    When Enter LoginPageee Password_field
    When Enter LoginPageee submitBtn
    When Click Admin_module 
    When Click OrganizationBtn 
    When Click LocationsBtn 
    Then varify DashboadPagee "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewLocations"
  
  
     
     Scenario: verify AdminPage in OrganizationModule in StructureBtn page
    Given user_is_on_Admin_module_page
    When Enter LoginPageee Username_field
    When Enter LoginPageee Password_field
    When Enter LoginPageee submitBtn
    When Click Admin_module 
    When Click OrganizationBtn 
    When Click StructureBtn 
    Then varify DashboadPagee "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewCompanyStructure"
  
  
    Scenario: verify AdminPage in QualificationsModule page
    Given user_is_on_Admin_module_page
    When Enter LoginPageee Username_field
    When Enter LoginPageee Password_field
    When Enter LoginPageee submitBtn
    When Click Admin_module 
    When Click QualificationsBtn 
    Then Qualifications_navOption page has "Skills","Education","Licenses","Languages","Memberships"
  
   
    Scenario: verify AdminPage in QualificationsModule in SkillsBtn page
    Given user_is_on_Admin_module_page
    When Enter LoginPageee Username_field
    When Enter LoginPageee Password_field
    When Enter LoginPageee submitBtn
    When Click Admin_module 
    When Click QualificationsBtn 
    When Click SkillsBtn
     Then varify DashboadPagee "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSkills" 
  
    
    Scenario: verify AdminPage in QualificationsModule in EducationBtn page
    Given user_is_on_Admin_module_page
    When Enter LoginPageee Username_field
    When Enter LoginPageee Password_field
    When Enter LoginPageee submitBtn
    When Click Admin_module 
    When Click QualificationsBtn 
    When Click EducationBtn
    Then varify DashboadPagee "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewEducation"
  
  
    
    Scenario: verify AdminPage in QualificationsModule in LicensesBtn page
    Given user_is_on_Admin_module_page
    When Enter LoginPageee Username_field
    When Enter LoginPageee Password_field
    When Enter LoginPageee submitBtn
    When Click Admin_module 
    When Click QualificationsBtn 
    When Click LicensesBtn
    Then varify DashboadPagee "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewLicenses"
  
  
   
    Scenario: verify AdminPage in QualificationsModule in LangesBtn page
    Given user_is_on_Admin_module_page
    When Enter LoginPageee Username_field
    When Enter LoginPageee Password_field
    When Enter LoginPageee submitBtn
    When Click Admin_module 
    When Click QualificationsBtn 
    When Click LangesBtn
    Then varify DashboadPagee "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewLanguages"
    
    
      
   
          
    Scenario: verify AdminPage in QualificationsModule in membershipBtn page
    Given user_is_on_Admin_module_page
    When Enter LoginPageee Username_field
    When Enter LoginPageee Password_field
    When Enter LoginPageee submitBtn
    When Click Admin_module 
    When Click QualificationsBtn 
    When Click membershipBtn
    Then varify DashboadPagee "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/admin/membership"
    
          
     Scenario: verify AdminPage ConfigurationBtnin in Email_Configurationbtn page
    Given user_is_on_Admin_module_page
    When Enter LoginPageee Username_field
    When Enter LoginPageee Password_field
    When Enter LoginPageee submitBtn
    When Click Admin_module 
    When Click ConfigurationBtn 
    When Click Email_Configurationbtn 
    Then varify DashboadPagee "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/admin/listMailConfiguration"
    
    
          
     Scenario: verify AdminPage ConfigurationBtnin in EmailSubscriptionsbth page
    Given user_is_on_Admin_module_page
    When Enter LoginPageee Username_field
    When Enter LoginPageee Password_field
    When Enter LoginPageee submitBtn
    When Click Admin_module 
    When Click ConfigurationBtn 
    When Click EmailSubscriptionsbth
    Then varify DashboadPagee "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewEmailNotification"
    
    
    
           
     Scenario: verify AdminPage ConfigurationBtnin Localization page
    Given user_is_on_Admin_module_page
    When Enter LoginPageee Username_field
    When Enter LoginPageee Password_field
    When Enter LoginPageee submitBtn
    When Click Admin_module 
    When Click ConfigurationBtn 
    When Click Localization 
    Then varify DashboadPagee "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/admin/localization"
    
    
    
         
     Scenario: verify AdminPage in Language_Packages page
    Given user_is_on_Admin_module_page
    When Enter LoginPageee Username_field
    When Enter LoginPageee Password_field
    When Enter LoginPageee submitBtn
    When Click Admin_module 
    When Click ConfigurationBtn 
    When Click Language_Packages 
    Then varify DashboadPagee "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/admin/languagePackage"
    
    
         
     Scenario: verify AdminPage in Modules page
    Given user_is_on_Admin_module_page
    When Enter LoginPageee Username_field
    When Enter LoginPageee Password_field
    When Enter LoginPageee submitBtn
    When Click Admin_module 
    When Click ConfigurationBtn 
    When Click Modules 
    Then varify DashboadPagee "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewModules"
    
    
          
     Scenario: verify AdminPage in Social_Media_Authentication page
    Given user_is_on_Admin_module_page
    When Enter LoginPageee Username_field
    When Enter LoginPageee Password_field
    When Enter LoginPageee submitBtn
    When Click Admin_module 
    When Click ConfigurationBtn 
    When Click Social_Media_Authentication 
    Then varify DashboadPagee "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/admin/openIdProvider"
    
          
     Scenario: verify AdminPage in Register_OAuth_Client page
    Given user_is_on_Admin_module_page
    When Enter LoginPageee Username_field
    When Enter LoginPageee Password_field
    When Enter LoginPageee submitBtn
    When Click Admin_module 
    When Click ConfigurationBtn 
    When Click Register_OAuth_Client 
    Then varify DashboadPagee "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/admin/registerOAuthClient"
    
    
          
     Scenario: verify AdminPage in LDAP_Configuration page
    Given user_is_on_Admin_module_page
    When Enter LoginPageee Username_field
    When Enter LoginPageee Password_field
    When Enter LoginPageee submitBtn
    When Click Admin_module 
    When Click ConfigurationBtn 
    When Click LDAP_Configuration 
    Then varify DashboadPagee "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/admin/ldapConfiguration"
    
   
    
    Scenario: verify AdminPage in ConfigurationModule page
    Given user_is_on_Admin_module_page
    When Enter LoginPageee Username_field
    When Enter LoginPageee Password_field
    When Enter LoginPageee submitBtn
    When Click Admin_module 
    When Click ConfigurationBtn 
    Then ConfigurationModule page has "Email Configuration","Email Subscriptions","Localization","Language Packages","Modules","Social Media Authentication","Register OAuth Client","LDAP Configuration"
    
    
    
    Scenario: verify AdminPage in JobModule in Job_Titles page
    Given user_is_on_Admin_module_page
    When Enter LoginPageee Username_field
    When Enter LoginPageee Password_field
    When Enter LoginPageee submitBtn
    When Click Admin_module 
    When Click JobBtn 
    When Click Job_TitlesBtn 
    Then varify DashboadPagee "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewJobTitleList"
    When Click  Add_Btn 
    When Enter JibTitlePage Job_Title_field
    When Enter JibTitlePage Job_Description_field
    When Enter JibTitlePage Job_Specification_Fileuplod_field
    When Enter JibTitlePage Note_field
    When Enter JibTitlePage SubmitBtn 
    
    
     
    Scenario: verify AdminPage in JobModule in Job_Pay Grades page
    Given user_is_on_Admin_module_page
    When Enter LoginPageee Username_field
    When Enter LoginPageee Password_field
    When Enter LoginPageee submitBtn
    When Click Admin_module 
    When Click JobBtn 
    When Click Job_Pay GradesBtn 
    Then varify DashboadPagee "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewPayGrades"
    When Click  Add_Btn 
    When Enter Job_PayGradesPage Name_field
    When Enter  Job_PayGradesPage SubmitBtn 
    Then varify DashboadPagee "MessageTxt" IsDisplayed "Success"
    
    
    
     Scenario: verify AdminPage in JobModule in Job_Pay Grades page
    Given user_is_on_Admin_module_page
    When Enter LoginPageee Username_field
    When Enter LoginPageee Password_field
    When Enter LoginPageee submitBtn
    When Click Admin_module 
    When Click JobBtn 
    When Click Job_Pay GradesBtn 
    Then varify DashboadPagee "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewPayGrades"
    When Click  Add_Btn 
    When Enter  Job_PayGradesPage SubmitBtn 
    Then varify DashboadPagee "MessageTxt" IsDisplayed "Success"
    
    
    
    
  
    Scenario: verify AdminPage in JobModule in Job_Pay Grades page
    Given user_is_on_Admin_module_page
    When Enter LoginPageee Username_field
    When Enter LoginPageee Password_field
    When Enter LoginPageee submitBtn
    When Click Admin_module 
    When Click JobBtn 
    When Click Job_Pay GradesBtn 
    Then varify DashboadPagee "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewPayGrades"
    When Click  Add_Btn 
    When Enter  Job_PayGradesPage SubmitBtn 
    Then varify DashboadPagee "ErrorMessageTxt" IsDisplayed "Required"
    

    Scenario: verify AdminPage in JobModule in Job_Pay Grades page
    Given user_is_on_Admin_module_page
    When Enter LoginPageee Username_field
    When Enter LoginPageee Password_field
    When Enter LoginPageee submitBtn
    When Click Admin_module 
    When Click JobBtn 
    When Click Job_Pay GradesBtn 
    Then varify DashboadPagee "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewPayGrades"
    When Click  Add_Btn 
    When Enter  Job_PayGradesPage SubmitBtn 
    Then varify DashboadPagee "ErrorMessageTxt" IsDisplayed "Required"
     
     
   
    Scenario: verify AdminPage in JobModule in Employment_Status page
    Given user_is_on_Admin_module_page
    When Enter LoginPageee Username_field
    When Enter LoginPageee Password_field
    When Enter LoginPageee submitBtn
    When Click Admin_module 
    When Click JobBtn 
    When Click Job_Employment_StatusBtn 
    Then varify DashboadPagee "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/admin/employmentStatus"
    When Click  Add_Btn 
    When Enter  Job_Employment_StatusPage SubmitBtn 
    Then varify DashboadPagee "ErrorMessageTxt" IsDisplayed "Required"
     
     
   
    Scenario: verify AdminPage in JobModule in Job_Titles Deletepage
    Given user_is_on_Admin_module_page
    When Enter LoginPageee Username_field
    When Enter LoginPageee Password_field
    When Enter LoginPageee submitBtn
    When Click Admin_module 
    When Click JobBtn 
    When Click Job_TitlesBtn 
    Then varify DashboadPagee "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewJobTitleList"
    When Click  Add_Btn 
    When Enter JibTitlePage Job_Title_field
    When Enter JibTitlePage SubmitBtn 
    When Click Job_DeleteAction
    Then varify DashboadPagee "MessageTxt" IsDisplayed "Success"
    
     
    Scenario: verify AdminPage in JobModule in Job_Titles Editpage
    Given user_is_on_Admin_module_page
    When Enter LoginPageee Username_field
    When Enter LoginPageee Password_field
    When Enter LoginPageee submitBtn
    When Click Admin_module 
    When Click JobBtn 
    When Click Job_TitlesBtn 
    Then varify DashboadPagee "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewJobTitleList"
    When Click  Add_Btn 
    When Enter JibTitlePage Job_Title_field
    When Enter JibTitlePage SubmitBtn 
    When Click Job_EditAction
    When Enter Job_PayGradesPage Name_field
    When Enter  Job_PayGradesPage SubmitBtn 
    Then varify DashboadPagee "MessageTxt" IsDisplayed "Success"
    
  
    Scenario: verify AdminPage in JobModule in Job_Category page
    Given user_is_on_Admin_module_page
    When Enter LoginPageee Username_field
    When Enter LoginPageee Password_field
    When Enter LoginPageee submitBtn
    When Click Admin_module 
    When Click JobBtn 
    When Click Job_CategoriesBtn 
    Then varify DashboadPagee "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/admin/jobCategory"
    When Click  Add_Btn 
    When Enter Job_CategoryPage Name_field
    When Enter  Job_CategoryPage SubmitBtn 
    Then varify DashboadPagee "MessageTxt" IsDisplayed "Success"
    
    
  
    Scenario: verify AdminPage in JobModule in Job_Category page
    Given user_is_on_Admin_module_page
    When Enter LoginPageee Username_field
    When Enter LoginPageee Password_field
    When Enter LoginPageee submitBtn
    When Click Admin_module 
    When Click JobBtn 
    When Click Job_CategoriesBtn 
    Then varify DashboadPagee "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/admin/jobCategory"
    When Click  Add_Btn 
    When Enter  Job_CategoryPage SubmitBtn 
    Then varify DashboadPagee "ErrorMessageTxt" IsDisplayed "Required"
    
    
 
    Scenario: verify AdminPage in JobModule in Job_Work_Shifts_page
    Given user_is_on_Admin_module_page
    When Enter LoginPageee Username_field
    When Enter LoginPageee Password_field
    When Enter LoginPageee submitBtn
    When Click Admin_module 
    When Click JobBtn 
    When Click Job_Work_ShiftsBtn
    Then varify DashboadPagee "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/admin/workShift"
    When Click  Add_Btn 
    When Enter Job_Work_Shifts_page Name_field
    When Enter Job_Work_Shifts_page Working_Hours
    When Enter Job_Work_Shifts_page Working_Minut
    When Enter  Job_Work_Shifts_page SubmitBtn 
    Then varify DashboadPagee "MessageTxt" IsDisplayed "Success"
    
    
    
    
    
    
    
    Scenario: verify AdminPage in JobModule in Job_Work_Shifts_page
    Given user_is_on_Admin_module_page
    When Enter LoginPageee Username_field
    When Enter LoginPageee Password_field
    When Enter LoginPageee submitBtn
    When Click Admin_module 
    When Click JobBtn 
    When Click Job_Work_ShiftsBtn
    Then varify DashboadPagee "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/admin/workShift"
    When Click  Add_Btn 
    When Enter Job_Work_Shifts_page Name_field
    When Enter Job_Work_Shifts_page Working_Hours
    When Enter Job_Work_Shifts_page Working_Minut
    When Enter  Job_Work_Shifts_page SubmitBtn 
    Then varify DashboadPagee "MessageTxt" IsDisplayed "Success"
    When Click Job_DeleteAction
    Then varify DashboadPagee "MessageTxt" IsDisplayed "Success"
    
    
    
    
      
    Scenario: verify AdminPage in JobModule in Job_Work_Shifts_page
    Given user_is_on_Admin_module_page
    When Enter LoginPageee Username_field
    When Enter LoginPageee Password_field
    When Enter LoginPageee submitBtn
    When Click Admin_module 
    When Click JobBtn 
    When Click Job_Work_ShiftsBtn
    Then varify DashboadPagee "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/admin/workShift"
    When Click  Add_Btn 
    When Enter Job_Work_Shifts_page Name_field
    When Enter Job_Work_Shifts_page Working_Hours
    When Enter Job_Work_Shifts_page Working_Minut
    When Enter  Job_Work_Shifts_page SubmitBtn 
    Then varify DashboadPagee "MessageTxt" IsDisplayed "Success"
    When Click JobJob_Work_Shifts_EditAction
    When Enter  Job_Work_Shifts_page SubmitBtn 
    Then varify DashboadPagee "MessageTxt" IsDisplayed "Success"
    
      
    @smoke  
    Scenario: verify AdminPage in OrganizationModule in StructureBtn page
    Given user_is_on_Admin_module_page
    When Enter LoginPageee Username_field
    When Enter LoginPageee Password_field
    When Enter LoginPageee submitBtn
    When Click Admin_module 
    When Click OrganizationBtn 
    When Click StructureBtn 
    Then varify DashboadPagee "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewCompanyStructure"
    When Click EditBtn
    When Click  Add_Btn 
    When Enter Add Organization  Unit_Id_field
    When Enter Add Organization  Name_field
    When Enter Add Organization  Description_field
    When Click OrganizationModule SubmitBtn
  
    
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    