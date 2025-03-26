package com.BunnyCart.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\com\\BunnyCart\\Feature\\5_SignOut.feature",
glue= {"com.BunnyCart.StepDefinition"},
plugin= {"pretty","html:target/cucumberreport/report5.html"},
monochrome=true)
public class BunnyCartDemo5 extends AbstractTestNGCucumberTests{

}
