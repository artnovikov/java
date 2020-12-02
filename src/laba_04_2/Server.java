package laba_04_2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
    public static void main(String args[]) {

        double a, b, c, d, e, x, y, z, result;
        byte[] buffer = new byte[512];
        String s;
        DatagramPacket incoming;
        DatagramPacket dp;

        try(DatagramSocket socket = new DatagramSocket(8000)) {

            incoming = new DatagramPacket(buffer, buffer.length);

            while (true) {
                socket.receive(incoming);

                s = new String(incoming.getData());
                String var[] = s.split(" ");

                x = Double.parseDouble(var[0]);
                y = Double.parseDouble(var[1]);

                System.out.println(x + " " + y);

                a = x + 3;
                b = Math.abs(x - y);
                c = Math.pow(x, 2);

                d = Math.pow(Math.abs(x + Math.pow(y, 2)), 3);
                e = Math.pow(x, 3);

                result = 5 * Math.atan(x) - (1 / 4) * Math.cos((a * b + c) / (d + e));

                FilE.write(x + " " + y + " = " + result + "\n");

                dp = new DatagramPacket(Double.toString(result).getBytes(), Double.toString(result).getBytes().length, incoming.getAddress(), incoming.getPort());
                socket.send(dp);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
