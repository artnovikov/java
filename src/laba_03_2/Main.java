package laba_03_2;

public class Main {
    public static void main(String args[]) {
        System.out.println("--------------------------------------------------");

        Scientific s = new Scientific("Краткая история времени", "Bantam Books", "Стивен Уильям Хокинг", 231, "Наука", 1);
        s.name();
        s.print();

        System.out.println("--------------------------------------------------");

        Handbook h = new Handbook("Французский язык. Краткий справочник по грамматике", "ГИС", "Елена Рощупкина", 	240);
        h.name();
        h.print();

        Poem p = new Poem("Сергей Есенин. Стихотворения", "Эксмо", "Сергей Есенин", 352);

        System.out.println("--------------------------------------------------");

        Novel n = new Novel("Евгений Онегин", "Азбука", "Александр Пушкин", 448, "Роман");
        n.name();
        n.print();

        System.out.println("--------------------------------------------------");
    }
}
