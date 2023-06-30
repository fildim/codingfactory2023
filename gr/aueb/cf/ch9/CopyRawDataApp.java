package gr.aueb.cf.ch9;

import java.io.*;

public class CopyRawDataApp {

    public static void main(String[] args) {

        int bytes = 0;
        int count = 0;
        byte[] buffer = new byte[8192];     //αναλογα με το μεγεθος του buffer παει και η ταχυτητα
        long start, end;
        double elapsed;

        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream("C:/tmp/test.mp4"))){

            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("C:/tmp/tmp.mp4"));

            start = System.currentTimeMillis();

            while ((bytes = in.read(buffer)) != -1) {

                out.write(buffer, 0 , bytes);
                count += bytes;
            }

            end = System.currentTimeMillis();
            elapsed = (end - start) / 1000.0;

            System.out.println(elapsed + "secs");

            System.out.printf("%f MB", (double) (count / (1024 * 1000)));

        } catch (IOException e) {

            throw new RuntimeException();
        }

    }
}
