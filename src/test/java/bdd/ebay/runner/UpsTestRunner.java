package bdd.ebay.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "pretty", "html:target/cucumber", "json:target/cucumber-json.json" }, features = {
		"src/test/resources/Features" }, glue = { "bdd.ebay.stepDefinitions" }, tags = { "@chrome" }, monochrome = true)

public class UpsTestRunner extends AbstractTestNGCucumberTests {

}


