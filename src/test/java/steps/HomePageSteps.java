package steps;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.HomePage;

public class HomePageSteps extends DriverFactory {

    @Then("^she should be logged in to the website$")
    public void she_should_be_logged_in_to_the_website() throws Throwable {
        Assert.assertTrue(new HomePage(driver).isSignOutLinkDisplayed());
    }
}
