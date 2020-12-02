package laba_04;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String args[]) {
        while (true)
            try (
                    Socket s = new Socket("127.0.0.1", 3000);
            ) {
                System.out.print("Введите целое положительное число: ");


                // Чтение с терминала
                BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in, "cp1251"));
                String request = bReader.readLine();

                // Отправка на сервер
                BufferedWriter bWritter = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
                bWritter.write(request);
                bWritter.newLine();
                bWritter.flush();

                // Принятие ответа от сервера
                BufferedReader bf = new BufferedReader(new InputStreamReader(s.getInputStream()));
                System.out.println("Ответ от сервера: " + bf.readLine());

            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}
