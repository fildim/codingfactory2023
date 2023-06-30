package gr.aueb.cf.ch16.functionalinterfaces;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class  StudentApp {

    public static void main(String[] args) {

        Student[] students;
        students = new Student[] {
                new Student(1, "alice", "W"), new Student(2, "bob", "D"),
                new Student(3, "chris", "A"), new Student(4, "jim", "K")
        };

//        printStudents(students, new IDChecker() {
//            @Override
//            public boolean checkId(Student student) {
//                return student.getId() >= 3;
//            }
//        });

        //printStudents(students, (st) -> st.getId() <= 2);

        printStudents(students, (st) -> st.getId() <= 2, student -> student.printStudent());
        printStudents(students, (st) -> st.getId() == 2, student -> Student.printStaticStudent(student));

        printStudents(students, (st) -> st.getId() <= 2, Student::printStudent);            //same as above
        printStudents(students, (st) -> st.getId() == 2, Student::printStaticStudent);      //same as above

    }



//    public static void printStudents(Student[] students, IDChecker checker) {
//        for (Student student : students) {
//            if (checker.checkId(student)) {
//                System.out.println(student);
//            }
//        }
//    }

//    public static void printStudents(Student[] students, Predicate<Student> checker) {
//        for (Student student : students) {
//            if (checker.test(student)) {
//                System.out.println(student);
//            }
//        }
//    }

    public static void printStudents(Student[] students, Predicate<Student> checker, Consumer<Student> action) {
        for (Student student : students) {
            if (checker.test(student)) {
                action.accept(student);
            }
        }
    }

}
