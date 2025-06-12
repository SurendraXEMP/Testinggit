package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = {
        
        "src/test/java/Features/login.feature",
        "src/test/java/Features/modelrun.feature"
        
        
    },
    glue = { "pages", "hooks" },
    plugin = {
        "pretty",
        "html:target/cucumber-report.html",
        "json:reports/results.json",
        "junit:reports/result.xml",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
    },
    monochrome = true,
    dryRun = false
)

public class Runner1 extends AbstractTestNGCucumberTests {
}
