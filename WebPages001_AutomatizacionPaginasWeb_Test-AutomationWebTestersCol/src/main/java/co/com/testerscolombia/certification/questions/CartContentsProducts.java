package co.com.testerscolombia.certification.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.Collection;

public class CartContentsProducts {

    private CartContentsProducts() {
    }

    public static Question<Collection<String>> currentDisplayed() {
        return Text.ofEach("//div[@class='inventory_item_name']");
    }
}
