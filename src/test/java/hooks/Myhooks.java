package hooks;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Driverinstance;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;



public class Myhooks extends Driverinstance{
	
	@Before(order = 2)
	public void url() {
		
		System.out.println(driver.getCurrentUrl());
	}
	
	@Before(order = 2)
	public void logincred() {
		
		
	}
	
	@Before(order = 1)
	public void beforescenario(Scenario scenario) throws InterruptedException {
		
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
//		driver.get("https://modelhubqa.xemplarinsights.com/login");
//		driver.manage().window().maximize();
//		wait = new WebDriverWait(driver, Duration.ofSeconds(45));
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));

	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("--headless"); // <- Headless for Jenkins
	    options.addArguments("--no-sandbox");
	    options.addArguments("--disable-dev-shm-usage");

	    driver = new ChromeDriver(options);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
	    driver.get("https://modelhubqa.xemplarinsights.com/login");
	    driver.manage().window().maximize();
	    wait = new WebDriverWait(driver, Duration.ofSeconds(45));
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		
		
		
		
//		System.out.println(scenario.getName());
//		System.out.println("Before step is pass");
		
	}
	
	
	
	@After
	public void afterscenario(Scenario scenario) throws IOException {
		boolean failed = scenario.isFailed();
	    System.out.println("Is Failed? " + failed);

	    if (failed && driver != null) {
	        try {
	            TakesScreenshot ts = (TakesScreenshot) driver;
	            byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);

	            // Attach screenshot to Cucumber report
	            scenario.attach(screenshot, "image/png", "Failed Screenshot");
	            System.out.println("Screenshot byte length: " + screenshot.length);
	        } catch (Exception e) {
	            System.out.println("Screenshot capture failed: " + e.getMessage());
	            System.out.println("Page update");
	            
	        }
	    }

	    if (driver != null) {
	        driver.quit();
	    }
//		boolean failed =scenario.isFailed();
//		System.out.println("is Failed"+ failed);
//		
//		if(failed) {
			
//		byte[]	screenshot = driver.getScreenshotAs(OutputType.BYTES);
//		scenario.attach(screenshot, "image/png", "Failed Screenshot");
			
//		File screenshotFile = new File("./Screenshots/img6.png");
//		byte[] fileContent = Files.readAllBytes(screenshotFile.toPath());
//		scenario.attach(fileContent, "image/png", "Failed Screenshot");	
			
//		TakesScreenshot takescreenshot = (TakesScreenshot) driver;
//		String base64Screenshot = takescreenshot.getScreenshotAs(OutputType.BASE64);
			
		
//        TakesScreenshot takescreenshot = (TakesScreenshot) driver;
//	      String orginal = takescreenshot.getScreenshotAs(OutputType.BASE64);
//	      byte[] converted = Base64.getDecoder().decode(orginal);
//	      File duplicatelocation = new File("./Screenshots/img6.png");
//	      FileOutputStream fos = new FileOutputStream(duplicatelocation);
//	      fos.write(converted);			
			
//		}
		
		
		
	}

}
