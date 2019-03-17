package firstTest;

public class LoginData {
    private final String phoneNum;
    private final String password;

    public LoginData(String phoneNum, String password) {
        this.phoneNum = phoneNum;
        this.password = password;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getPassword() {
        return password;
    }
}
