package test_runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
		"src\\test\\resources\\Feature_files\\ Adatin.feature" }, glue = "stepdefenition", monochrome = true, 
				plugin = {
			"html:C:\\Users\\admin\\eclipse-workspace\\Adatinhotel\\Report"})
//				"json:C:\\Users\\admin\\eclipse-workspace\\Adatinhotel\\Report"})
//				"junit:C:\\Users\\admin\\eclipse-workspace\\Adatinhotel\\Report"})

public class Testclass {

}
