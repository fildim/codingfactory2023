package testbed.ch6;

/**
 * Contains a method for finding the second lower element in an array
 */
public class ArraySecondLowerElementFinderApp {

    public static void main(String[] args) {

        int[] arr = {3, 5, 20, 0, 12};

        int secondLower = getSecondLower(arr);

        System.out.println("The 2nd lower element in the array is: " + secondLower);

        for (int item : arr) System.out.print(item + " ");
    }

    /**
     * returns the 2nd lower element in an array
     * @param arr   the given array
     * @return      the 2nd lower element
     */
    public static int getSecondLower(int[] arr) {

        if (arr == null)        return 0;   //τι πρεπει να επιστρεψω για να δειξω οτι δεν εγινε η αναζητηση λογω κενου πινακα;;;

        selectionSort(arr);

        return arr[1];
    }

    /**
     * swaps the positions of two elements in an array
     * @param arr       the given array
     * @param pos1      the original position of the first element
     * @param pos2      the original position of the second element
     */
    public static void swapArrayElements (int[] arr, int pos1, int pos2) {

        if (arr == null)    return;

        int tmp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = tmp;
    }

    /**
     * sorts an array
     * @param arr   the given array
     * @return      the sorted array
     */
    public static int[] selectionSort (int[] arr) {

        if (arr == null)    return null;

        int minValue;
        int minPosition;
        int tmp;

        for (int i = 0; i < arr.length - 1; i++) {

            minPosition = i;
            minValue = arr[i];

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < minValue) {

                    minValue = arr[j];
                    minPosition = j;
                }
            }

            tmp = arr[i];
            arr[i] = arr[minPosition];
            arr[minPosition] = tmp;
//            swapArrayElements(arr, arr[i], arr[minPosition]);     βγαζει error αν χρησιμοποιησω τη swap αλλα δε καταλαβαινω γιατι;;
        }

        return arr;
    }


}
