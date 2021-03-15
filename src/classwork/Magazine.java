package classwork;

public class Magazine implements Printable {
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("Print some content of magazine");
    }
}
