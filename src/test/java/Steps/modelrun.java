//package Steps;
//
//import java.time.Duration;
//import org.openqa.selenium.By;
//import org.openqa.selenium.StaleElementReferenceException;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import base.Driverinstance;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class modelrun extends Driverinstance {
//
//    @Given("user is entered the email id as {string}")
//    public void userIsEnteredTheEmailIdAs(String username) {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email"))).sendKeys(username);
//    }
//
//    @Given("user is entered the password as {string}")
//    public void userIsEnteredThePasswordAs(String password) {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password"))).sendKeys(password);
//    }
//
//    @When("user is is click on the sing in button")
//    public void userIsClickOnTheSignInButton() {
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Sign In']"))).click();
//    }
//
//    @Given("Click on the batch scroing button")
//    public void clickOnBatchScoringButton() {
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Batch Scoring']"))).click();
//    }
//
//    @Given("Click on upload batch")
//    public void clickOnUploadBatch() {
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Upload Batch')]"))).click();
//    }
//
//    @Given("Upload the files")
//    public void uploadTheFiles() {
//        WebElement fileInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='file']")));
//        fileInput.sendKeys("C:\\Users\\smoddipatla\\Desktop\\Modelhub_qa_sample\\Sample Quote-Policy Data.csv\n" +
//                           "C:\\Users\\smoddipatla\\Desktop\\Modelhub_qa_sample\\Sample Driver Data.csv\n" +
//                           "C:\\Users\\smoddipatla\\Desktop\\Modelhub_qa_sample\\Sample Vehicle Data.csv");
//    }
//
//    @Given("click on submit button")
//    public void clickOnSubmitButton() {
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Submit']"))).click();
//    }
//
//    @Given("click on Ok button in success popup")
//    public void clickOnOkButtonInSuccessPopup() {
//        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.loading-spinner")));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='OK']"))).click();
//    }
//
//    @Given("click on preprocess button")
//    public void clickOnPreprocessButton() {
//        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.loading-spinner")));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Pre-Process']"))).click();
//    }
//
//    @Given("click on ok  button in preprocess popup")
//    public void clickOnOkButtonInPreprocessPopup() {
//        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.loading-spinner")));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='OK']"))).click();
//    }
//
//    @Given("click on validate button")
//    public void clickOnValidateButton() {
//        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.loading-spinner")));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Validate']"))).click();
//    }
//
//    @When("click on ok button in validate popup")
//    public void clickOnOkButtonInValidatePopup() {
//        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.loading-spinner")));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='OK']"))).click();
//    }
//
//    @Then("Click on Quote model ready button")
//    public void clickOnQuoteModelReadyButton() {
//        try {
//            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.loading-spinner")));
//            int retry = 0;
//            while (retry < 3) {
//                try {
//                    WebElement readyButton = new WebDriverWait(driver, Duration.ofSeconds(15))
//                        .until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(@class, 'batchButton') and text()='Ready'])[1]")));
//                    readyButton.click();
//                    break;
//                } catch (StaleElementReferenceException e) {
//                    retry++;
//                    System.out.println("Retrying due to stale element... Attempt: " + retry);
//                }
//            }
//        } catch (Exception e) {
//            System.out.println("Exception occurred while clicking 'Ready' button: " + e.getMessage());
//        }
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='OK']"))).click();
//    }
//}
//
