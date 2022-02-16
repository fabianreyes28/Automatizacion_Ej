package co.com.testerscolombia.certification.ui;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPageSauceLabs {

    private LoginPageSauceLabs() {
    }

    public static final Target RESULT_MESSAGE_LOGIN_ERROR = Target.the("Mensaje de error en el login").locatedBy("//h3[@data-test= 'error']");
    public static final Target FIELD_USERNAME = Target.the("Campo para ingresar el usuario del cliente").locatedBy("//input[@id = 'user-name']");
    public static final Target FIELD_PASSWORD = Target.the("Campo para ingresar el password del cliente").locatedBy("//input[@id = 'password']");
}
