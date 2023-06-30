package testbed.ch10;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class Lotto6App {

    public static void main(String[] args) {

        try (Scanner in = new Scanner(new File("C:/tmp/lotto6in.txt"));
             PrintStream ps = new PrintStream("C:/tmp/lotto6out.txt", StandardCharsets.UTF_8)) {

            final int LOTTO_SIZE = 6;
            int[] inputNumbers = new int[49];
            int pivot = 0;
            int[] result = new int[6];
            int num;
            int window;

            while ((num = in.nextInt()) != -1 && pivot <= 48) {

                inputNumbers[pivot] = num;
                pivot++;
            }

            if (pivot < 6) {

                System.out.println("Input file contains less than 6 numbers");
                System.exit(1);
            }

            int[] numbers = Arrays.copyOfRange(inputNumbers, 0, pivot);
            Arrays.sort(numbers);

            window = pivot - LOTTO_SIZE;

            for (int i = 0; i <= window; i++) {
                for (int j = i + 1; j <= window + 1; j++) {
                    for (int k = j + 1; k <= window + 2; k++) {
                        for (int l = k + 1; l <= window + 3; l++) {
                            for (int m = l + 1; m <= window + 4; m++) {
                                for (int n = m + 1; n <= window + 5; n++) {

                                    result[0] = numbers[i];
                                    result[1] = numbers[j];
                                    result[2] = numbers[k];
                                    result[3] = numbers[l];
                                    result[4] = numbers[m];
                                    result[5] = numbers[n];

                                    if (!isEvenGE(result, 4) && !isOddGE(result, 4) && !containsConsecutiveGE(result, 2) && !sameEndingGE(result, 3) && !containsSameTenGE(result, 3)) {

                                        ps.printf("%d %d %d %d %d %d\n", result[0], result[1], result[2], result[3], result[4], result[5]);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    /**
     * returns true if the number of evens is greater or equal to a threshold limit
     * @param arr   the input array
     * @param threshold     the upper limit of the constraint
     * @return      true, if the number of evens is greater than or equal to a threshold limit,
     *              false otherwise
     */
    public static boolean isEvenGE(int[] arr, int threshold) {

        int even = 0;

        for (int num : arr) {

            if (num % 2 == 0) even++;
        }

        return even > threshold;
    }


    public static boolean isOddGE(int[] arr, int threshold) {

        int odd = 0;

        for (int num : arr) {

            if (num % 2 != 0) odd++;
        }

        return odd > threshold;
    }


    public static boolean containsConsecutiveGE(int[] arr, int threshold) {

        int answer = 0;
        int currentConsecutive = 0;

        for (int i = 1; i < arr.length ; i++) {

            if (arr[i] == arr[i - 1] + 1) {
                currentConsecutive++;
            } else {
                currentConsecutive = 0;
            }

            if (currentConsecutive > answer) answer = currentConsecutive;
        }

        return answer >= threshold;
    }


    public static boolean containsSameTenGE(int[] arr, int threshold) {

        int[] count = new int[5];
        int num;

        for ( int item : arr) {

            num = item / 10;

            count[num]++;

            if (count[num] > threshold) return true;
        }
        return false;
    }


    public static boolean sameEndingGE(int[] arr, int threshold) {

        int[] count = new int[10];
        int num;

        for (int item : arr) {

            num = item % 10;

            count[num]++;

            if (count[num] > threshold) return true;
        }

        return false;
    }


}
