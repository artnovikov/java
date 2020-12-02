package laba_03_2;

public abstract class Fiction implements Object, Book {
    private String name;
    private String publishing_house; // Издательство
    private String author; // Автор
    private int number_of_pages; // Количество страниц
    private String genre; // жанр

    protected Fiction(String name, String publishing_house, String author, int number_of_pages, String genre) {
        this.name = name;
        this.publishing_house = publishing_house;
        this.author = author;
        this.number_of_pages = number_of_pages;
        this.genre = genre;
    }

    protected Fiction(String name, String publishing_house, String author, int number_of_pages) {
        this.name = name;
        this.publishing_house = publishing_house;
        this.author = author;
        this.number_of_pages = number_of_pages;
    }

    protected Fiction() {
        this.name = "";
        this.publishing_house = "";
        this.author = "";
        this.number_of_pages = 0;
        this.genre = "";
    }

    protected Fiction(Fiction f) {
        this.name = f.getName();
        this.publishing_house = f.getPublishing_house();
        this.author = f.getAuthor();
        this.number_of_pages = f.getNumber_of_pages();
        this.genre = f.getGenre();
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
