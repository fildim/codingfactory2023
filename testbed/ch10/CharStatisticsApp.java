package testbed.ch10;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;

public class CharStatisticsApp {

    public static void main(String[] args) {

        int[][] arr = new int [256][2];

        Path source = Paths.get("C:/tmp/randomchars.txt");

        try  {


            arr = FillArrayFromFile(source);

            Arrays.sort(arr, Comparator.comparingInt(row -> row[1]));

            printStatistics(arr);

        } catch (IOException e) {

            System.out.println("Error with file");
        }


    }


    public static int[][] FillArrayFromFile(Path source) throws IOException{

        int[][] arr = new int[256][2];
        int currentchar;

        try (BufferedReader bf = new BufferedReader(new FileReader(source.toFile()))) {

            while ((currentchar = bf.read()) != -1) {

                arr[currentchar][0] = currentchar;
                arr[currentchar][1]++;
            }

        } catch (IOException e) {

            throw new IOException(e);
        }

        return arr;
    }


    public static void printStatistics(int[][] arr) {

        char currentChar;
        int frequency;
        String charToString;

        System.out.println("Character Statistics:");

        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i][1] > 0) {


                currentChar = (char) arr[i][0];
                frequency = arr[i][1];

                charToString = escapeSpeciaChars(currentChar);

                System.out.println(charToString + " exists " + frequency + " times in the file.");
            }
        }
    }


    public static String escapeSpeciaChars(char currentChar) {

        switch (currentChar) {

            case '\t':
                return "\\t";
            case ' ':
                return "\\s";
            case '\n':
                return "\\n";
            default:
                return Character.toString(currentChar);
        }
    }



}
