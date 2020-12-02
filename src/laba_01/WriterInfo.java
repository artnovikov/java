package laba_01;

public class WriterInfo {
    public static void print(Music m) {
        m.printNameOfAuthor();
        m.printName();
        m.printCountOfSoldCopies();
        m.printEnabledToDownload();
        System.out.println("------------------------------------------");
    }
}
