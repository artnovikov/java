package laba_02_2;

public class Book {
    private String name;
    private String author;
    private int year_of_publisher;
    private int number_of_pages;
    private String ISBN;


    public Book(String name, String author, int year_of_publisher, int number_of_pages, String isbn) {
        // Спросить можно ли здесь обращаться к данным на прямую
        // или через методы
        this.name = name;
        this.author = author;
        this.year_of_publisher = year_of_publisher;
        this.number_of_pages = number_of_pages;
        this.ISBN = isbn;
    }

    public Book() {
        // Спросить можно ли здесь обращаться к данным на прямую
        // или через методы
        this.name = "";
        this.author = "";
        this.year_of_publisher = 0;
        this.number_of_pages = 0;
        this.ISBN = "";
    }

    public Book(Book b) {
        this.name = b.name;
        this.author = b.author;
        this.year_of_publisher = b.year_of_publisher;
        this.number_of_pages = b.number_of_pages;
        this.ISBN = b.ISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear_of_publisher() {
        return year_of_publisher;
    }

    public void setYear_of_publisher(int year_of_publisher) {
        this.year_of_publisher = year_of_publisher;
    }

    public int getNumber_of_pages() {
        return number_of_pages;
    }

    public void setNumber_of_pages(int number_of_pages) {
        this.number_of_pages = number_of_pages;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + this.getName() + "', " +
                "author='" + this.getAuthor() + "', " +
                "year_of_publisher=" + this.getYear_of_publisher() + ", " +
                "number_of_pages=" + this.getNumber_of_pages() + ", " +
                "number_of_pages=" + this.getISBN() +
                "}\n";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object != null || this.getClass() != object.getClass()) return false;
        Book b = (Book) object;
        return this.name == b.name &&
                this.author == b.author &&
                this.year_of_publisher == b.year_of_publisher &&
                this.number_of_pages == b.number_of_pages &&
                this.ISBN == b.ISBN;
    }

    @Override
    public int hashCode() {
        int hash = 96;
        hash = 19 * hash + this.name.hashCode();
        hash = 19 * hash + this.author.hashCode();
        hash = 19 * hash + this.year_of_publisher;
        hash = 19 * hash + this.number_of_pages;
        hash = 19 * hash + this.ISBN.hashCode();
        return hash;
    }
}
