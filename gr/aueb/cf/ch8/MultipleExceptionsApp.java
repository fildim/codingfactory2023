package gr.aueb.cf.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MultipleExceptionsApp {

    public static void main(String[] args) {

        File file = new File("C:\\tmp\\random-file.txt");
        char ch;

        try (Scanner in = new Scanner(file)) {

            ch = (char) System.in.read();

        }catch (FileNotFoundException e2) {                     //οταν εχω πολλα exceptions παω απο το πιο ειδικο στο γενικο

            System.out.println("file not found error");

        }  catch (IOException e1) {

            //e.printStackTrace();
            System.out.println("read error");

        } catch (Exception e3) {

            System.out.println("something went wrong");
        }

    }
}
