package steps;

import cucumber.api.java.en.When;
import pages.LandingPage;
import pages.SignInPage;

/**
 * Created by simonjoshi on 14/03/15.
 */
public class LandingPageSteps extends DriverFactory{

    @When("^she chooses to sign up$")
    public void she_chooses_to_sign_up() throws Throwable {
        new LandingPage(driver).she_chooses_to_sign_up();
        new DriverFactory().captureScreenShot("Registration");
    }

    @When("^she chooses to sign in$")
    public void she_chooses_to_sign_in() throws Throwable {
        new LandingPage(driver).she_chooses_to_sign_in();
        new DriverFactory().captureScreenShot("SignIn");

    }
}
