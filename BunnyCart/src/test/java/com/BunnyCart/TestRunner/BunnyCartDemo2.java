package com.BunnyCart.TestRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\com\\BunnyCart\\Feature\\2_SignIn_AddtoCart.feature",
glue= {"com.BunnyCart.StepDefinition"},
plugin= {"pretty","html:target/cucumberreport/report2.html"},
monochrome=true)
public class BunnyCartDemo2 extends AbstractTestNGCucumberTests{

}
