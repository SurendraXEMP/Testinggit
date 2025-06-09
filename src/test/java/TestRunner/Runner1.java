package TestRunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



//@CucumberOptions(
//    features = "src/test/java/Features/login.feature",
//    glue = {"Steps","hooks"},
//    
//    plugin =  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
//    plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
//
//    plugin = {"pretty", "html:target/cucumber-report.html",
//    		"json:reports/results.json",
//    		"junit:reports/result.xml",
//    		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
//    
//    monochrome = true,
//    snippets = CucumberOptions.SnippetType.CAMELCASE,
//    dryRun = !true,
//    tags = "@reg"
//)


@CucumberOptions(
	    features = "src/test/java/Features/modelrun.feature",
	    glue = {"Steps", "hooks"},
	    plugin = {
	        "pretty",
	        "html:target/cucumber-report.html",
	        "json:reports/results.json",
	        "junit:reports/result.xml",
	        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
	    },
	    monochrome = true,
	    dryRun = !true
//	    tags = "@reg"
	)




public class Runner1 extends AbstractTestNGCucumberTests {
	
	
}
