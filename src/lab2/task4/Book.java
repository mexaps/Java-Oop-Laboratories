package lab2.task4;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    Book st=new Book("titlu", "autor","an")
    public String toString() {
        System.out.println(st);
        return null;
    }
}