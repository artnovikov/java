package laba_03_2;

public class Poem extends Fiction {

    public Poem(String name, String publishing_house, String author, int number_of_pages) {
        super(name, publishing_house, author, number_of_pages);
    }

    public Poem() {
        super();
    }

    public Poem(Poem p) {
        super(p);
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
    }
}
