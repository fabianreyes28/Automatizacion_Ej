package co.com.testerscolombia.certification.ui;

import net.serenitybdd.screenplay.targets.Target;

public class AquabotHomePage {

    public static final Target BTN_HOME = Target.the("Boton para ir a la pagina inicial de la empresa").locatedBy("//a[contains(text(), 'Home')]");
    public static final Target BTN_FORM = Target.the("Boton para ir a la seccion de formularios").locatedBy("//a[contains(text(), 'Forms')]");
    public static final Target BTN_BUTTONS_AND_LINKS = Target.the("Boton para ir a la seccion de botones y enlaces").locatedBy("//a[contains(text(), 'Buttons & Links')]");
    public static final Target BTN_IFRAMES_SECTION = Target.the("Boton para ir a la seccion de iFrames").locatedBy("//a[contains(text(), 'iFrame')]");
}
