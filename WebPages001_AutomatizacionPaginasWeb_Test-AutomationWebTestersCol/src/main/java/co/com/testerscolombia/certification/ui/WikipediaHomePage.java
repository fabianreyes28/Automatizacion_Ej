package co.com.testerscolombia.certification.ui;

import net.serenitybdd.screenplay.targets.Target;

public class WikipediaHomePage {
    public static final Target FIELD_ENTER_WORD_SEARCH = Target.the("Campo para ingresar la palabra a buscar").locatedBy("//input[@id = 'searchInput']");
}
