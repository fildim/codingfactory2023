package testbed.ch6;

/**
 * Contains a method for finding the max element in an array
 */
public class ArrayMaxFinderApp {

    public static void main(String[] args) {

        int[] arr = {1, 15, 2, 0, 30};

        int maxPosition = getMaxPosition(arr, 0, 30);

        System.out.println("The highest element is in the " + (maxPosition + 1) + "th position");


    }

    /**
     * returns the position of the max element in an array
     * @param arr   the given array
     * @param low   the lowest element
     * @param high  the highest element
     * @return      position of max element in the array
     */
    public static int getMaxPosition(int[] arr, int low, int high) {

        if (arr == null)        return -1;

        int maxPosition = -1;

        for (int i = 0; i <= arr.length - 1; i++)   {

            if (arr[i] == high)  maxPosition = i;
        }

        return maxPosition;
    }

}
