package steps;

import cucumber.api.java.en.And;
import pages.SignInPage;

public class SignInPageSteps extends DriverFactory {

    @And("^she provides the email id as (.*)$")
    public void she_provides_the_email_id(String emailId) throws Throwable {
        new SignInPage(driver).she_provides_the_email(emailId);
    }

    @And("^she signs-in$")
    public void she_signs_in() throws Throwable {
        new SignInPage(driver).she_signs_In();
    }

    @And("^she provides the password in signin page as (.*)$")
    public void she_provides_the_password_in_signin_page_as(String password) throws Throwable {
        new SignInPage(driver).she_provides_the_password(password);
    }
}
