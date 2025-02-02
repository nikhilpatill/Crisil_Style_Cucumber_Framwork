package org.hooks;

import java.io.File;
import org.apache.logging.log4j.*;
import java.io.IOException;
import java.util.Properties;

import org.BaseUtility.startUp;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.asserts.SoftAssert;
import org.utilities.BaseUtility;
import org.utilities.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class AppHooks {
	public static Properties prop;
	public static startUp sb;
	public static SoftAssert ac;
	public static WebDriver driver;
	public static Scenario scn;
	public static Logger log;

	

	
	
	
	@Before (order=2)
	public void init_objects(Scenario scn) {
		
		prop =new Properties();
		sb = new startUp();
		ac = new SoftAssert();
		AppHooks.scn = scn;
		
	}
	
	@Before(order=3)
	public void startUp() {
					
    	
	driver = sb.startUp("ch", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

				
	}
	
	@After(order=5)
	public void tearDown() {
		driver.quit();
	}
	
	
	@After  (order=10)
	public void takeScreenshot() throws InterruptedException {
		if(AppHooks.scn.isFailed()) {
			byte[]scn = ((TakesScreenshot)AppHooks.driver).getScreenshotAs(OutputType.BYTES);   //type 2
			//String scn = ((TakesScreenshot)AppHooks.driver).getScreenshotAs(OutputType.BASE64);    //type3
			
			//String scnName = AppHooks.scn.getName().replaceAll(" ","")+"_"+dt+".png";    gives the date(dt)
			String scnName = AppHooks.scn.getName().replaceAll(" ","")+".png";
			AppHooks.scn.attach(scn,"image/png",scnName);
		}
		
		else
		{
			byte[]scn = ((TakesScreenshot)AppHooks.driver).getScreenshotAs(OutputType.BYTES);   //type 2
			//String scn = ((TakesScreenshot)AppHooks.driver).getScreenshotAs(OutputType.BASE64);    //type3
			
			//String scnName = AppHooks.scn.getName().replaceAll(" ","")+"_"+dt+".png";    gives the date(dt)
			String scnName = AppHooks.scn.getName().replaceAll(" ","")+".png";
			AppHooks.scn.attach(scn,"image/png",scnName);
		}
			
	}
}


//******Type 1- but old way   *******
//File scn = ((TakesScreenshot)AppHooks.driver).getScreenshotAs(OutputType.FILE);
////String scnName = AppHooks.scn.getName().replaceAll(" ","")+"_"+dt+".png";    gives the date(dt)
//String scnName = AppHooks.scn.getName().replaceAll(" ","")+".png";
//try {
//	FileHandler.copy(scn,new File("./screenshots/"+scnName));
//}catch(IOException e){
//	e.printStackTrace();
//}
















