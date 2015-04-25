package steps;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.HomePage;
import pages.LandingPage;
import pages.SignUpPage;

/**
 * Created by simonjoshi on 14/03/15.
 */
public class StartingSteps extends DriverFactory {

    @Before
     public void beforeScenario() {
        driver = new DriverFactory().getDriver();
        System.out.println("this will run before the actual scenario");
    }

    @After
      public void afterScenario() {
        new DriverFactory().destroyDriver();
        System.out.println("this will run after scenario is finished, even if it failed");
    }

    @Given("^the user is on landing page$")
    public void setup() throws Throwable {
        driver.get("http://www.net-a-porter.com");
        driver.manage().window().maximize();
        new DriverFactory().captureScreenShot("Homepage");
    }
}
