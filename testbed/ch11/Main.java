package testbed.ch11;

import testbed.ch11.model.User;
import testbed.ch11.model.UserCredentials;

public class Main {

    public static void main(String[] args) {

        User user = new User(1L, "fil", "dim");
        UserCredentials userCredentials = new UserCredentials(1, "admin", "12345");

        System.out.println("{" + user.getId() + "," + user.getFirstname() + "," + user.getLastname() + "}");
        System.out.println("{" + userCredentials.getId() + "," + userCredentials.getUsername() + "," + userCredentials.getPassword() + "}");
    }
}
