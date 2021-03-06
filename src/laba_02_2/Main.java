package laba_02_2;

import laba_01.Music;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        Shop s = new Shop();

        s.addBook(new Book("Бойцовский клуб", "Чак Паланик", 2020, 288, "978-5-17-127312-5"));
        s.addBook(new Book("451° по Фаренгейту", "Рэй Брэдбери", 2019, 	256, "978-5-04-103614-0"));
        s.addBook(new Book("Алхимик", "Пауло Коэльо", 2020, 	224, "978-5-17-087921-2"));
        s.addBook(new Book("Гордость и предубеждение", "Джейн Остин", 2018, 	416, "978-5-389-05505-6"));
        s.addBook(new Book("Убить пересмешника", "Харпер Ли", 2017, 	416, "978-5-17-090411-2"));
        s.addBook(new Book("Маленький принц", "Антуан де Сент-Экзюпери", 2018, 	112, "978-5-699-90130-2"));
        s.addBook(new Book("Портрет Дориана Грея", "Оскар Уайльд", 2012, 	416, "978-5-389-04564-4"));
        s.addBook(new Book("Великий Гэтсби", "Фрэнсис Скотт Фицджеральд", 2011, 	256, "978-5-389-01995-9"));

        s.print();

        // Заменяем "Убить пересмешника" на "Дон Кихот"
        s.edit(new Book("Дон Кихот", "Мигель де Сервантес Сааведра", 	2013, 	608, "978-5-389-05374-8"));

        s.print();

        // Удаляем "Великий Гэтсби"
        s.delete(7);

        s.print();

        s.deleteAll();

        s.print();
    }
}
