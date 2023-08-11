package Testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags="@tag1",
  features = "Features/swaglab.feature"
  ,glue={"Stepdefs"},
  plugin= {"pretty","html:target/swaglab.html"}
  )
public class TestRunner {

}
