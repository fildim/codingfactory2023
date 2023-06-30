package gr.aueb.cf.ch11;

/**
 *  A simple POJO class or otherwise known as a Java Bean
 */
public class Teacher {

    private long id;
    private String firstname;
    private String lastname;

    public Teacher() {}

    public Teacher(long id, String firstname, String lastname) {

        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
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
}
