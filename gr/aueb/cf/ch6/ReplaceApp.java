package gr.aueb.cf.ch6;

/**
 * updates a value in an array
 */
public class ReplaceApp {

    public static void main(String[] args) {

        int[] arr = {1, 2, 6, 9, 15};

        replace(arr, 6, 56);
        for (int item : arr) System.out.println(item + " ");

    }

    /**
     * updates old val with new val if old val exists
     * @param arr           the given array
     * @param oldValue      value to be updated
     * @param newValue      new value
     */
    public static void  replace (int[] arr, int oldValue, int newValue) {

        int positionToUpdate = -1;

        if (arr == null) return;

        positionToUpdate = getIndex(arr, oldValue);
        if (positionToUpdate == -1) return;

        arr[positionToUpdate] = newValue;
    }

    /**
     * επιστρεφει το index του στοιχειου που αναζητα ή αν δε το βρει επιστρεφει -1
     * @param arr       ο input array
     * @param value     η τιμη που αναζηταμε
     * @return          index του στοιχειου ή -1
     */
    public static int getIndex(int[] arr, int value)  {

        if (arr == null) return -1;

        int position = -1;
        for (int i = 0; i < arr.length; i++)    {

            if (arr[i] == value) {
                position = i;
                break;
            }
        }

        return position;
    }

}
