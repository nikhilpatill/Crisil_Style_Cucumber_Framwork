package org.pages;

import java.util.ArrayList;
import java.util.List;

import org.WaitUtility.WaitGenericMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseUtility;

public class PIMpage {

	private WebDriver driver;
	private BaseUtility bu = new BaseUtility();
	private WaitGenericMethod wt = new WaitGenericMethod();

	@FindBy(xpath = "//input[@placeholder='username']")
	private WebElement placeholder_Username_txt;

	@FindBy(xpath = "//input[@placeholder='password']")
	private WebElement placeholder_Password_txt;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submitBtn;

	@FindBy(xpath = "//span[text()=\"PIM\"]")
	public WebElement PIMButton;

	@FindBy(xpath = "//h6[text()=\"PIM\"]")
	public WebElement PIMtext;

	@FindBy(xpath = "//ul[@role=\"menu\"]/li/a[text()='Optional Fields']")
	public WebElement Optional_Fieldslinktext;

	@FindBy(xpath = "//ul[@role=\"menu\"]/li/a[text()='Custom Fields']")
	public WebElement Custom_Fieldslinktext;

	@FindBy(xpath = "//ul[@role=\"menu\"]/li/a[text()='Data Import']")
	public WebElement Data_Importlinktext;

	@FindBy(xpath = "//ul[@role=\"menu\"]/li/a[text()='Reporting Methods']")
	public WebElement Reporting_Methodslinktext;

	@FindBy(xpath = "//ul[@role=\"menu\"]/li/a[text()='Termination Reasons']")
	public WebElement Termination_Reasonslinktext;

	// ul[@role="menu"]/li/a

	@FindBy(xpath = "//i[@class='oxd-icon bi-chevron-down']")
	public WebElement ConfigrationBTN;

	@FindBy(xpath = "//ul[@role=\"menu\"]/li/a")
	public List<WebElement> Configration_text;

	// contructor
	public PIMpage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// action method

	public void placeholder_Username_inputField() {
		placeholder_Username_txt.sendKeys("admin");

	}

	public void placeholder_Password_inputField() {
		placeholder_Password_txt.sendKeys("admin123");

	}

	public void submitBtn() {
		submitBtn.click();

	}

	public void ConfigrationBTN() {
		wt.waitForClickableByType(driver, 35, "xpath", "//i[@class='oxd-icon bi-chevron-down']");
		bu.clickByJS(driver, ConfigrationBTN);
		// ConfigrationBTN.click();

	}

	public void Optional_Fieldslinktext() {

		bu.clickByJS(driver, Optional_Fieldslinktext);
		// Optional_Fieldslinktext.click();

	}

	public void Custom_Fieldslinktext() {
		Custom_Fieldslinktext.click();

	}

	public void Data_Importlinktext() {
		Data_Importlinktext.click();

	}

	public void Reporting_Methodslinktext() {
		Reporting_Methodslinktext.click();

	}

	public void PIMButton() {
		PIMButton.click();

	}

	public void Termination_Reasonslinktext() {
		Termination_Reasonslinktext.click();

	}

	public String CurrentUrl() {
		return driver.getCurrentUrl();

	}

	public String Title() {
		return driver.getTitle();

	}

	public String PIMtext() {
		return PIMtext.getText();

	}

	public ArrayList<String> ConfigrationOption() {

		return bu.getAllTextFromList(Configration_text);

	}

}
