package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SignInPage;
import pages.SignUpPage;
import steps.DriverFactory;

/**
 * Created by simonjoshi on 26/04/15.
 */
public class SignInPageSteps extends DriverFactory {

    @And("^she provides the email id as (.*)$")
    public void she_provides_the_email_id(String emailId) throws Throwable {
        new SignInPage(driver).she_provides_the_email(emailId);

    }

    @And("^she signs-in$")
    public void she_signs_in() throws Throwable {
        new SignInPage(driver).she_signs_In();

    }

    @Then("^she should be in my account page$")
    public void she_should_be_in_my_account_page() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @And("^she provides the password in signin page as (.*)$")
    public void she_provides_the_password_in_signin_page_as(String password) throws Throwable {
        new SignInPage(driver).she_provides_the_password(password);

    }
}
