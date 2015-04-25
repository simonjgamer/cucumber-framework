package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class StartingSteps extends DriverFactory {

    @Before
     public void beforeScenario() {
        driver = new DriverFactory().getDriver();
        System.out.println("this will run before the actual scenario");
    }

    @After
      public void afterScenario(Scenario scenario) {
        try {
            if (scenario.isFailed()) {
                final byte[] screenshot = ((TakesScreenshot) driver)
                        .getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            }
        } finally {
            new DriverFactory().destroyDriver();
        }
    }

    @Given("^the user is on landing page$")
    public void setup() throws Throwable {
        driver.get("http://www.net-a-porter.com");
        driver.manage().window().maximize();
        new DriverFactory().captureScreenShot("Homepage");
    }
}
