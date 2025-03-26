package com.BunnyCart.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\com\\BunnyCart\\Feature\\3_SignIn_Valid_Invalid.feature",
glue= {"com.BunnyCart.StepDefinition"},
plugin= {"pretty","html:target/cucumberreport/report3.html"},
monochrome=true)
public class BunnyCartDemo3 extends AbstractTestNGCucumberTests{

}
