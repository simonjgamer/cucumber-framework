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
        tags = "@test",
        format = {"pretty", "html:target/cucumber", "json:target/cucumber-report.json"})
public class RunFeatureTest {
}
