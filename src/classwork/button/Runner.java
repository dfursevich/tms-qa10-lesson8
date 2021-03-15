package classwork.button;

public class Runner {
    public static void main(String[] args) {
        ClickHandler clickHandler = new OrderBook();

        Button button = new Button(clickHandler);

        button.click();
    }
}
