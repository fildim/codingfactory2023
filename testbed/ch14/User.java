package testbed.ch14;

/**
 * a simple JAVA class User with id, firstname, lastname and the basic constructors, getters, setters and toString methods<br>
 * also contains a registerUser method
 * @author fildim
 */
public class User {

    private long id;
    private String firstname;
    private String lastname;

    public User(long id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    /**
     * prints a message for success in {@link User} registration
     */
    public void registerUser() {
        System.out.println("User registered successfully");
    }

}
