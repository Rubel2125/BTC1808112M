package testForCoat;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/anamulhoque/eclipse-workspace/WalmartMavenCucumberProject/FeatureFile/buyingCoatFromWalmart.Feature",glue= {"testForCoat"},format= {"json:Folder_Name/cucumber.json"})
public class RunnerClass {

}
