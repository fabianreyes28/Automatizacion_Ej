package co.com.testerscolombia.certification.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;
/**
 * Represents information appearing on an article displayed on Wikipedia
 */
@Subject("the displayed titulo de la pagina principal de busqueda de Wikipedia")
public class DisplayedTitleWikipedia implements Question<String> {


    @Override
    public String answeredBy(Actor actor) {
        return Text.of("//h1[@id = 'firstHeading']").answeredBy(actor);
    }

    public static DisplayedTitleWikipedia ofSearch() {
        return new DisplayedTitleWikipedia();
    }
}
