package co.com.testerscolombia.certification.runners.wikipedia_search;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/search_terms_wikipedia.feature",
        glue = "co.com.testerscolombia.certification.stepdefinitions.wikipedia_searching"
)
public class WhenSearchingForItemsWikipedia {
}
