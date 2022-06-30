package com.US45.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/US45/step_definitions",
        dryRun = false,
        plugin = {
              "html:target/cucumber-report.html",
              //  "me.jvt.cucumber.report.PrettyReports:target/cucumber",
             //   "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        },
        tags = "@wip"
)

public class CukesRunner {
}
