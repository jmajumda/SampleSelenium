package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\jit majumdar\\Desktop\\WebD\\Work2\\FreeCrmBDDFramework\\src\\main\\java\\features\\login.feature", //path of the feature files
					glue={"stepDefinition"}, //path of the step definition files
					format={"pretty", "html:test-output", "junit:junit.xml/cucumber.xml"}, // to generate the reporting format
					monochrome=true, //to generate the output in readable format
					strict=true,   // it will check if any definition is not defined. It will execute the other definition and fail the undefined ones
					dryRun=false  //if yes, then it will quickly check the step definitions which are not defined.  
					)





public class TestRunner {

}
