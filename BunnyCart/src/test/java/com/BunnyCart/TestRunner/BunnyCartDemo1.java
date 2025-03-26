package com.BunnyCart.TestRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\com\\BunnyCart\\Feature\\1_CreateAccount.feature",
glue= {"com.BunnyCart.StepDefinition"},
plugin= {"pretty","html:target/cucumberreport/report1.html"},
monochrome=true)

public class BunnyCartDemo1 extends AbstractTestNGCucumberTests{

}
