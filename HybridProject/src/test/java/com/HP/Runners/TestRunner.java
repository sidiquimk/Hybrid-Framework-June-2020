package com.HP.Runners;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/java/com/HP/Features"}
, glue= {"com/HP/StepDefinition"}
, plugin= {
        "pretty",
        "html:target/cucumber-default-reports"
        ,  "json:target/cucumber.json"
			}
, tags= {"@Smoke"}
, dryRun=false)

public class TestRunner {
	

}
