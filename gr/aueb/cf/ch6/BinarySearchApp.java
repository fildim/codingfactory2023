package gr.aueb.cf.ch6;

/**
 * σε ταξινομημενο πινακα η πιο γρηγορη αναζητηση
 */
public class BinarySearchApp {

    public static void main(String[] args) {

        int[] arr = {1, 5, 7, 8, 9, 12};

        final int KEY = 1;
        int low = 0;
        int high = arr.length - 1;
        int position;

        position = binarySearch(arr, KEY, low, high);

        System.out.printf("Position: %d, Value: %d", position + 1, arr[position]);
    }

    /**
     * returns the position of a given value within an array
     * @param arr       the given array
     * @param value     the given value to find
     * @param low       start index
     * @param high      end index
     * @return          the position of the value or -1 otherwise
     */
    public static int binarySearch(int[] arr, int value, int low, int high) {

        if (arr == null)    return -1;
        if (low < 0 || high > (arr.length - 1))     return -1;
        if (high < low)     return -1;

        int median = (low + high) / 2;

        if (value == arr[median])   return median;

        if (value < arr[median]) {

            return binarySearch(arr, value, low, median -1);
        } else {

            return binarySearch(arr, value, median + 1, high);
        }
    }
}
