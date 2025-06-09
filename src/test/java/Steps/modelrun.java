package Steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Driverinstance;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class modelrun extends Driverinstance {
	
	
	@Given("Click on the batch scroing button")
	public void click_on_the_batch_scroing_button() {
		driver.findElement(By.xpath("//span[text()='Batch Scoring']")).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[text()='Batch Scoring']")));

	}
	@Given("Click on upload batch")
	public void click_on_upload_batch() {
		
		driver.findElement(By.xpath("//button[contains(text(),'Upload Batch')]")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[contains(text(),'Upload Batch')]")));

	}
	@Given("Upload the files")
	public void upload_the_files() {
        WebElement fileInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Upload CSV '])[1]")));
        fileInput.sendKeys("C://Users//smoddipatla//Desktop//Modelhub_qa_sample//Sample Quote-Policy Data.csv");
        fileInput.sendKeys("C://Users//smoddipatla//Desktop//Modelhub_qa_sample//Sample Driver Data.csv");
        fileInput.sendKeys("C://Users//smoddipatla//Desktop//Modelhub_qa_sample//Sample Vehicle Data.csv");
        

	}
	@Given("click on submit button")
	public void click_on_submit_button() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Submit']"))).click();
	}
	@Given("click on Ok button in success popup")
	public void click_on_ok_button_in_success_popup() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.loading-spinner")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='OK']"))).click();
	}
	@Given("click on preprocess button")
	public void click_on_preprocess_button() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.loading-spinner")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Pre-Process']"))).click();
	}
	@Given("click on ok  button in preprocess popup")
	public void click_on_ok_button_in_preprocess_popup() {
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.loading-spinner")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='OK']"))).click();

	}
	@Given("click on validate button")
	public void click_on_validate_button() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.loading-spinner")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Validate']"))).click();
	}
	@When("click on ok button in validate popup")
	public void click_on_ok_button_in_validate_popup() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.loading-spinner")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='OK']"))).click();
	}
	@Then("Click on Quote model ready button")
	public void click_on_quote_model_ready_button() {
	    try {
	        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.loading-spinner")));

	        int retry1 = 0;
	        while (retry1 < 3) {
	            try {
	                WebElement readyButton = new WebDriverWait(driver, Duration.ofSeconds(15))
	                        .until(ExpectedConditions.elementToBeClickable(
	                                By.xpath("(//button[contains(@class, 'batchButton') and text()='Ready'])[1]")
	                        ));
	                readyButton.click();
	                break;
	            } catch (StaleElementReferenceException e) {
	                retry1++;
	                System.out.println("Retrying due to stale element... Attempt: " + retry1);
	            }
	        }
	    } catch (Exception e) {
	        System.out.println("Exception occurred while clicking 'Ready' button: " + e.toString());
	        System.out.println("Upload file failed");
	    }
	    
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='OK']"))).click();
	}



}
