package test.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
				plugin={"pretty","json:target/cucumber.json"},//for reports
				features= {".//Features/"},//features file location
				glue= {"steps.definations","framework.hooks"}	
				//stepdef&hooks package location
		)

public class FunctionalRunnerClass extends AbstractTestNGCucumberTests{
	
	

}
