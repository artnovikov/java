package laba_03_2;

public class Novel extends Fiction {

    public Novel(String name, String publishing_house, String author, int number_of_pages, String genre) {
        super(name, publishing_house, author, number_of_pages, genre);
    }

    public Novel() {
        super();
    }

    public Novel(Novel n) {
        super(n);
    }

    @Override
    public void name() {
        System.out.println(this.getName());
    }

    @Override
    public void print() {
        System.out.println("Издательство: " + this.getPublishing_house());
        System.out.println("Автор: " + this.getAuthor());
        System.out.println("Страниц: " + this.getNumber_of_pages());
        System.out.println("Жанр: " + this.getGenre());
    }
}
