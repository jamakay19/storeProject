package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\Jama\\IdeaProjects\\ShoppingWebsiteAutomation\\src\\test\\resources\\AutomationPractice\\groupProject.feature",
        glue = "StepDefinitions",
        dryRun = false
)

public class cukesRunner {
}
