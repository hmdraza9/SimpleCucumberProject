//package runner.Runnerz;
//
//import org.testng.annotations.DataProvider;
//
//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;
//
//@CucumberOptions(tags = "@tag2", features = { "src/test/resources/features" }, glue = { "com.app.stepDefs" }, plugin = {
//		"pretty", "html:target/cucumber-reports.html" }, monochrome = false)
//public class TestRunnerParallelTestNG extends AbstractTestNGCucumberTests {
//
//	@Override
//	@DataProvider(parallel = true)
//	public Object[][] scenarios() {
//		return super.scenarios();
//	}
//}