package co.com.testerscolombia.certification.tasks;

import co.com.testerscolombia.certification.utils.SwagLabUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.testerscolombia.certification.ui.LoginPageSauceLabs.FIELD_PASSWORD;
import static co.com.testerscolombia.certification.ui.LoginPageSauceLabs.FIELD_USERNAME;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {

    private final SwagLabUser standardUser;

    public Login(SwagLabUser standardUser) {
        this.standardUser = standardUser;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(standardUser.getUser()).into(FIELD_USERNAME),
                Enter.theValue(standardUser.getPassword()).into(FIELD_PASSWORD).thenHit(Keys.ENTER)
        );
    }

    public static Login asA(SwagLabUser standardUser) {
        return instrumented(Login.class, standardUser);
    }
}
