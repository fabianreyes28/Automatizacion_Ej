package co.com.testerscolombia.certification.runners.aquabot_form;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/form_aquabotpage.feature",
        glue = "co.com.testerscolombia.certification.stepdefinitions.aquabot_form",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {"pretty", "html:target/serenity-reports//serenity-html-report.html", "rerun:target/serenity-reports/rerun.txt"}
        //,tags = "@SuccessfulForm"
)
public class WhenCompletedFormAquabotRunner {
}
