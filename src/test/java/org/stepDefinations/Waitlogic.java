package org.stepDefinations;

import org.hooks.AppHooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitlogic {

	public static WebDriver driver = AppHooks.driver;
	public static WebDriverWait wait;

	public static void waitForSecond(int second) {

		try {
			Thread.sleep(second * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static boolean poolForElementBoolean(String xpath, int everyNsecond, int tillsecond) {

		int i = 0;
		boolean ele = false;
		while (i < tillsecond) {

			if (Compoent_Operation.isXpathElemetsAvailable(xpath)) {
				ele = true;
				break;

			} else {
				i += everyNsecond;
				waitForSecond(tillsecond);

			}

		}

		return ele;

	}

	public static void waitUntilElementClickable(String xpath) {

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));

	}

	public static void waitUntilElementvisibility(String xpath) {

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));

	}

}
