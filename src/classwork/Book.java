package classwork;

public class Book implements BookPrintable, Searchable {
    private String name;
    private String author;
    private String content;

    public Book(String name, String author, String content) {
        this.name = name;
        this.author = author;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    @Override
    public void print() {
        System.out.println("Content of book is: " + content);
    }

    @Override
    public boolean contains(String text) {
        return content.contains(text);
    }

    @Override
    public void printTitle() {
        System.out.println("name = " + name);
    }
}
