package co.com.testerscolombia.certification.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CartCountProductos {

    private CartCountProductos() {
    }

    public static Question<Integer> currenteDisplayed(){
        return Text.of("//span[@class = 'shopping_cart_badge']").asInteger();
    }
}
