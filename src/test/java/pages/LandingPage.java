package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by simonjoshi on 14/03/15.
 */
public class LandingPage {

    WebDriver driver;
    private static final int IMPLICIT_WAIT_TIMEOUT = 5000;

    public LandingPage(WebDriver driver){
        this.driver = driver;
    }

    public void she_chooses_to_sign_up() throws Throwable {
        driver.findElement(By.cssSelector(".register>a")).click();
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT_TIMEOUT, TimeUnit.MILLISECONDS);
    }
}
