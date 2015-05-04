package steps;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import util.PropertyReader;
import java.io.File;
import java.io.IOException;

public class DriverFactory {

    protected static WebDriver driver = new FirefoxDriver();

    final String pathDir = new java.io.File("").getAbsolutePath();
    final String pathFile = pathDir + "/Images/build/";

    public DriverFactory(){
        initialize();
    }

    private void initialize() {
        if (driver == null){
            createNewDriverInstance();
        }
    }

    private void createNewDriverInstance() {
        String browser = new PropertyReader().readProperty("browser");
        if (browser.equals("firefox")) {
            driver = new FirefoxDriver();
        } else {
            System.out.println("can't read browser type");
        }
    }

    public WebDriver getDriver(){
        return driver;
    }

    public void destroyDriver(){
        driver.quit();
        driver = null;
    }

    public void captureScreenShot(String pageName){
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(screenshot, new File(pathFile +pageName+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
