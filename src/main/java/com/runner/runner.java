package com.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/feature",
        glue = {"com.stepsDefinitions", "com.base"},
        plugin = {"pretty", "html:target-report.html"},
        monochrome = true
)
public class runner {

}
