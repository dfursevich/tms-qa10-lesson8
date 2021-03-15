package classwork.button;

public class Button {
//    private String color;
//    private int height;

    private ClickHandler clickHandler;

    public Button(ClickHandler clickHandler) {
        this.clickHandler = clickHandler;
    }

    public void click() {
        clickHandler.onClick();
    }
}
