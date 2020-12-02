/**
 * Версия 2.0.0
 * * Методы:
 *   - Подсчитать общее количество проданных копий.
 *   - Подсчитать количество произведений, которые можно скачать в интернете.
 *
 * Версия 1.0.0
 * * Данные:
 *   - название произведения.
 *   - количество проданных копий.
 *   - возможность скачать mp3 в интернете.
 *
 * * Методы:
 *   - конструктор без параметров.
 *   - конструктор с неполным рабором параметров.
 *   - конструктор с параметрами.
 *   - конструктор копирования.
 *   - сеттеры.
 *   - геттеры.
 *   - методы вывода информации на экран.
 * */
package laba_01;

import java.util.Objects;

public class Music {
    // Название произведения.
    private String name;

    private String name_of_author;
    // Количество проданных копий.
    private int count_of_sold_copies;
    // Возможность скачать mp3 в интернете.
    private boolean enabled_to_downoad;

    // Конструктор без параметров.
    public Music() {
        this.name = "";
        this.name_of_author = "";
        this.count_of_sold_copies = 0;
        this.enabled_to_downoad = false;
    }

    // Конструктор с неполным рабором параметров.
    public Music( String n_o_a, String n ) {
        this.name = n;
        this.name_of_author = n_o_a;
    }

    // Конструктор с параметрами.
    public Music( String n_o_a, String n, int c, boolean e ) {
        this.name = n;
        this.name_of_author = n_o_a;
        this.count_of_sold_copies = c;
        this.enabled_to_downoad = e;
    }

    // Конструктор копирования.
    public Music( Music m ) {
        this.name = m.name;
        this.name_of_author = m.name_of_author;
        this.count_of_sold_copies = m.count_of_sold_copies;
        this.enabled_to_downoad = m.enabled_to_downoad;
    }

    // Сеттеры.
    public void setName(String n) { this.name = n; };
    public void setNameOfAuthor(String n_o_a) { this.name = n_o_a; };
    public void setCountOfSoldCopies(int c) { this.count_of_sold_copies = c; };
    public void setEnabledToDownload(boolean e) { this.enabled_to_downoad = e; };

    // Геттеры.
    public String getName() { return this.name; }
    public String getNameOfAuthor() { return this.name_of_author; }
    public int getCountOfSoldCopies() { return this.count_of_sold_copies; }
    public boolean getEnabledToDownload() { return this.enabled_to_downoad; }

    // Методы вывода информации на экран.
    public void printName() { System.out.println( "Название произведения: " + this.getName() ); }
    public void printNameOfAuthor() { System.out.println( "Имя исполнителя: " + this.getNameOfAuthor() ); }
    public void printCountOfSoldCopies() { System.out.println( "Количество проданных копий: " + this.getCountOfSoldCopies() ); }
    public void printEnabledToDownload() { System.out.println( "Возможность скачать mp3 в интернете: " + this.getEnabledToDownload() ); }

    // Подсчитать общее количество проданных копий.
    public static int CountSoldCopies( Music m[] ) {
        int count = 0;
        for ( int i = 0; i < m.length; i++ )
            count += m[i].count_of_sold_copies;
        return count;
    }

    // Подсчитать количество произведений, которые можно скачать в интернете.
    public static int CountName( Music m[] ) {
        int count = 0;
        for ( int i = 0; i < m.length; i++ )
            if ( m[i].enabled_to_downoad == true )
                count++;
        return count;
    }
}
