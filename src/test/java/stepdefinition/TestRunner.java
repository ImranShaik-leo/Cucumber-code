package stepdefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="Feature files/upload file.feature",glue={"stepdefinition"})
public class TestRunner {

}
