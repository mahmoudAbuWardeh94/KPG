package com.runner;

import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions; // <-- correct import

@CucumberOptions(
        features = "src/test/java/feature",
        glue = {"com.stepsDefinitions", "com.base"},
        plugin = {"pretty", "html:target-report.html","json:target/cucumber.json"},
        monochrome = true
)
public class RunnerTest extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}