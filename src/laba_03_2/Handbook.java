package laba_03_2;

public class Handbook implements Object, Book {
    private String name;
    private String publishing_house; // Издательство
    private String author; // Автор
    private int number_of_pages; // Количество страниц

    public Handbook(String name, String publishing_house, String author, int number_of_pages) {
        this.name = name;
        this.publishing_house = publishing_house;
        this.author = author;
        this.number_of_pages = number_of_pages;
    }

    public Handbook() {
        this.name = "";
        this.publishing_house = "";
        this.author = "";
        this.number_of_pages = 0;
    }

    public Handbook(Handbook h) {
        this.name = h.getName();
        this.publishing_house = h.getPublishing_house();
        this.author = h.getAuthor();
        this.number_of_pages = h.getNumber_of_pages();
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublishing_house() {
        return publishing_house;
    }

    public void setPublishing_house(String publishing_house) {
        this.publishing_house = publishing_house;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumber_of_pages() {
        return number_of_pages;
    }

    public void setNumber_of_pages(int number_of_pages) {
        this.number_of_pages = number_of_pages;
    }
}
