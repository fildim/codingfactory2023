package gr.aueb.cf.ch26;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class EchoCli {

    public static void main(String[] args) {

        Socket sockFD = null;
        File file = new File("C:\\tmp\\testfd.txt");

        try (Scanner in = new Scanner(file)) {

            InetAddress servAddress = InetAddress.getByName("127.0.0.1");
            final int servPort = 7;

            sockFD = new Socket(servAddress, servPort);

            PrintWriter pw = new PrintWriter(sockFD.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(sockFD.getInputStream()));

            String line = null;

            do {

                line = in.nextLine();
                pw.println(line);
                pw.flush();

                System.out.println("echo from server: " + br.readLine());

            } while (!line.equals("bye"));



        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (sockFD != null) sockFD.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
