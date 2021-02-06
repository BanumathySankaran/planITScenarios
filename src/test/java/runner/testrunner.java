package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Feature", glue = { "seleniumgluecode" }, plugin = { "pretty",
		"html:Report/cucumber-reports" }, monochrome = true, tags = { "@P12321,@P12322,@P12323,@P12324" })

public class testrunner {

}
