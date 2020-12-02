package laba_04_2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Server4Android {
    public static void main(String args[]) {
        try (DatagramSocket socket = new DatagramSocket(8000)) {
            System.out.println("Сервер запущен.");
            byte[] buffer = new byte[512];
            DatagramPacket incoming = new DatagramPacket(buffer, buffer.length);
            while (true) {
                System.out.println("Клиент подключен.");
                socket.receive(incoming);
                String str = new String(incoming.getData());
                System.out.println(str);

                String s = "Salam";
                buffer = s.getBytes();
                DatagramPacket dp = new DatagramPacket(buffer, buffer.length, incoming.getAddress(), incoming.getPort());
                socket.send(dp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
