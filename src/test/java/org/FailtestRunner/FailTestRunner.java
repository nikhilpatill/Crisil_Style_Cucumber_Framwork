package org.FailtestRunner;

//following setup is for 'Run As ->JUnit'
/*import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/test/resources/org/features",            //LoginPage.feature
		glue = "org/stepDefinations",
		dryRun =false
		
		)
public class TestRunner {

}
*/

//following setup is for 'Run As ->TestNG

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(

		plugin = { "pretty", "html:FailTestCase/html_report/cucumber_report.html",
				"json:FailTestCase/json_report/json_report.json", "junit:FailTestCase/junit_report/junit_report.xlm",
				"rerun:target/failreRun.txt" },

		features = { "@target/failreRun.txt" }, // @ ,<= sysmbol mostimp target folder / filename most
		glue = { "org/stepDefinations", "org/hooks" },

		monochrome = true

)
public class FailTestRunner extends AbstractTestNGCucumberTests {

}
