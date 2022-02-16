package co.com.testerscolombia.certification.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.testerscolombia.certification.ui.FormContacDemoAquabot.MESSAGE_SUBMITFORM;


public class MessageFormAquabot {

    private MessageFormAquabot() {
    }

    public static Question<String> result() {
        return Text.of(MESSAGE_SUBMITFORM);
    }

}
