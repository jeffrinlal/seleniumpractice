package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(features = "src/test/resources/Features/",
        glue = "Stepdefinition", dryRun = false, monochrome = true, tags = ("@smoke"))

public class runnercucumber extends AbstractTestNGCucumberTests {


    @DataProvider(parallel = true)
    @Override
    public Object[][] scenarios() {
        // TODO Auto-generated method stub
        return super.scenarios();
    }


}
