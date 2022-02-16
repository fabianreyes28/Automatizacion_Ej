package co.com.testerscolombia.certification.tasks;

import co.com.testerscolombia.certification.models.FormAquabotModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ui.Button;
import net.serenitybdd.screenplay.ui.Select;

import java.util.List;
import java.util.Map;

import static co.com.testerscolombia.certification.ui.FormContacDemoAquabot.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterInformationFormAquabot implements Task {

    private final FormAquabotModel formAquabotModel;

    public EnterInformationFormAquabot(List<Map<String, String>> customerData) {
        formAquabotModel = new FormAquabotModel(customerData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                Enter.theValue(formAquabotModel.getName()).into(USER_NAME),
                Enter.theValue(formAquabotModel.getEmail()).into(EMAIL_USER),
                Enter.theValue(formAquabotModel.getPhoneNumber()).into(PHONE_USER),
                Click.on(PHONE_CHECK.of(formAquabotModel.getTypePhone().toLowerCase())),
                Enter.theValue(formAquabotModel.getMessage()).into(TEXT_AREA_MESSAGE),
                Select.option(formAquabotModel.getQuestionAbout()).from(SELECT_LIST_TYPEQUESTION),
                Click.on(CHECKBOX_SUCCESS_OR_ERROR.of(formAquabotModel.getResultMessage().toLowerCase())).then(Click.on(BTN_SUBMIT_FORM))

        );
    }

    public static Performable of(List<Map<String, String>> customerData) {
        return instrumented(EnterInformationFormAquabot.class, customerData);
    }
}
