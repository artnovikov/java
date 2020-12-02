package laba_04_2;

import java.io.*;

public class FilE {
    static void write(String s) throws IOException {
        File file = new File("laba 4_2.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        fileWriter.append(s);
        fileWriter.flush();
        fileWriter.close();
    }

    static void read() throws IOException {
        File file = new File("laba 4_2.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);

        String s = reader.readLine();
        while (s != null){
            System.out.println(s);
            s = reader.readLine();
        }
        fileReader.close();
    }
}
