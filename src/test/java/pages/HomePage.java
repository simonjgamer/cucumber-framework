package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by simonjoshi on 14/03/15.
 */
public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public boolean isSignOutLinkDisplayed(){
        return driver.findElement(By.className("acc_dd_click_area")).isDisplayed();
    }
}
