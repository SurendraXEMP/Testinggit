package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import base.Driverinstance;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginpage extends Driverinstance {




@Given("user is entered the email id as {string}")
public void user_is_entered_the_email_id_as(String string) {
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.loading-spinner")));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email"))).sendKeys(string);
}
@Given("user is entered the password as {string}")
public void user_is_entered_the_password_as(String string) {
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.loading-spinner")));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password"))).sendKeys(string);
}
@When("user clicks on the sign in button")
public void user_clicks_on_the_sign_in_button() {
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.loading-spinner")));
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Sign In']"))).click();
}
@Then("user should login into the portal")
public void user_should_login_into_the_portal() {
    String text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[contains(text(), 'Surendra')]"))).getText();
    System.out.println("Login Successful. User: " + text);
}












}