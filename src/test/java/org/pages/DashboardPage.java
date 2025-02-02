package org.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import org.utilities.BaseUtility;

public class DashboardPage {
	private WebDriver driver;
	private BaseUtility bu = new BaseUtility();

	@FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
	private WebElement dashboadTxt;

	@FindBy(xpath = "//input[@placeholder='Username']")
	private WebElement placeholder_Username_txt;

	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement placeholder_Password_txt;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submitBtn;

	@FindBy(xpath = "//span[text()='Admin']")
	private WebElement AdminBtn;

	@FindBy(xpath = "//span[text()='PIM']")
	private WebElement PIMBtn;

	@FindBy(xpath = "//span[text()='Leave']")
	private WebElement LeaveBtn;

	@FindBy(xpath = "//span[text()='Time']")
	private WebElement TimeBtn;

	@FindBy(xpath = "//span[text()='Recruitment']")
	private WebElement RecruitmentBtn;

	@FindBy(xpath = "//span[text()='My Info']")
	private WebElement My_InfoBtn;

	@FindBy(xpath = "//span[text()='Performance']")
	private WebElement PerformanceBtn;

	@FindBy(xpath = "//span[text()='Dashboard']")
	private WebElement DashboardBtn;

	@FindBy(xpath = "//span[text()='Directory']")
	private WebElement Directory;

	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement Maintenance;
	@FindBy(xpath = "//span[text()='Claim']")
	private WebElement Claim;

	@FindBy(xpath = "//a[text()='About']")
	private WebElement AboutOption;

	@FindBy(xpath = "//a[normalize-space()='Support']")
	private WebElement SupportOption;

	@FindBy(xpath = "//a[normalize-space()='Change Password']")
	private WebElement Change_PassworOption;

	@FindBy(xpath = "//h6[text()='About']")
	private WebElement AboutTXT;

	@FindBy(xpath = "//i[@class=\"oxd-icon bi-caret-down-fill oxd-userdropdown-icon\"]")
	private WebElement Caret_down_fill;

	@FindBy(xpath = "//ul[@role=\"menu\"]/li")
	private List<WebElement> Dropdown_Options;

	@FindBy(xpath = "//a[normalize-space()='Logout']")
	private WebElement LogoutOption;

	// p[text()='Assign Leave']
	@FindBy(xpath = "//p[text()='Assign Leave']")
	private WebElement Assign_Leave;

	@FindBy(xpath = "//p[text()='Leave List']")
	private WebElement Leave_List;

	@FindBy(xpath = "//p[text()='Timesheets']")
	private WebElement Timesheets;

	@FindBy(xpath = "//p[text()='Apply Leave']")
	private WebElement Apply_Leave;

	@FindBy(xpath = "//p[text()='My Leave']")
	private WebElement My_Leave;

	@FindBy(xpath = "//p[text()='My Timesheet']")
	private WebElement My_Timesheet;

	@FindBy(xpath = "//ul[@class=\"oxd-main-menu\"]/li")
	private List<WebElement> tabLinks;

	@FindBy(xpath = "//div[@class=\"oxd-grid-item oxd-grid-item--gutters orangehrm-dashboard-widget\"]")
	private List<WebElement> dashboadpage_Cards;

	@FindBy(xpath = "//div[@class=\"orangehrm-todo-list\"]/div/button/*")
	private List<WebElement> My_Actions_Cards_symbol;

	@FindBy(xpath = "//div[@class=\"oxd-grid-3 orangehrm-quick-launch\"]/div/button/*")
	private List<WebElement> quick_launch_Card_icon;

	@FindBy(xpath = "//ul[@class=\"oxd-main-menu\"]/li")
	private List<WebElement> tabNames;

	// 2. Constructor
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// 3.Page Action Method

	public void placeholder_Username_inputField() {
		placeholder_Username_txt.sendKeys("admin");

	}

	public void placeholder_Password_inputField() {
		placeholder_Password_txt.sendKeys("admin123");

	}

	public void submitBtn() {
		submitBtn.click();

	}

	public void Caret_down_fill() {

		Caret_down_fill.click();

	}

	public String AboutTXT() {

		return AboutTXT.getText();

	}

	public void SupportOption() {
		bu.waitForVisibilityByType(driver, 25, "xpath", "//a[text()='About']");
		SupportOption.click();

	}

	public void LogoutOption() {
		bu.waitForVisibilityByType(driver, 25, "xpath", "//a[text()='About']");
		LogoutOption.click();

	}

	public void Change_PassworOption() {
		bu.waitForVisibilityByType(driver, 25, "xpath", "//a[text()='About']");
		Change_PassworOption.click();

	}

	public void AboutOption() {
		bu.waitForVisibilityByType(driver, 25, "xpath", "//a[text()='About']");
		AboutOption.click();

	}

	public void AdminBtn() {
		try {
			AdminBtn.click();
		} catch (Exception e) {

			bu.clickByJS(driver, AdminBtn);

		}

	}

	public void PIMBtn() {
		PIMBtn.click();

	}

	public void TimeBtn() {
		TimeBtn.click();

	}

	public void RecruitmentBtn() {
		RecruitmentBtn.click();

	}

	public void My_InfoBtn() {
		My_InfoBtn.click();

	}

	public void PerformanceBtn() {
		PerformanceBtn.click();

	}

	public void DashboardBtn() {
		DashboardBtn.click();

	}

	public void Directory() {
		Directory.click();

	}

	public void Maintenance() {
		Maintenance.click();

	}

	public void Claim() {
		Claim.click();

	}

	public void LeaveBtn() {
		LeaveBtn.click();

	}

	public void Assign_Leave() {
		Assign_Leave.click();

	}

	public void Leave_List() {
		Leave_List.click();

	}

	public void Timesheets() {
		Timesheets.click();

	}

	public void Apply_Leave() {
		Apply_Leave.click();

	}

	public void My_Leave() {
		My_Leave.click();

	}

	public void My_Timesheet() {
		My_Timesheet.click();

	}

	// a[text()='About']

	public String dashboadTxt() {
		return dashboadTxt.getText();

	}

	public String getDashboardURL() {

		return driver.getCurrentUrl();
	}

	public String getDashboardTitle() {

		return driver.getTitle();
	}

	public int getDashboardTabCount() {
		return tabLinks.size();
	}

	public int Dropdown_Options() {
		return Dropdown_Options.size();
	}

	public ArrayList<String> Dropdown_OptionsName() {
		bu.waitForVisibilityByType(driver, 25, "xpath", "//ul[@role=\"menu\"]/li");
		return bu.getAllTextFromList(Dropdown_Options);
	}

	public ArrayList<String> getDashboardTabNames() {
		return bu.getAllTextFromList(tabNames);
//		SoftAssert sa = new SoftAssert();
//		sa.assertEquals(actTabNames.get(0),tab1);
//		sa.assertEquals(actTabNames.get(1),tab2);
//		sa.assertEquals(actTabNames.get(2),tab3);
//		sa.assertEquals(actTabNames.get(3),tab4);
//		sa.assertAll();

	}

	public String getSelectedTabName() {
		bu.waitForVisibilityByType(driver, 20, "csslocator", "td[class*='navItem navCell']>a");
		for (int i = 0; i < tabLinks.size(); i++) {
			if (tabLinks.get(i).getAttribute("class").contains("selected")) {
				return tabNames.get(i).getText();
			}
		}
		return null;
	}

	public boolean dashboadpage_Cards() {
		bu.waitForVisibilityByType(driver, 20, "xpath",
				"//div[@class=\"oxd-grid-item oxd-grid-item--gutters orangehrm-dashboard-widget\"]");
		for (int i = 0; i < dashboadpage_Cards.size(); i++) {
			if (dashboadpage_Cards.get(i).isDisplayed()) {
				return true;
			}
		}
		return false;
	}

	public boolean My_Actions_Cards_symbol_symbol() {
		bu.waitForVisibilityByType(driver, 20, "xpath", "//div[@class=\"orangehrm-todo-list\"]/div/button/*");
		for (int i = 0; i < My_Actions_Cards_symbol.size(); i++) {
			if (My_Actions_Cards_symbol.get(i).isDisplayed()) {
				return true;
			}
		}
		return false;
	}

	public boolean quick_launch_Card_icon() {
		bu.waitForVisibilityByType(driver, 20, "xpath", "//div[@class=\"orangehrm-todo-list\"]/div/button/*");
		for (int i = 0; i < quick_launch_Card_icon.size(); i++) {
			if (quick_launch_Card_icon.get(i).isDisplayed()) {
				return true;
			}
		}
		return false;
	}

}
