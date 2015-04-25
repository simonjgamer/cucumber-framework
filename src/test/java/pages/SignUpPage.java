package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by simonjoshi on 14/03/15.
 */
public class SignUpPage {

    WebDriver driver;

    @FindBy(id ="firstname")
    private WebElement fistNameTextBox;

    @FindBy(id ="surname")
    private WebElement lastNameTextBox;

    @FindBy(id ="emailad")
    private WebElement emailTextBox;

    @FindBy(id ="password")
    private WebElement passwordTextBox;

    @FindBy(id ="confpassword")
    private WebElement confirmPasswordTextBox;

    @FindBy(id ="submitregister")
    private WebElement signUpButton;


    public SignUpPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void she_provides_the_first_name_as(String firstName) throws Throwable {
        fistNameTextBox.sendKeys(firstName);
    }

    public void she_provides_the_second_name_as(String lastName) throws Throwable {
        lastNameTextBox.sendKeys(lastName);
    }

    public void she_provides_the_email_as() throws Throwable {
        emailTextBox.sendKeys(getemail());
    }

    public void she_provides_the_password_as(String password) throws Throwable {
        passwordTextBox.sendKeys(password);
    }

    public void she_provides_the_confirm_password_again_as(String confirmPassword) throws Throwable {
        confirmPasswordTextBox.sendKeys(confirmPassword);
    }

    public void she_signs_up() throws Throwable {
        signUpButton.click();
    }

    public String getemail(){
        return "validemail"+Math.random()+"@yopmail.com";
    }
}
