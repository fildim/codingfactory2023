package gr.aueb.cf.ch6;

/**
 * δηλωση , αρχικοποιηση και εισαγωγη στοιχειων σε πινακα
 */
public class PopulateArray {

    public static void main(String[] args) {

        //δηλωση και αρχικοποιηση πινακα με length 3
        int[] arr = new int[3];
        arr[0] = 5;
        arr[1] = 7;
        arr[2] = 8;

        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        //enhanced for
        for (int item : arr)    {
            System.out.print(item + " ");
        }

        //unsized initialization
        int[] arr2 = {1, 5, 8, 9, 12};

        //array initializer
        int[] arr3 = new int[] {4, 6, 9 ,10};

    }
}
