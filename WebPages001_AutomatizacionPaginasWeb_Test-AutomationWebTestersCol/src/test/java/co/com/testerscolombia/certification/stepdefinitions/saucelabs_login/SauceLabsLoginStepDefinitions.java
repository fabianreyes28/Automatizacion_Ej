package co.com.testerscolombia.certification.stepdefinitions.saucelabs_login;

import co.com.testerscolombia.certification.questions.ResultLoginSauceLabs;
import co.com.testerscolombia.certification.tasks.Login;
import co.com.testerscolombia.certification.tasks.NavigateWebPage;
import co.com.testerscolombia.certification.utils.SwagLabUser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.ensure.web.ElementLocated;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.Button;
import org.openqa.selenium.By;

import static co.com.testerscolombia.certification.utils.ConstantMessageLoginSauceLabs.INVALID_CREDENTIALS_USER;
import static co.com.testerscolombia.certification.utils.ConstantMessageLoginSauceLabs.LOCKED_USER;
import static org.hamcrest.Matchers.equalTo;

public class SauceLabsLoginStepDefinitions {

    @Given("{actor} navigates to SwagLabs login page")
    public void userNavigateToSwagLabsLoginPage(Actor actor) {
        actor.wasAbleTo(NavigateWebPage.toSauceDemoLoginPage());
    }


    @When("{actor} logs in with valid credentials")
    public void actorLogsInWithValidCredentials(Actor actor) {
        actor.attemptsTo(
                Login.asA(SwagLabUser.STANDARD_USER)
                //Enter.theValue("standard_user").into("//input[@id = 'user-name']"),
                //Enter.theValue("secret_sauce").into("//input[@id = 'password']"),
                //Enter.theValue("secret_sauce").into("//input[@id = 'password']").thenHit(Keys.ENTER),
                //Click.on(Button.called("Login"))
        );
    }

    @Then("{actor} should see the product catalog page")
    public void heShouldSeeTheProductCatalogPage(Actor actor) {
        actor.attemptsTo(
                Ensure.that(Text.of("//span[@class = 'title']")).containsIgnoringCase("products")
        );
    }

    @When("{actor} logs in with invalid credentials")
    public void actorLogsInWithInvalidCredentials(Actor actor) {
        actor.attemptsTo(
                Login.asA(SwagLabUser.INVALID_USER)
        );
    }

    @Then("{actor} should see message the invalid credentials")
    public void actorShouldSeeMessageTheInvalidCredentials(Actor actor) {
        actor.attemptsTo(
                Ensure.that(ResultLoginSauceLabs.message()
                ).asAString().isEqualToIgnoringCase(INVALID_CREDENTIALS_USER)
        );
    }

    @When("{actor} logs in with locked out credentials")
    public void actorLogsInWithLockedOutCredentials(Actor actor) {
        actor.attemptsTo(
                Login.asA(SwagLabUser.LOCKEDOUT_USER)
        );
    }

    @Then("{actor} should see message the user locked out")
    public void heShouldSeeMessageTheUserLockedOut(Actor actor) {
        actor.attemptsTo(
                Ensure.that(ResultLoginSauceLabs.message()
                ).asAString().isEqualToIgnoringCase(LOCKED_USER)
        );
    }
}
