package co.com.testerscolombia.certification.ui;

import net.serenitybdd.screenplay.targets.Target;

public class FormContacDemoAquabot {

    public static  final Target USER_NAME = Target.the("Campo para ingresar el nombre del usuario").locatedBy("//*[@id = 'cname']");
    public static  final Target EMAIL_USER = Target.the("Campo para ingresar el correo electronico del usuario").locatedBy("//*[@id = 'cemail']");
    public static  final Target PHONE_USER = Target.the("Campo para ingresar el numero telefonico del usuario").locatedBy("//*[@id = 'cphone']");

    public static final Target PHONE_CHECK = Target.the("Casilla para marcar el tipo de telefono del cliente").locatedBy("//label[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz') , '{0}')]/input");

    public static  final Target CHECKBOX_SUCCESS_OR_ERROR = Target.the("Casilla para simular un mensaje de exito o error").locatedBy("//p[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz') , '{0}')]/input");

    public static  final Target TEXT_AREA_MESSAGE = Target.the("Temas sobre la pregunta en el mensaje").locatedBy("//*[@id = 'cmessage']");
    public static  final Target SELECT_LIST_TYPEQUESTION = Target.the("Temas sobre la pregunta en el mensaje").locatedBy("//*[@id = 'cselect']");

    public static  final Target BTN_SUBMIT_FORM = Target.the("Casilla para simular un mensaje de exito").locatedBy("//*[@id = 'submit']");
    public static  final Target BTN_CLEAR_FORM = Target.the("Casilla para simular un mensaje de exito").locatedBy("//*[@id = 'clear']");

    public static  final Target MESSAGE_SUBMITFORM = Target.the("Mensaje obtenido cuando se envia el formulario con errores").locatedBy("//*[@id = 'cmsgSubmit']");
}
