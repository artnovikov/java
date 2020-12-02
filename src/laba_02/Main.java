package laba_02;

import laba_01.Music;

public class Main {
    public static void main(String args[]) {
        Music m[] = new Music[4];
        m[0]= new Music("Eminem", "Godzilla", 1547820, true);
        m[1]= new Music("Eminem", "Lose yourself", 10000000, false);
        m[2]= new Music("Eminem", "Rap God", 1547820, true);
        m[3]= new Music("Dr. Dre", "Still Dre", 57200000, true);

        System.out.println("Количество проданных копий: " + Music.CountSoldCopies( m ));
        System.out.println("Количество произведений, которые можно скачать в интернете: " + Music.CountName( m ));
    }
}