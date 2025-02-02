
 
Feature: Login Functionality


  Scenario: verify Login page
    Given user_is_on_LoginPage
    Then varify LoginPage "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    Then varify LoginPage "Title" IsDisplayed "OrangeHRM"
    Then varify LoginPage "Login_txt" IsDisplayed "Login"
    Then varify LoginPage "Username_Admin_txt" IsDisplayed "Username : Admin"
    Then varify LoginPage "Password_admin123_txt" IsDisplayed "Password : admin123"
    Then varify LoginPage "forgetpasswordTxt" IsDisplayed "Forgot your password?"

   Scenario: verify Loginpage placeholders
    Given user_is_on_LoginPage
    Then varify LoginPage "Username_txt" IsDisplayed "Username"
    Then varify LoginPage "Password_txt" IsDisplayed "Password"
    
    
    Scenario Outline: verify Login fail - posible combination 
    Given user_is_on_LoginPage
    When Enter LoginPage "<Username>" in Username_field
    When Enter LoginPage "<Password>" in Password_field
    When Enter LoginPage submitBtn
   Examples: 
    |Username | Password    |
    |admin    | admin123    |
    |nikhil   | Welcome@123 |
    | soham   | Welcome@123 |
    
 
 
  Scenario: verify Login with correct Cradancial
    Given user_is_on_LoginPage
    When Enter LoginPage Username_field
    When Enter LoginPage Password_field
    When Enter LoginPage submitBtn
    Then varify LoginPage "dashboadTxt" IsDisplayed "Dashboard"

  Scenario: verify Loginpage
     Given user_is_on_LoginPage
    When Enter LoginPage Username_field
    When Enter LoginPage submitBtn
    Then varify LoginPage "Errormessage" IsDisplayed "Required"


  Scenario: verify Loginpage
 Given user_is_on_LoginPage
    When Enter LoginPage Password_field
    When Enter LoginPage submitBtn
    Then varify LoginPage "Errormessage" IsDisplayed "Required"


  Scenario: verify Loginpage
   Given user_is_on_LoginPage
    When Enter LoginPage submitBtn
    Then varify LoginPage "Errormessage" IsDisplayed "Required"

  Scenario: verify Loginpage_forget password
   Given user_is_on_LoginPage
    When Enter LoginPage forgetpasswordclick
    Then varify LoginPage "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/auth/requestPasswordResetCode"

  Scenario: verify Loginpage_forget password
   Given user_is_on_LoginPage
    When Enter LoginPage forgetpasswordclick
    Then varify LoginPage "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/auth/requestPasswordResetCode"
    Then varify LoginPage "Reset_PasswordTxt" IsDisplayed "Reset Password"
    When Enter LoginPage  Reset_usernameinputfiled
    When Enter LoginPag  Reset_Passwordbtn
    Then varify LoginPage "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/auth/sendPasswordReset"
    Then varify LoginPage "Reset_Password_link_sent_successfully" IsDisplayed "Reset Password link sent successfully"


  Scenario: verify Loginpage_forget password
   Given user_is_on_LoginPage
    When Enter LoginPage forgetpasswordclick
    Then varify LoginPage "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/auth/requestPasswordResetCode"
    Then varify LoginPage "Reset_PasswordTxt" IsDisplayed "Reset Password"
    When Enter LoginPag Reset_Cancalbtn
    Then varify LoginPage "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
