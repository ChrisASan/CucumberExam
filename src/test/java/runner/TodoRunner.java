package runner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) 
@CucumberOptions(
		features = {"classpath:feature"},
		glue = {"step"}, 
		tags = "@Scenario3", 
		monochrome = true, 
		dryRun = false, 
		plugin = { 
				"pretty", 
				"html:target/cucumber", 
				"json:target/cucumber.json"  
}
)

public class TodoRunner {

}
