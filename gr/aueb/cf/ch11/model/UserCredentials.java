package gr.aueb.cf.ch11.model;

public class UserCredentials {

    private int UserCredentialsId;
    private String username;
    private String password;

    public UserCredentials() {}

    public int getUserCredentialsId() {
        return UserCredentialsId;
    }

    public void setUserCredentialsId(int userCredentialsId) {
        UserCredentialsId = userCredentialsId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
