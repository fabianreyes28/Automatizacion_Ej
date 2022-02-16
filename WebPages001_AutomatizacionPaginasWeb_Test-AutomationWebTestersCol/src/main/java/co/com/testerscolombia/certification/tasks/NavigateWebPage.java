package co.com.testerscolombia.certification.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NavigateWebPage implements Task {

    private final String urlWebPage;

    protected NavigateWebPage(String urlWebPage) {
        this.urlWebPage = urlWebPage;
    }

    public static Performable toPage(String urlWebPage) {
        return instrumented(NavigateWebPage.class, urlWebPage);
    }

    public static Performable toWikipediaPage() {
        return instrumented(NavigateWebPage.class, "https://www.wikipedia.org/");
    }

    public static Performable toSauceDemoLoginPage() {
        return instrumented(NavigateWebPage.class, "https://www.saucedemo.com/");
    }

    public static Performable toSauceDemoShoppingPage() {
        return instrumented(NavigateWebPage.class, "https://www.saucedemo.com/inventory.html");
    }

    public static Performable toSauceDemoCartProductsPage() {
        return instrumented(NavigateWebPage.class, "https://www.saucedemo.com/cart.html");
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(urlWebPage));
    }
}
