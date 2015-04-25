package steps;

import cucumber.api.java.en.And;
import pages.SignUpPage;

/**
 * Created by simonjoshi on 14/03/15.
 */
public class SignUpPageSteps extends DriverFactory {

    @And("^she provides the first name as (.*)$")
    public void she_provides_the_first_name_as(String firstName) throws Throwable {
        new SignUpPage(driver).she_provides_the_first_name_as(firstName);
    }

    @And("^she provides the second name as (.*)$")
    public void she_provides_the_second_name_as(String lastName) throws Throwable {
        new SignUpPage(driver).she_provides_the_second_name_as(lastName);
    }

    @And("^she provides the email$")
    public void she_provides_the_email() throws Throwable {
        new SignUpPage(driver).she_provides_the_email();
    }

    @And("^she provides the password as (.*)$")
    public void she_provides_the_password_as(String password) throws Throwable {
        new SignUpPage(driver).she_provides_the_password_as(password);
    }

    @And("^she provides the confirm password again as (.*)$")
    public void she_provides_the_confirm_password_again_as(String confirmPassword) throws Throwable {
        new SignUpPage(driver).she_provides_the_confirm_password_again_as(confirmPassword);
    }

    @And("^she signs-up$")
    public void she_signs_up() throws Throwable {
        new SignUpPage(driver).she_signs_up();
    }

}
