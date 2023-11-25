package luma.ny.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		features = { "./Features/" },

		glue = { "golbaltek.ny.stepdefintions" }

)
public class myRunner extends AbstractTestNGCucumberTests {

}
