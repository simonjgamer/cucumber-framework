package pages;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.rmi.runtime.Log;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Logger;

/**
 * Created by simonjoshi on 14/03/15.
 */
public class LandingPage {

    WebDriver driver;

    public By registerLinkLocator = By.cssSelector(".register>a");
    public By signInLinkLocator = By.cssSelector(".sign-in>a");


    public LandingPage(WebDriver driver){
        this.driver = driver;
    }

    public void she_chooses_to_sign_up() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(registerLinkLocator));
        driver.findElement(registerLinkLocator).click();
    }

    public void she_chooses_to_sign_in() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(signInLinkLocator));
        driver.findElement(signInLinkLocator).click();
    }
}
