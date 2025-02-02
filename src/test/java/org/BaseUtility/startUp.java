package org.BaseUtility;

import java.awt.Desktop.Action;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class startUp {
	
	
	
	public void ScrollbBy(WebElement ele, int Scrolby) {
		for (int i = 0; i < Scrolby; i++) {
			ele.sendKeys(Keys.PAGE_DOWN);
		}

	}

	public void Scrollbyjs(WebElement ele, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ele);

	}
	

	public  ArrayList<String> getSelectedTextFromDDL(WebElement ele) {
		 Select sel = new Select(ele);
		 List<WebElement> selectedOptions = sel.getAllSelectedOptions();
		 ArrayList<String> ar = new ArrayList<String>();
		 for(int i=0; i< selectedOptions.size();i++) {
				ar.add(selectedOptions.get(i).getText());
			 }
			 return ar;
	}

	public void clickByJS(WebDriver driver,WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",ele);
	}
	public void scrollByJS(WebDriver driver,WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",ele);
	}
	
	public void scrollByPageDown(WebDriver driver,int noOfScroll,WebElement ele) {
		for(int i=1;i<= noOfScroll;i++) {
			ele.sendKeys(Keys.PAGE_DOWN);
		}
	}
	
	
	public ArrayList<String> getAllTextFromList1(List<WebElement> allEles) {
		
		 ArrayList<String> ar = new ArrayList<String>();
		 for(int i=0; i<allEles.size();i++) {
			ar.add(allEles.get(i).getText());
		 }
		 return ar;
	}
	
	
	public ArrayList<String> getAllTextFromDDL(WebElement ele) {
		Select sel = new Select(ele);
		 ArrayList<String> ar = new ArrayList<String>();
		 List<WebElement> allOptions = sel.getOptions();
		 for(int i=0; i<allOptions.size();i++) {
			//WebElement ele = allOptions.get(i);
			//String txt =ele.getText();
			// actColors.add(txt);
			ar.add(allOptions.get(i).getText());
		 }
		 return ar;
	}
	
	public List<WebElement> getAllOptionsFromDDL(WebElement ele){
		Select sel = new Select(ele);
		return sel.getOptions();
	}
	
	public int getNumberOfDataFromDDL(WebElement ele) {
		Select sel= new Select(ele);
		return sel.getOptions().size();
	}
	
   public String getDefaultSelectedValue(WebElement ele) {
   	Select sel = new Select(ele);
   	return sel.getFirstSelectedOption().getText();
   }
	
	public void scrollByPageDown(WebDriver driver,int numOfScrolls) {
		WebElement ele = driver.findElement(By.tagName("html"));
		for(int i=1;i<=numOfScrolls;i++) {
		ele.sendKeys(Keys.PAGE_DOWN);
		}
	}
	
	public String getAttributeValue(WebElement ele,String attribName) {
		return ele.getAttribute(attribName);
	}
	
	public String getWebElementText(WebElement ele) {
		return ele.getText();
	}
	
 

	
	public static WebDriver startUp(String bname, String Url) {

		WebDriver driver = null;

		if (bname.equalsIgnoreCase("ch") || bname.equalsIgnoreCase("Chrome")) {
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			option.setBrowserVersion("116");
			option.addArguments("start-maximized");
			option.addArguments("--disable-notifications");
			
			driver = new ChromeDriver(option);

		} else if (bname.equalsIgnoreCase("ff") || bname.equalsIgnoreCase("Firefox")) {
			FirefoxOptions option = new FirefoxOptions();
			option.addArguments("start-maximized");
			driver = new FirefoxDriver();

		} else if (bname.equalsIgnoreCase("ed") || bname.equalsIgnoreCase("edge")) {
			EdgeOptions option = new EdgeOptions();
			option.addArguments("start-maximized");
			driver = new EdgeDriver();

		} else {
			System.out.println("input not match");
		}

		// driver.manage().window().maximize();
		// it is work on selenium 3.0
		// driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		// it is work on selenium 4.0 on word
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(Url);

		return driver;

	}
	
	public WebDriver Hiturl(String Url) {

		WebDriver driver = null;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(Url);

		return driver;

	}
	
	public ArrayList<String> getAllTextFromList(List<WebElement> allEles) {
		
		 ArrayList<String> ar = new ArrayList<String>();
		 for(int i=0; i<allEles.size();i++) {
			ar.add(allEles.get(i).getText());
		 }
		 return ar;
	}
	

	public WebDriver initalize(String bname) {

		WebDriver driver = null;

		if (bname.equalsIgnoreCase("ch") || bname.equalsIgnoreCase("Chrome")) {
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			option.addArguments("start-maximized");
			driver = new ChromeDriver(option);

		} else if (bname.equalsIgnoreCase("ff") || bname.equalsIgnoreCase("Firefox")) {
			FirefoxOptions option = new FirefoxOptions();
			option.addArguments("start-maximized");
			driver = new FirefoxDriver();

		} else if (bname.equalsIgnoreCase("ed") || bname.equalsIgnoreCase("edge")) {
			EdgeOptions option = new EdgeOptions();
			option.addArguments("start-maximized");
			driver = new EdgeDriver();

		} else {
			System.out.println("input not match");
		}

		// driver.manage().window().maximize();
		// it is work on selenium 3.0
		// driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		// it is work on selenium 4.0 on word
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		

		return driver;

	}


	}


