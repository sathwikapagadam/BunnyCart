package com.BunnyCart.TestRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\com\\BunnyCart\\Feature\\4_MultipleProducts_AddToCart.feature",
glue= {"com.BunnyCart.StepDefinition"},
plugin= {"pretty","html:target/cucumberreport/report4.html"},
monochrome=true)
public class BunnyCartDemo4 extends AbstractTestNGCucumberTests{

}
