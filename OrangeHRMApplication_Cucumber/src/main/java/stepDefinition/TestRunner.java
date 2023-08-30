package stepDefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="OrangeHRMApplicationFeatureFile",
                 glue="stepDefinition",
                 monochrome=true
                 //,tags= {"@Sanity"}
				,plugin= { "pretty",
						   "html:target/OrangeHRMApplicationCucumberTestReports",
						   "json:target/OrangeHRMApplicationCucumberTestJsonReports.json",
					 "com.cucumber.listener.ExtentCucumberFormatter:target/OrangeHRMApplicationCucumberExtentReports.htm"
						
				}
                 
                // ,dryRun=true
                 
                 )
public class TestRunner {

}
