package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public boolean isSignOutLinkDisplayed(){
        return driver.findElement(By.className("my-account-link")).isDisplayed();
    }
}
