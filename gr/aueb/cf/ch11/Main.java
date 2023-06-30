package gr.aueb.cf.ch11;

/**
 * Driver class
 */
public class Main {

    public static void main(String[] args) {

        HelloUtil.sayHello();

        Student alice = new Student();
        Student bob = new Student(2, "Bob", "D.");

        System.out.println(Student.getStudentsCount());

        alice.setId(1);
        alice.setFirstname("Alice");
        alice.setLastname("Wonderland");

        System.out.println("Id: " + alice.getId());
        System.out.println("First name: "+ alice.getFirstname());
        System.out.println("Last name: " + alice.getLastname());

        System.out.println("Bob id: " + bob.getId());
        System.out.println("Firstname: " + bob.getFirstname());
        System.out.println("Lastname: " + bob.getLastname());
    }
}
