package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by simonjoshi on 26/04/15.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/",
        glue = "steps",
        tags = "@signin",
        format = {"pretty", "html:target/cucumber/RunSignInFeatureAT", "json:target/cucumber-signin-report.json"})
public class RunSignInFeatureAT {
}
