package co.com.testerscolombia.certification.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static co.com.testerscolombia.certification.ui.LoginPageSauceLabs.RESULT_MESSAGE_LOGIN_ERROR;

public class ResultLoginSauceLabs {

    private ResultLoginSauceLabs(){
    }

    public static Question<String> message(){
        return Text.of(RESULT_MESSAGE_LOGIN_ERROR);
    }
}
