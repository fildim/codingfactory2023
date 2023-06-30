package gr.aueb.cf.ch6;

/**
 * αναζητα το ελαχιστο και το μεγιστο στοιχειο ενος πινακα
 */
public class ArrayMinMaxApp {

    public static void main(String[] args) {

        int[] arr = {30, 12, 80, 7, 15};

        int minPosition = 0;
        int minValue = arr[minPosition];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < minValue) {

                minPosition = i;
                minValue = arr[i];
            }
        }

        System.out.printf("Min value: %d, Min position: %d", minValue, minPosition + 1);
    }



}
