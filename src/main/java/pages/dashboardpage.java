package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Driverinstance;
import io.cucumber.java.en.Then;

public class dashboardpage extends Driverinstance {
	
	
	@Then("user should login into the portal")
	public void userShouldLoginIntoThePortal() {
//		String text =  driver.findElement(By.xpath("//b[contains(text(), 'Surendra')]")).getText();
		String text1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//b[contains(text(), 'Surendra')]")))
        .getText();
		System.out.println(text1);
	}
	
	@Then("click on logout button")
	public void clickOnLogoutButton() {
	    try {
	        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.loading-spinner")));

	        int logout = 0;
	        while (logout < 3) {
	            try {
	                WebElement logoutbutton = new WebDriverWait(driver, Duration.ofSeconds(15))
	                    .until(ExpectedConditions.elementToBeClickable(
	                        By.xpath("//li//button[normalize-space(text())='Logout']")
	                    ));
	                logoutbutton.click();
	                break;
	            } catch (StaleElementReferenceException e) {
	                logout++;
	                System.out.println("logout unable to find the element");
	            }
	        }
	        Thread.sleep(5000);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

}
