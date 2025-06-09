package base;

import java.rmi.Remote;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driverinstance {
	
    protected static WebDriver driver;
    protected static WebDriverWait wait;

    // ✅ Constructor
    public void loginscreen(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

}
