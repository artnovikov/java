package laba_04_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client {
    public static void main(String args[]) {
        try(DatagramSocket socket = new DatagramSocket()) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                System.out.println("Введите x, y: ");
                String s = (String) bufferedReader.readLine();

                DatagramPacket dp = new DatagramPacket(s.getBytes(), s.getBytes().length, InetAddress.getByName("127.0.0.1"), 8000);
                socket.send(dp);

                byte[] buffer = new byte[512];
                DatagramPacket incoming = new DatagramPacket(buffer, buffer.length);
                socket.receive(incoming);
                // System.out.println(new String(incoming.getData()));
                FilE.read();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
