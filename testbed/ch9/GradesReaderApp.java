package testbed.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.lang.Integer.parseInt;

public class GradesReaderApp {

    public static void main(String[] args) {

        Path source = Paths.get("C:/tmp/grades.txt");
        Path target = Paths.get("C:/tmp/primOut.txt");
        Path log = Paths.get("C:/tmp/log.txt");

        String line = "";
        String[] studentDetails = new String[4];

        String name = "";
        String surname = "";
        int grade1, grade2, avg;

        try (BufferedReader bf = new BufferedReader(new FileReader(source.toFile()))) {

            PrintStream ps = new PrintStream(target.toFile(), StandardCharsets.UTF_8);
            PrintStream psLogger = new PrintStream(log.toFile(), StandardCharsets.UTF_8);

            while ((line = bf.readLine()) != null) {

                studentDetails = line.split(" +");

                grade1 = parseInt(studentDetails[2]);
                grade2 = parseInt(studentDetails[3]);

                ps.print(studentDetails[0] + " ");
                ps.print(studentDetails[1] + " ");

                if((grade1 < 0) || (grade1 > 10) || (grade2 < 0) || (grade2 > 10)) {

                    ps.println();
                    psLogger.println("Λάθος στους βαθμούς του μαθητή " + studentDetails[0] + " " + studentDetails[1]);

                } else {

                    ps.println((grade1 + grade2) / 2);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
