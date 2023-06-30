package testbed.ch10;

import java.util.Arrays;

public class ArrayCopiesApp {

    public static void main(String[] args) {

        int[][] arr1 = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        int[][] copy1 = shallowCopy(arr1);

        copy1[1][0] = 7;
        copy1[1][1] = 8;

        System.out.println("This is the shallow copy which does not in fact create a new array but only its' reference");
        printArr(arr1);
        printArr(copy1);

        int[][] arr2 = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        int[][] copy2 = deepCopy(arr2);

        copy2[1][0] = 7;
        copy2[1][1] = 8;

        System.out.println("This is an actual copy of the original array");
        printArr(arr2);
        printArr(copy2);



    }


    public static int[][] shallowCopy(int[][] arr) {

        int[][] copy = new int[arr.length][];

        System.arraycopy(arr, 0, copy, 0, arr.length);

        return copy;
    }


    public static int[][] deepCopy(int[][] arr) {

        int[][] copy = new int [arr.length][];

        for (int i = 0; i < arr.length; i++) {

            int[] rowMatrix = arr[i];

            int rowLength = rowMatrix.length;
            copy[i] = new int[rowLength];

            System.arraycopy(rowMatrix, 0, copy[i], 0, rowLength);

        }

        return copy;
    }


    public static void printArr(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }


}
