package co.com.testerscolombia.certification.stepdefinitions.aquabot_form;

import co.com.testerscolombia.certification.questions.MessageFormAquabot;
import co.com.testerscolombia.certification.tasks.EnterInformationFormAquabot;
import co.com.testerscolombia.certification.tasks.NavigateWebPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.testerscolombia.certification.utils.UrlWebSites.URL_HOMPAGE_AQUABOT;
import static  net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import java.util.List;
import java.util.Map;

import static co.com.testerscolombia.certification.ui.AquabotHomePage.BTN_FORM;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsStringIgnoringCase;

public class CompleteFormAquabotStepDefinitions {


    @Given("{actor} is on the Aquabot home page")
    public void mickeyIsOnTheAquabotHomePage(Actor actor) {
        actor.wasAbleTo(NavigateWebPage.toPage(URL_HOMPAGE_AQUABOT));
    }

    @And("(s)he navigates to the Demo Contact Form")
    public void actorNavigatesToTheDemoContactForm() {
        theActorInTheSpotlight().wasAbleTo(
                Click.on(BTN_FORM)
        );
    }

    @When("(s)he enters the following data")
    public void actorEntersTheFollowingData(List<Map<String, String>> customerData) {
        theActorInTheSpotlight().attemptsTo(
                EnterInformationFormAquabot.of(customerData)
        );
    }

    @Then("{actor} should see the {string}")
    public void actorShouldSeeTheMessageSubmitted(Actor actor, String expectedMessage) {
        actor.should(
                seeThat(MessageFormAquabot.result(), containsStringIgnoringCase(expectedMessage))
        );
    }
}
