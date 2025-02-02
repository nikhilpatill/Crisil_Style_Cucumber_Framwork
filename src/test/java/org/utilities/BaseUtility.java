package org.utilities;

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
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseUtility {
	public void clickByActions(WebDriver driver,WebElement ele) {
		Actions act = new Actions(driver);
		act.click(ele).perform();
		}
	
	public void sendKeysByActions(WebDriver driver,WebElement ele,String value) {
		Actions act = new Actions(driver);
		act.sendKeys(ele,value).perform();
		}
	
	public void doubleClick(WebDriver driver,WebElement ele) {
		Actions act = new Actions(driver);
		act.doubleClick(ele).perform();
	}
	
	public void scrollByActions(WebDriver driver,WebElement ele) {
		Actions act = new Actions(driver);
		act.scrollToElement(ele).perform();
	}
	
	
	public boolean isAlertPresent(WebDriver driver,long time){
		try {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
			wait.until(ExpectedConditions.alertIsPresent());
			return true;
		}catch(Exception e) {
			return false;
		}
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
	
	public ArrayList<String> getAllTextFromList(List<WebElement> allEles) {
	
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
	
	public void waitForURLContains(WebDriver driver,long time ,String partialURL) {
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
		 wait.until(ExpectedConditions.urlContains(partialURL));
	}
	
	public void waitForExactTitle(WebDriver driver,long time ,String title){
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
		 wait.until(ExpectedConditions.titleIs(title));
	}
	
	public void waitForTitleContains(WebDriver driver,long time ,String partialTitle) {
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
	     wait.until(ExpectedConditions.titleContains(partialTitle));  
	}
	
	public void waitForVisibilityOfElementBy(WebDriver driver,long time,By obj) {
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(obj));
	}
	
	
	public void waitForPresenceOfByType(WebDriver driver,long time,String type,String expression) {
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		 if(type.equalsIgnoreCase("xpath")) {
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(expression)));
		 }else if (type.equalsIgnoreCase("css")) {
		    //WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
			wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(expression)));
		 }else if (type.equalsIgnoreCase("id")) {
			//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id(expression)));
		 }else if (type.equalsIgnoreCase("class")) {
			//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
			wait.until(ExpectedConditions.presenceOfElementLocated(By.className(expression)));
		}
	}
			
	public void waitForVisibilityByType(WebDriver driver,long time,String type,String expression) {
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
		
		 if(type.equalsIgnoreCase("xpath")) {
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(expression))));
		 }else if (type.equalsIgnoreCase("css")) {
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(expression))));
		 }else if (type.equalsIgnoreCase("id")) {
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(expression))));
		 }else if (type.equalsIgnoreCase("class")) {
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className(expression))));
		}
	}
	
	public void waitForVisibilityOfElement(WebDriver driver,long time,WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	public void waitForVisibilityOfElementByType(WebDriver driver,long time,String type,String expression) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(expression)))); this will work for only id put conditions for locators
		if(type.equalsIgnoreCase("xpath")) {
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(expression))));
		}else if (type.equalsIgnoreCase("css")) {
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(expression))));
		}else if (type.equalsIgnoreCase("id")) {
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(expression))));
		}else if (type.equalsIgnoreCase("class")) {
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className(expression))));
		}
		
	}
	
	public WebDriver initBrowser(String bName) {
	     WebDriver driver = null;
		
		if(bName.equalsIgnoreCase("ch")|| bName.equalsIgnoreCase("chrome")) {
 			  ChromeOptions options = new ChromeOptions(); //this and next statement for only for chrome
			  options.addArguments("--remote-allow-origins=*");
			  options.addArguments("start-maximized");
			  driver =  new ChromeDriver(options);  //now this line of code will opens the browser + upcasting
			
		}else if(bName.equalsIgnoreCase("ff")|| bName.equalsIgnoreCase("firefox")) {
			  driver = new FirefoxDriver();     //now this line of code will opens the browser + upcasting        
		
		}else if(bName.equalsIgnoreCase("edge")){
			  EdgeOptions options = new EdgeOptions();
			  options.addArguments("start-maximized");
			  driver = new EdgeDriver(options);    //now this line of code will opens the browser + upcasting   
			  
		}else {                                        //if-else for other browser
			  System.out.println("Invalid browser name !!");
		}
		//selenium 4.0 onwards
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//upto selenium version 3.0
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver;  //jis browser ko point out kiya hua hai wo return ho jao
		
}
	
	
	
	
	
	public WebDriver startUp(String bName,String url) {
		     WebDriver driver = null;
			
			if(bName.equalsIgnoreCase("ch")|| bName.equalsIgnoreCase("chrome")) {
	  			  ChromeOptions options = new ChromeOptions(); //this and next statement for only for chrome
	 			  options.addArguments("--remote-allow-origins=*");
	 			  options.addArguments("start-maximized");
	 			  driver =  new ChromeDriver(options);  //now this line of code will opens the browser + upcasting
	 			
	 		}else if(bName.equalsIgnoreCase("ff")|| bName.equalsIgnoreCase("firefox")) {
	 			  driver = new FirefoxDriver();     //now this line of code will opens the browser + upcasting        
	 		
	 		}else if(bName.equalsIgnoreCase("edge")){
	 			  EdgeOptions options = new EdgeOptions();
	 			  options.addArguments("start-maximized");
				  driver = new EdgeDriver(options);    //now this line of code will opens the browser + upcasting   
				  
	 		}else {                                        //if-else for other browser
	 			  System.out.println("Invalid browser name !!");
	 		}
			//selenium 4.0 onwards
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			//upto selenium version 3.0
			//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			//driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.navigate().to(url);
			return driver;  //jis browser ko point out kiya hua hai wo return ho jao
			
	}
}

//link of actiTime
//http://localhost:93/login.do
//username-admin
//passward-manager




//public void startUp_old(String bName) {
 //   WebDriver driver = null;
	//ChromeDriver objCH = null; instead of these three statement put only one above statement
	//FirefoxDriver objFF =null;
	//EdgeDriver objEdge = null;
//	if(bName.equalsIgnoreCase("ch")|| bName.equalsIgnoreCase("chrome")) {
//			ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
		//ChromeDriver objCH = new ChromeDriver(options);   //as upper side we declare as null so here it will give error at objCH; as local variable can't be duplicate
		// above line will opens the browser and now want to maximize the browser,ChromeDriver(options) constructor will open  
		//the browser and assign to objCH means this objCH pointing to browser and that browser need to maximize
		//objCH call the methods present inside the ChromeDriver;And in ChromeDriver the methods coming from Remote WebDriver class
		//there the implementation but methods are in the WebDriver interface
		//objCH.manage().window().maximize();    //but here is duplication of code
		//objCH = new ChromeDriver(options);       //upper side it is declared as null so here we initialized it
		//Instead of above statement write below one's
//		driver =  new ChromeDriver(options);  //now this line of code will opens the browser + upcasting
//	}else if(bName.equalsIgnoreCase("ff")|| bName.equalsIgnoreCase("firefox")) {
		//FirefoxDriver objFF = new FirefoxDriver();
		//objFF.manage().window().maximize();    //but here is duplication of code
		//objFF = new FirefoxDriver();             //upper side it is declared as null so here we initialized it
//	}else if(bName.equalsIgnoreCase("edge")){
		//EdgeDriver objEdge = new EdgeDriver();
		//objEdge.manage().window().maximize();   //but here is duplication of code
		//objEdge = new EdgeDriver();               //upper side it is declared as null so here we initialized it
//	}else {                                        //if-else for other browser
//		System.out.println("Invalid browser name !!");
//	}
	//here all three browsers are going to maximize but we want only one as per our choice(can we use if else ..  no) 
	//objCH.manage().window().maximize();            //we can not write here as it is giving error ;scope of object 
	//objFF.manage().window().maximize();            //we can not write here as it is giving error ;scope of object 
	//objEdge.manage().window().maximize();//we can not write here as it is giving error ;scope of object 
