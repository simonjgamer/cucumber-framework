package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage {

    WebDriver driver;

    @FindBy(name ="j_username")
    private WebElement emailTextBox;

    @FindBy(name ="j_password")
    private WebElement passwordTextBox;

    private By signInButton = By.cssSelector(".signin.primary-button");

    public SignInPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void she_provides_the_email(String emailId) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.name("j_username")));
        emailTextBox.sendKeys(emailId);
    }

    public void she_provides_the_password(String password) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.name("j_password")));
        passwordTextBox.sendKeys(password);
    }

    public void she_signs_In() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector(".signin.primary-button")));
        driver.findElement(signInButton).click();
    }
}
