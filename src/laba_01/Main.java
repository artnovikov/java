/**
 * Создать класс Music (музыкальное произведение):
 * - название произведения.
 * - количество проданных копий.
 * - возможность скачать mp3 в интернете.
 *
 * Создать класс WriterInfo, выводящий на экран монитора...
 * соответствующую информацию о классе (используя уже созданные методы класса Music).
 * */

package laba_01;

public class Main {
    public static void main(String args[]) {
        WriterInfo.print(new Music());
        WriterInfo.print(new Music("Eminem", "Godzilla", 177121000, true));
    }
}
