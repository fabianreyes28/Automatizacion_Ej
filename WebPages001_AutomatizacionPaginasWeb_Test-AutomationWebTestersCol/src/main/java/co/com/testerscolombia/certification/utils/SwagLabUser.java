package co.com.testerscolombia.certification.utils;

public enum SwagLabUser {

    STANDARD_USER("standard_user", "secret_sauce"),
    INVALID_USER("standard_user", "123"),
    LOCKEDOUT_USER("locked_out_user", "secret_sauce");

    private String user;
    private String password;

    SwagLabUser(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
}
