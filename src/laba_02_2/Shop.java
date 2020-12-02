package laba_02_2;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Book> b;

    public Shop() {
        this.b = new ArrayList<Book>();
    }

    public void addBook(Book b) {
        this.b.add(b);
    }

    public void print() {
        System.out.println("----------------------------------------------------------");
        if (this.b.isEmpty()) System.out.println("Список пуст!");
        else {
            for(int i = 0; i< b.size(); i++) {
                System.out.println(b.get(i));
            }
        }
    }

    public void edit(Book bk) {
        this.b.set(4, bk);
    }

    public void delete(int a) {
        this.b.remove(a);
    }

    public void deleteAll() {
        this.b.clear();
    }
}
