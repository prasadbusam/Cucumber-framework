package testRunner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="./Features/Form.feature",
		glue="stepDefinition",
		dryRun=false
		
		)

public class TestRunner {

}
