package laba_03;

public class Scientific extends Book {
    private String name;
    private String subject_matter; // тематика
    private int complexity; // сложность

    public Scientific(String publishing_house, String author, int number_of_pages, String name, String subject_matter, int complexity) {
        super(publishing_house, author, number_of_pages);
        this.name = name;
        this.subject_matter = subject_matter;
        this.complexity = complexity;
    }

    public Scientific() {
        super();
        this.name = "";
        this.subject_matter = "";
        this.complexity = 0;
    }

    public Scientific(Scientific s) {
        super(s.getPublishing_house(), s.getAuthor(), s.getNumber_of_pages());
        this.name = s.getName();
        this.subject_matter = s.getSubject_matter();
        this.complexity = s.getComplexity();
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
