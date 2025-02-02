package org.stepDefinations;

import java.util.ArrayList;
import java.util.List;

import org.hooks.AppHooks;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class Compoent_Operation {

	static WebDriver driver = AppHooks.driver;
	Compoent_Operation Compoent_Operation;


	Compoent_Operation() {

		driver = AppHooks.driver;
		PageFactory.initElements(driver, this);

	}

	public void waitForsecond(int second) {
		try {
			Thread.sleep(second * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void clickElemet(String xpath) {

		WebElement ele;
		try {
			ele = driver.findElement(By.xpath(xpath));
			Actions action = new Actions(driver);
			action.moveToElement(ele).click().perform();

		} catch (Exception e) {

			WebElement ele2 = driver
					.findElement(By.xpath("(//div[@role='option']//span[normalize-space('Admin')])[1]"));
			if (ele2.isEnabled() && ele2.isDisplayed()) {
				ele2.click();
			}

		}

	}

	public static boolean isXpathElemetsAvailable(String xpath) {

		return !(driver.findElements(By.xpath(xpath)).isEmpty());

	}

	public void insertXpathElementText(String xpath, String Inputtext) {

		driver.findElement(By.xpath(xpath)).clear();
		driver.findElement(By.xpath(xpath)).sendKeys(Inputtext);

	}

	public void insertEployeenameText(String xpath, String Inputtext) throws InterruptedException {

		driver.findElement(By.xpath(xpath)).clear();
		driver.findElement(By.xpath(xpath)).sendKeys(Inputtext);
		WebElement ele = driver.findElement(By.xpath("(//div[@role='option']/following::span[normalize-space('Ranga  Akunuri')])[1]"));
		if (ele.isDisplayed() && ele.isEnabled()) {
			ele.click();
				
			} else {

				System.out.println("elemets not dislay =>'" + ele + "'");

			}

		}

	

	public String getCurrentURL() {
		return driver.getCurrentUrl();

	}

	public String alertText() {
		return driver.switchTo().alert().getText();

	}

	public void alertAccept() {
		driver.switchTo().alert().accept();

	}

	public String getCurrentTitle() {
		return driver.getTitle();

	}

	public void selectandInsertXpathElemettext(String xpath, String Inputtext) {
		String select = Keys.chord(Keys.CONTROL, "a");
		driver.findElement(By.xpath(xpath)).clear();
		driver.findElement(By.xpath(xpath)).sendKeys(Inputtext);

	}

	public void insertXpathElemettextValue(String xpath, String Inputtext) {

		driver.findElement(By.xpath(xpath)).sendKeys(Inputtext);

	}

	public void findSearchXpathElemet(String xpath, String Inputtext) {
		driver.findElement(By.xpath(xpath)).clear();
		driver.findElement(By.xpath(xpath)).sendKeys(Inputtext);
		driver.findElement(By.xpath(xpath)).sendKeys(Keys.ENTER);

	}

	public void findValueFromDropdownXpathElemet(String xpath, String Inputtext) {
		driver.findElement(By.xpath(xpath)).clear();
		driver.findElement(By.xpath(xpath)).sendKeys(Inputtext);
		driver.findElement(By.xpath(xpath)).sendKeys(Keys.ENTER);

	}

	public Boolean isXpathElemetDisplayed(String xpath) {
		try {

			return driver.findElement(By.xpath(xpath)).isDisplayed();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public Boolean isxpathElemetVisiblity(String xpath) {
		return driver.findElement(By.xpath(xpath)).isDisplayed();

	}

	public Boolean isxpathElemetClickable(String xpath) {
		return driver.findElement(By.xpath(xpath)).isEnabled();

	}

	public Boolean isxpathElemetisEnabled(String xpath) {
		return driver.findElement(By.xpath(xpath)).isEnabled();

	}

	public Boolean isxpathElemetisSelected1(String xpath) {
		return driver.findElement(By.xpath(xpath)).isSelected();

	}

	public Boolean isxpathElemetisSelected(String xpath) {
		return driver.findElement(By.xpath(xpath)).isSelected();

	}

	public String getElemettext(String xpath) {
		return driver.findElement(By.xpath(xpath)).getText();

	}

	public String getInputvalue(String xpath) {
		return driver.findElement(By.xpath(xpath)).getAttribute(xpath);

	}

	public String getMaxvalue(String xpath) {

		return driver.findElement(By.xpath(xpath)).getAttribute(xpath);

	}

	public String getTextFromElementText(String xpath) {

		return driver.findElement(By.xpath(xpath)).getText();
	}

	public List<String> getMultipleElemetText(String xpath) {

		List<String> elementText = new ArrayList<String>();
		List<WebElement> elemets = driver.findElements(By.xpath(xpath));

		for (WebElement ele : elemets) {

			elementText.add(ele.getText());

		}
		return elementText;

	}

	public int getListofWebelemetCount(String xpaath) {
		List<WebElement> ele = driver.findElements(By.xpath(xpaath));
		return ele.size();

	}

	public void scrollToViewElemet(String xxpath) {

		WebElement ele = driver.findElement(By.xpath(xxpath));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].srollIntoView()", ele);

	}

	public void scrollToPageBottom(String xpaath) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,0)");

	}

	public void clickbyJS(String xpath) {
		WebElement ele = driver.findElement(By.xpath(xpath));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].srollIntoView()", ele);

	}

}
