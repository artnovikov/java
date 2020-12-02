package laba_04;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String args[]) {
        try (ServerSocket ss = new ServerSocket(3000)) {
            System.out.println("Сервер запущен.");
            while (true)
                try (
                        Socket s = ss.accept();

                        OutputStream os = s.getOutputStream();
                        OutputStreamWriter osw = new OutputStreamWriter(os);
                        BufferedWriter out = new BufferedWriter(osw);

                        InputStream is = s.getInputStream();
                        InputStreamReader isr = new InputStreamReader(is);
                        BufferedReader in = new BufferedReader(isr);
                ) {
                    System.out.println("Клиент подключен.");

                    // Получение строки от клиента
                    int request = Integer.parseInt(in.readLine().trim()) ;
                    System.out.println("Запрос получен: " + request);

                    // Рандом от 1 до request
                    int number = (int) (Math.random() * request) + 1;

                    // Отправка ответа клиенту
                    out.write(String.valueOf(number));
                    out.newLine();
                    out.flush();

                } catch (Exception e) {
                    e.printStackTrace();
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
