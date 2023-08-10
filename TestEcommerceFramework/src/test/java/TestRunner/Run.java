package TestRunner;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
        features = ".//Features/ProductCheckOut.feature",
        glue = "StepDefinition",
        tags = "@Sanity", 
		/*plugin= { "pretty",
                "html:target/site/cucumber-pretty",
        "json:target/cucumber.json" },*/
        
        plugin = {"pretty", "html:target/CucumberReports/reports_html.html"},
        monochrome = true)

public class Run {

	
	
	
}
