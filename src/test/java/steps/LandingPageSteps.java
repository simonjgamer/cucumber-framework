package steps;

import cucumber.api.java.en.When;
import pages.LandingPage;

/**
 * Created by simonjoshi on 14/03/15.
 */
public class LandingPageSteps extends DriverFactory{

    @When("^she chooses to sign up$")
    public void she_chooses_to_sign_up() throws Throwable {
        new LandingPage(driver).she_chooses_to_sign_up();
        new DriverFactory().captureScreenShot("Registration");
    }
}
