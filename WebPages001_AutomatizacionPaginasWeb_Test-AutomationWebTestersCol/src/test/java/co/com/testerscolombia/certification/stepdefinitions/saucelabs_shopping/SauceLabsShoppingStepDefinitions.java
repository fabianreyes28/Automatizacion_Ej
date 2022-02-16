package co.com.testerscolombia.certification.stepdefinitions.saucelabs_shopping;

import co.com.testerscolombia.certification.questions.CartContentsProducts;
import co.com.testerscolombia.certification.questions.CartCountProductos;
import co.com.testerscolombia.certification.tasks.AddToCart;
import co.com.testerscolombia.certification.tasks.Login;
import co.com.testerscolombia.certification.tasks.NavigateWebPage;
import co.com.testerscolombia.certification.utils.SwagLabUser;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SauceLabsShoppingStepDefinitions {

    private List<String> cartItems;

    @Given("{actor} logs in to Sauce Labs")
    public void userLogsInToSauceLabs(Actor actor) {
        actor.wasAbleTo(
                NavigateWebPage.toSauceDemoLoginPage(),
                Login.asA(SwagLabUser.STANDARD_USER)
        );
    }

    @And("{actor} browsing to SwagLabs shopping page")
    public void colinBrowsingToSwagLabsShoppingPage(Actor actor) {
        actor.wasAbleTo(
                NavigateWebPage.toSauceDemoShoppingPage()
        );
    }

    @When("{actor} adds the following items to the cart:")
    public void heAddsTheFollowingItemsToTheCart(Actor actor, List<String> items) {
        cartItems = items;
        items.forEach(
                itemName -> actor.attemptsTo(AddToCart.item(itemName))
        );
    }

    @Then("the shopping cart count should be {int}")
    public void theShoppingCartCountShouldBe(int expectedCount) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(CartCountProductos.currenteDisplayed())
                        .asAnInteger()
                        .isEqualTo(expectedCount)
        );
    }

    @And("the items should appear in the cart")
    public void theItemsShouldAppearInTheCart() {
        theActorInTheSpotlight().attemptsTo(
                NavigateWebPage.toSauceDemoCartProductsPage(),
                Ensure.that(CartContentsProducts.currentDisplayed())
                        .containsElementsFrom(cartItems)
        );
    }
}
