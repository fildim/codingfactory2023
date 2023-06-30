package gr.aueb.cf.ch10;

public class Ch6App {

    public static void main(String[] args) {


    }


    public static int[] getLowAndHighIndexOf(int[] arr, int key) {

        int low = 0;
        int high = 0;
        int pivot;

        if (arr == null) return new int[] {};       //αντι για return null

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == key) {

                low = i;
                break;
            }
        }

        high = low;
        pivot = low + 1;

        while (pivot < arr.length && arr[pivot++] == key) {

            high++;
        }

        return new int[] {low, high};
    }

}
