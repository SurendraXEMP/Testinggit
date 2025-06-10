//package Steps;
//
//import java.time.Duration;
//import org.openqa.selenium.By;
//import org.openqa.selenium.StaleElementReferenceException;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import base.Driverinstance;
//import hooks.Myhooks;
//
//import java.time.Duration;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;

//public class loginsteps extends Driverinstance {
//	
//	
//	@Given("user is entered the email id as {string}")
//	public void userIsEnteredTheEmailIdAs(String username) {
//	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")))
//	        .sendKeys(username);
//	}
//
//	@Given("user is entered the password as {string}")
//	public void userIsEnteredThePasswordAs(String password) {
//	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")))
//	        .sendKeys(password);
//	}

//	@Given("user is entered the email id as smoddipatla@xemplarinsights.com")
//	public void userIsEnteredTheEmailIdAsSmoddipatlaXemplarinsightsCom() {
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")))
//        .sendKeys("smoddipatla@xemplarinsights.com");
//					
//	}
//
//	@Given("user is entered the password as Safety@123")
//	public void userIsEnteredThePasswordAsPassword() {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")))
//        .sendKeys("Safety@123");
//	}

//	@When("user is is click on the sing in button")
//	public void userIsIsClickOnTheSingInButton() {
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Sign In']")))
//        .click();
//	}
//
//	@Then("user should login into the portal")
//	public void userShouldLoginIntoThePortal() {
//		String text =  driver.findElement(By.xpath("//b[contains(text(), 'Surendra')]")).getText();
//		String text1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//b[contains(text(), 'Surendra')]")))
//        .getText();
//		System.out.println(text1);
//	}
//	
//	@Then("click on logout button")
//	public void clickOnLogoutButton() {
//	    try {
//	        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.loading-spinner")));
//
//	        int logout = 0;
//	        while (logout < 3) {
//	            try {
//	                WebElement logoutbutton = new WebDriverWait(driver, Duration.ofSeconds(15))
//	                    .until(ExpectedConditions.elementToBeClickable(
//	                        By.xpath("//li//button[normalize-space(text())='Logout']")
//	                    ));
//	                logoutbutton.click();
//	                break;
//	            } catch (StaleElementReferenceException e) {
//	                logout++;
//	                System.out.println("logout unable to find the element");
//	            }
//	        }
//	        Thread.sleep(5000);
//	    } catch (Exception e) {
//	        e.printStackTrace();
//	    }
//	}

	
//	@Given("user is entered the email id as surya@example.com")
//	public void userIsEnteredTheEmailIdAsSuryaExampleCom() {
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")))
//        .sendKeys("smoddipa@xemplarinsights.com");
//	}
//	@Given("user is entered the password as passwordd")
//	public void userIsEnteredThePasswordAsPasswordd() {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")))
//        .sendKeys("Safety@1");
//	}
	
//	@When("user should not login into the portal")
//	public void userShouldNotLoginIntoThePortal() {
//		String text1 =  driver.findElement(By.xpath("//span[text()='Login Error']")).getText();
//		System.out.println(text1);
//	}
	
	
//	@When("user should not login into the adminportal")
//	public void user_should_not_login_into_the_adminportal() {
//		String text1 =  driver.findElement(By.xpath("//span[text()='Login Error']")).getText();
//		System.out.println(text1);
//	}
//	
//	
//	@When("Error message should display")
//	public void errorMessageShouldDisplay() {
//		String message =  driver.findElement(By.xpath("//span[@class='message']")).getText();
//		System.out.println(message);
//	}
	
	
	
//	@Given("user is entered the email id as {string}")
//	public void userIsEnteredTheEmailIdAs(String username) {
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")))
//      .sendKeys(username);
//	}
//	@Given("user is entered the password as {string}")
//	public void userIsEnteredThePasswordAs(String password) {
//      wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")))
//      .sendKeys(password);
//	}
	
//	@Given("user is entered the email id as {string}")
//	public void userIsEnteredTheEmailIdAs(String username) {
//	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")))
//	        .sendKeys(username);
//	}
//
//	@Given("user is entered the password as {string}")
//	public void userIsEnteredThePasswordAs(String password) {
//	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")))
//	        .sendKeys(password);
//	}


	
	
	
	
	
//}
