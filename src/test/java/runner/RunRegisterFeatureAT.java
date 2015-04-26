package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by simonjoshi on 22/03/15.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/",
        glue = "steps",
        tags = "@register",
        format = {"pretty", "html:target/cucumber/RunRegisterFeatureAT", "json:target/cucumber-register-report.json"})
public class RunRegisterFeatureAT {
}
