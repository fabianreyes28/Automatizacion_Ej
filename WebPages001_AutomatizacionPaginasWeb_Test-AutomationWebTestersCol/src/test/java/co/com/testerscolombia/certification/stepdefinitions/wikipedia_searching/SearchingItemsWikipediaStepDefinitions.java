package co.com.testerscolombia.certification.stepdefinitions.wikipedia_searching;

import co.com.testerscolombia.certification.questions.DisplayedTitleWikipedia;
import co.com.testerscolombia.certification.tasks.NavigateWebPage;
import co.com.testerscolombia.certification.tasks.SearchBy;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static org.hamcrest.Matchers.containsString;

public class SearchingItemsWikipediaStepDefinitions {

    private Actor actor;

    @Before
    public void initialSetup() {
        setTheStage(new OnlineCast());
    }

    @Given("{word} navigates to the Wikipedia page")
    public void pabloNavigatesToTheWikipediaPage(String actorName) {
        actor = OnStage.theActorCalled(actorName);
        actor.wasAbleTo(NavigateWebPage.toWikipediaPage());
    }

    @When("searching for the word {word}")
    public void searchingForTheWordEverest(String keyword) {
        actor.attemptsTo(SearchBy.keyword(keyword));
    }

    @Then("should see {word} in the page title")
    public void shouldSeeEverestInThePageTitle(String expectedKeywordInTitle) {
        actor.should(
                seeThat(
                        DisplayedTitleWikipedia.ofSearch(),
                        containsString(expectedKeywordInTitle))
        );
    }

}
