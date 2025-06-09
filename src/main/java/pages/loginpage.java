package pages;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.Driverinstance;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginpage extends Driverinstance{
	
	@Given("user is entered the email id as {string}")
	public void userIsEnteredTheEmailIdAs(String username) {
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")))
	        .sendKeys(username);
	}

	@Given("user is entered the password as {string}")
	public void userIsEnteredThePasswordAs(String password) {
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")))
	        .sendKeys(password);
	}
	
	@When("user is is click on the sing in button")
	public void userIsIsClickOnTheSingInButton() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Sign In']")))
        .click();
	}
	

	


}
