package co.com.testerscolombia.certification.models;

import java.util.List;
import java.util.Map;

public class FormAquabotModel {

    private final Map<String, String> name;
    private final Map<String, String> email;
    private final Map<String, String> phoneNumber;
    private final Map<String, String> typePhone;
    private final Map<String, String> message;
    private final Map<String, String> questionAbout;
    private final Map<String, String> resultMessage;

    private static final String KEY_MAP_VALUE = "value";

    public String getName() {
        return name.get(KEY_MAP_VALUE);
    }

    public String getEmail() {
        return email.get(KEY_MAP_VALUE);
    }

    public String getPhoneNumber() {
        return phoneNumber.get(KEY_MAP_VALUE);
    }

    public String getTypePhone() {
        return typePhone.get(KEY_MAP_VALUE);
    }

    public String getMessage() {
        return message.get(KEY_MAP_VALUE);
    }

    public String getQuestionAbout() {
        return questionAbout.get(KEY_MAP_VALUE);
    }

    public String getResultMessage() {
        return resultMessage.get(KEY_MAP_VALUE);
    }


    public FormAquabotModel(Map<String, String> name, Map<String, String> email, Map<String, String> phoneNumber, Map<String, String> typePhone, Map<String, String> message, Map<String, String> questionAbout, Map<String, String> resultMessage) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.typePhone = typePhone;
        this.message = message;
        this.questionAbout = questionAbout;
        this.resultMessage = resultMessage;
    }

    public FormAquabotModel(List<Map<String, String>> customerData) {
        this.name = customerData.get(0);
        this.email = customerData.get(1);
        this.phoneNumber = customerData.get(2);
        this.typePhone = customerData.get(3);
        this.message = customerData.get(4);
        this.questionAbout = customerData.get(5);
        this.resultMessage = customerData.get(6);
    }
}
