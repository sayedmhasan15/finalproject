package bdd.ups.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "pretty", "html:target/cucumber", "json:target/cucumber-json.json" }, features = {
		"src/test/resources/Features" }, glue = { "bdd.ups.stepDefinitions" }, tags = { "@s072301" }, monochrome = true)

public class UpsTestRunner extends AbstractTestNGCucumberTests {

}


