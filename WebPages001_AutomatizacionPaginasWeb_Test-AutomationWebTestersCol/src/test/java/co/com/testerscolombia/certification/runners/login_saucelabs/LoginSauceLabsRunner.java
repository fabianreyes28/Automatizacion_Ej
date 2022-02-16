package co.com.testerscolombia.certification.runners.login_saucelabs;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/login_saucedemo_labs.feature",
        glue = "co.com.testerscolombia.certification.stepdefinitions.saucelabs_login",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {"pretty"}
)
public class LoginSauceLabsRunner {
}
