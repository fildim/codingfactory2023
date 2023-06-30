package gr.aueb.cf.ch6;

/**
 * αναζητα ενα στοιχειο σε ενα πινακα
 */
public class SecretArrayWithMethod {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        int value = 6;
        int position = 0;
        position = getElementPosition(arr, value);
        System.out.println("6 is in the " + position + "th position of the array");


    }

    /**
     * επιστρεφει το index του στοιχειου που αναζητα ή αν δε το βρει επιστρεφει -1
     * @param arr       ο input array
     * @param value     η τιμη που αναζηταμε
     * @return          index του στοιχειου ή -1
     */
    public static int getElementPosition  (int[] arr, int value)  {

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
