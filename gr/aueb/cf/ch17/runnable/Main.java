package gr.aueb.cf.ch17.runnable;

public class Main {

    public static void main(String[] args) {

        Knight kingArthur = new Knight("king arthur");
        Knight sirLancelot = new Knight("sir lancelot");
        Knight saintGeorge = new Knight("saint george");

        (new Thread(kingArthur)).start();
        (new Thread(sirLancelot)).start();
        (new Thread(saintGeorge)).start();

    }
}
