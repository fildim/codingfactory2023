package testbed.ch10;

public class TheaterApp {

    public static final boolean seats[][] = new boolean[12][30];    //12 rows and 30 columns

    public static void main(String[] args) {

        initializeSeats();

        printSeats();

        try {
            bookSeat('A', 1);       //first row and first column
            System.out.println("Seat booked");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            bookSeat('L', 30);      //last row and last column
            System.out.println("Seat booked");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        printSeats();

        try {
            cancelSeat('A', 1);     //first row and first column
            System.out.println("Seat cancelled");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            cancelSeat('L', 30);    //last row and last column
            System.out.println("Seat cancelled");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        printSeats();

    }


    public static void initializeSeats() {

        for (boolean[] item : seats) {
            for (boolean item2 : item) {
                item2 = false;
            }
        }
    }


    public static void printSeats() {

        for (boolean[] item : seats) {
            for (boolean seat : item) {
                System.out.print(seat == false ? "Available seat " : "Not available ");
            }
            System.out.println();
        }
    }

    /**
     * marks a seat in the seats table as not available
     * @param row
     *          the row of the input seat
     * @param col
     *          the column of the input seat
     * @throws Exception
     *          if input is invalid or seat already not available
     */
    public static void bookSeat(char row, int col) throws Exception {

        int usableRow = row - 65;
        int usableCol = col - 1;

        try {
            if (usableRow < 0 || usableRow > 12 || usableCol < 0 || usableCol > 30) throw new Exception("Invalid seat");

            if (seats[usableRow][usableCol] == true) throw new Exception("Seat not available");

        } catch (Exception e) {
            throw e;
        }

        seats[usableRow][usableCol] = true;
        //δεν ηξερα πως να δινω μηνυμα στο χρηστη οτι πηγε οκευ οποτε το εκανα εκτος της μεθοδου
        //σκεφτηκα να το κανω με exception αλλα ειναι προφανως λαθος χρηση του μηχανισμου
        //σωστα ή λαθος το εκανα;;;
    }


    /**
     * marks a seat in the seats table as available
     * @param row
     *          the row of the input seat
     * @param col
     *          the column of the input seat
     * @throws Exception
     *          if input is invalid or seat already available
     */
    public static void cancelSeat(char row, int col) throws Exception {

        int usableRow = row - 65;
        int usableCol = col - 1;

        try {
            if (usableRow < 0 || usableRow > 12 || usableCol < 0 || usableCol > 30) throw new Exception("Invalid seat");

            if (seats[usableRow][usableCol] == false) throw new Exception("Seat was not booked");

        } catch (Exception e) {
            throw e;
        }

        seats[usableRow][usableCol] = false;
        //αντιστοιχα τα ερωτηματα με της book...
    }


}

