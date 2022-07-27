package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue={"steps.loginsteps"}, monochrome = true, tags = "@SmokeTest")
public class SmokeTestRunner {

}
