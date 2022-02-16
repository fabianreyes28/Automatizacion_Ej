package co.com.testerscolombia.certification.utils;

public class ConstantMessageLoginSauceLabs {

    public static final String CLASS_CONSTANT_LOGIN="Class Constant Messsage Login SauceLabs";
    public static final String LOCKED_USER="Epic sadface: Sorry, this user has been locked out.";
    public static final String INVALID_CREDENTIALS_USER="Epic sadface: Username and password do not match any user in this service";

    private ConstantMessageLoginSauceLabs(){
        throw new IllegalStateException(CLASS_CONSTANT_LOGIN);
    }
}
