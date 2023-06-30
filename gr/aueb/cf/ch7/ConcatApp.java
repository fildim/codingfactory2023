package gr.aueb.cf.ch7;

/**
 * concatenates two or more strings
 */
public class ConcatApp {

    public static void main(String[] args) {

        String firstName = "Athan.";
        String lastName = "Androutsos";
        String fullName;
        String title = "Dr.";
        String titledFullName;

        fullName = title + firstName + lastName;
        titledFullName = title.concat(firstName).concat(lastName);

        System.out.println(fullName);
        System.out.println(titledFullName);
    }
}
