package gr.aueb.cf.ch6;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {5, 8, 2, 14, 3, 25, 12};

        int minValue;
        int minPosition;
        int tmp;


        for (int i = 0; i < arr.length - 1; i++){

            minPosition = i;
            minValue = arr[i];

            for (int j = i + 1; j < arr.length; j++){

                if (arr[j] < minValue){
                    minValue = arr[j];
                    minPosition = j;
                }
            }

            // swap with first element
            tmp = arr[i];
            arr[i] = arr[minPosition];
            arr[minPosition] = tmp;


        }

        for (int row : arr) System.out.println(row);

    }
}
