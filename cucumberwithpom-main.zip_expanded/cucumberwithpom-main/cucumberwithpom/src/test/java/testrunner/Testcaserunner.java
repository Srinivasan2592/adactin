package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\facebookpom.feature", glue = "mainstepdefinition", monochrome = true)

public class Testcaserunner {

}
