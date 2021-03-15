package classwork;

public class Runner {
    public static void main(String[] args) {
        Printable book1 = new Book("Harry Potter", "J.R.", "Text of the book");
        book1.print();
        System.out.println("Author: " + ((Book) book1).getAuthor());

        Book book2 = new Book("The lord of the ring", "Tolkien", "Text of the book2");
        System.out.println(book2.contains("the"));

        Printable magazine = new Magazine("Maxim");
        magazine.print();

        if (magazine instanceof Book) {
            System.out.println("Author: " + ((Book) magazine).getAuthor());
        }

        Printable[] printables = new Printable[] { book1, book2, magazine};
        for (int i = 0; i < printables.length; i++) {
            Printable printable = printables[i];
            printable.print();
        }
    }
}
