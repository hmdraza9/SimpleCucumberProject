package runner.Runnerz;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = { "src/test/java/allFeatures" }, glue = { "stepDef" }
//		, tags = "@tag2"
)
public class TestRunner {

}
