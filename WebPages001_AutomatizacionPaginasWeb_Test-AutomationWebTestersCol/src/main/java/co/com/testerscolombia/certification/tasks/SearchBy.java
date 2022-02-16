package co.com.testerscolombia.certification.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

import static co.com.testerscolombia.certification.ui.WikipediaHomePage.FIELD_ENTER_WORD_SEARCH;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchBy implements Task {

    private String keyword;

    protected SearchBy(String keyword) {
        this.keyword = keyword;
    }

    public static Performable keyword(String keyword) {
        return instrumented(SearchBy.class, keyword);
    }

    @Override
    @Step("{0} searches for articles containing they word ")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(keyword)
                        .into(FIELD_ENTER_WORD_SEARCH)
                        .thenHit(Keys.ENTER));
    }
}
