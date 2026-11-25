package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "json:target/reports/cucumberReport.json", "html:target/reports/cucumber.html"},
        features = "src/test/resources/features",
        tags = "not @ignore",
        glue = {"steps"}
)
public class RunCucumberTest extends RunBase {

    @AfterClass
    public static void stop() {
        quitDriver();
    }
}
