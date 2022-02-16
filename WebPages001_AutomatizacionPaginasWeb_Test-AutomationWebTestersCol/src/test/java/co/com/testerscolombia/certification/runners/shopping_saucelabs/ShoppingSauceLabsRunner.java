package co.com.testerscolombia.certification.runners.shopping_saucelabs;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/adding_items_to_cart.feature",
        glue = "co.com.testerscolombia.certification.stepdefinitions.saucelabs_shopping",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {"pretty"}
)
public class ShoppingSauceLabsRunner {
}
