package laba_03;

public class Book {
    private String publishing_house;
    private String author;
    private int number_of_pages;

    public Book(String publishing_house, String author, int number_of_pages) {
        this.publishing_house = publishing_house;
        this.author = author;
        this.number_of_pages = number_of_pages;
    }

    public Book() {
        this.publishing_house = "";
        this.author = "";
        this.number_of_pages = 0;
    }

    public Book(Book bk) {
        this.publishing_house = bk.publishing_house;
        this.author = bk.author;
        this.number_of_pages = bk.number_of_pages;
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

    public void name() {
        System.out.println("Book");
    }
}
