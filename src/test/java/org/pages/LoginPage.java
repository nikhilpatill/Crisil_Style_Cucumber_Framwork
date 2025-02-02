package org.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseUtility;

public class LoginPage {
	private WebDriver driver;
	// 1.WebElements
	@FindBy(xpath = "//h5[text()=\"Login\"]")
	private WebElement Login_txt;
	@FindBy(xpath = "//p[text()=\"Username : Admin\"]")
	private WebElement Username_Admin_txt;
	@FindBy(xpath = "//p[text()=\"Password : admin123\"]")
	private WebElement Password_admin123_txt;

	@FindBy(xpath = "//label[text()=\"Username\"]")
	private WebElement Username_txt;

	@FindBy(xpath = "//label[text()=\"Password\"]")
	private WebElement Password_txt;

	@FindBy(xpath = "//input[@placeholder='Username']")
	private WebElement placeholder_Username_txt;

	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement placeholder_Password_txt;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submitBtn;

	@FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
	private WebElement dashboadTxt;

	// span[@class='oxd-text oxd-text--span oxd-input-field-error-message
	// oxd-input-group__message']

	@FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
	private WebElement Errormessage;

	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
	private WebElement forgetpasswordTxt;

	@FindBy(xpath = "//h6[text()='Reset Password']")
	private WebElement Reset_PasswordTxt;

	@FindBy(xpath = "//input[@placeholder=\"Username\"]")
	private WebElement Reset_usernameinputfiled;

	@FindBy(xpath = "//h6[text()='Reset Password link sent successfully']")
	private WebElement Reset_Password_link_sent_successfully;

	@FindBy(xpath = "//button[text()=' Reset Password ']")
	private WebElement Reset_Passwordbtn;

	@FindBy(xpath = "//button[@type='button']")
	private WebElement Reset_Cancalbtn;

	// button[@type='button']

	// 2.Constructor

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		// PageFactory.initElements(driver,LoginPage.class);
		// OR
		PageFactory.initElements(driver, this);
	}

	// 3.Page Action Methods

	public String Reset_Password_link_sent_successfully() {
		return Reset_Password_link_sent_successfully.getText();

	}

	public String dashboadTxt() {
		return dashboadTxt.getText();

	}

	public void Reset_Passwordbtn() {
		Reset_Passwordbtn.click();

	}

	public void Reset_Cancalbtn() {
		Reset_Cancalbtn.click();

	}

	public void forgetpasswordclick() {
		forgetpasswordTxt.click();

	}

	public void Reset_usernameinputfiled() {
		Reset_usernameinputfiled.sendKeys("nikhilpatil1050");

	}

	public String forgetpasswordTxt() {
		return forgetpasswordTxt.getText();

	}

	public String Reset_PasswordTxt() {
		return Reset_PasswordTxt.getText();

	}

	public String Errormessage() {
		return Errormessage.getText();

	}

	public String Username_txt() {
		return Username_txt.getText();

	}

	public String Password_txt() {
		return Password_txt.getText();

	}

	public String placeholder_Username_txt() {
		return placeholder_Username_txt.getText();

	}

	public void placeholder_Username_inputField() {
		placeholder_Username_txt.sendKeys("admin");

	}

	public void placeholder_Password_inputField() {
		placeholder_Password_txt.sendKeys("admin123");

	}
	
	

	public String placeholder_Password_txt() {
		return placeholder_Password_txt.getText();

	}

	public String Username_Admin_txt() {
		return Username_Admin_txt.getText();

	}

	public String Password_admin123_txt() {
		return Password_admin123_txt.getText();

	}

	public void submitBtn() {
		submitBtn.click();

	}

	public String Login_txt() {
		return Login_txt.getText();

	}

	public String CurrentUrl() {
		return driver.getCurrentUrl();

	}

	public String Title() {
		return driver.getTitle();

	}

}
