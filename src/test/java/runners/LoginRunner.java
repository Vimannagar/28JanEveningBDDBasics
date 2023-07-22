package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\applicationfeatures\\login.feature"},
		
		glue = {"steps"},
		
		publish = true
		)


public class LoginRunner extends AbstractTestNGCucumberTests {

}
