package laba_03;

public class Fiction extends Book {
    private String name;
    private String genre; // жанр

    public Fiction(String publishing_house, String author, int number_of_pages, String name, String genre) {
        super(publishing_house, author, number_of_pages);
        this.name = name;
        this.genre = genre;
    }

    public Fiction() {
        super();
        this.name = "";
        this.genre = "";
    }

    public Fiction(Fiction f) {
        super(f.getPublishing_house(), f.getAuthor(), f.getNumber_of_pages());
        this.name = f.getName();
        this.genre = f.getGenre();
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

    @Override
    public void name() {
        System.out.println(this.getName());
    }
}
