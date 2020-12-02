package laba_03_2;

public class Scientific implements Object, Book {
    private String name;
    private String publishing_house; // Издательство
    private String author; // Автор
    private int number_of_pages; // Количество страниц
    private String subject_matter; // Тематика
    private int complexity; // Сложность

    public Scientific(String name, String publishing_house, String author, int number_of_pages, String subject_matter, int complexity) {
        this.name = name;
        this.publishing_house = publishing_house;
        this.author = author;
        this.number_of_pages = number_of_pages;
        this.subject_matter = subject_matter;
        this.complexity = complexity;
    }

    public Scientific() {
        this.name = "";
        this.publishing_house = "";
        this.author = "";
        this.number_of_pages = 0;
        this.subject_matter = "";
        this.complexity = 0;
    }

    public Scientific(Scientific s) {
        this.name = s.getName();
        this.publishing_house = s.getPublishing_house();
        this.author = s.getAuthor();
        this.number_of_pages = s.getNumber_of_pages();
        this.subject_matter = s.getSubject_matter();
        this.complexity = s.getComplexity();
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

    public String getSubject_matter() {
        return subject_matter;
    }

    public void setSubject_matter(String subject_matter) {
        this.subject_matter = subject_matter;
    }

    public int getComplexity() {
        return complexity;
    }

    public void setComplexity(int complexity) {
        this.complexity = complexity;
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
        System.out.println("Тематика: " + this.getSubject_matter());
        System.out.println("Сложность: " + this.getComplexity());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
