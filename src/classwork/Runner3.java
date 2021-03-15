package classwork;

public class Runner3 {
    public static void main(String[] args) {
        Object book1 = new Book("Harry Potter", "J.R.", "Text of the book", Genre.FICTION);
        Object book2 = new Book("The lord of the ring", "Tolkien", "Text of the book2", Genre.DOCUMENTARY);
        
        System.out.println("book1.toString() = " + book1.toString());
        System.out.println("book1.hashCode() = " + book1.hashCode());
        System.out.println("book1.equals(book2) = " + book1.equals(book2));
        System.out.println("book1.getClass() = " + book1.getClass());
    }
}
