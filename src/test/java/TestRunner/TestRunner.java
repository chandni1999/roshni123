package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import stepdefination.cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//resources//Features",
glue= {"stepdefination"})
public class TestRunner {

}
