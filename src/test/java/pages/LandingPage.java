package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


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
