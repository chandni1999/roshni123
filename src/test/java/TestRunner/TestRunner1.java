package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src//test//resources//Features1",
glue= {"stepdefination"},
plugin= {"pretty","html:target/htmlreports.html","json:target/JSON_Reports/json_report.json",
		"junit:target/JUNIT_Reports/junit_report.xml"},monochrome=true)


public class TestRunner1 extends AbstractTestNGCucumberTests
{

}
