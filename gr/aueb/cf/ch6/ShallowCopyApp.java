package gr.aueb.cf.ch6;

/**
 * makes a copy of an array
 */
public class ShallowCopyApp {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = new int[arr1.length];      //0, 0, 0, 0

        //αντιγραφη αναφορων
//        arr2 = arr1;
//        arr2[0] = 5;    //αλλαζει και το arr1 γιατι ειναι το ιδιο σημειο στη μνημη με δυο διαφορετικες αναφορες

        for (int i = 0; i < arr1.length; i++)   {
            arr2[i] = arr1[i];  //αυτο οντως αντιγραφει το arr1 στο arr2
        }

    }



}
