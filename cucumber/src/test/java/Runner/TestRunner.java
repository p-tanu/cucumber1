package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//from here i want to execute the cucumber file

@RunWith(Cucumber.class)
//@CucumberOptions(features= {"src/test/resources/Login/Login.feature"},glue= {"Definition"})
//@CucumberOptions(features= {"src/test/resources/Login/Login.feature"},glue= {"Definition"})
//@CucumberOptions(features= {"src/test/resources/Login/New.feature"},
@CucumberOptions(features= {"src/test/resources/Login/New.feature"},
glue= {"Definition"}, 
dryRun = false ,
plugin = {"html:testout/tanvi.html","json:testout/tanvi.json","junit:testout/tanvi.xml"}
//tags="@PositiveTesting" //by giving tag we can run specific scenario
//Strict = true //will check if ll methods are properly implemented
)
//dryrun = true will not run the implementation method 
//if any method is missed 

public class TestRunner {

}
