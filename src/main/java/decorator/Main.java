package decorator;

public class Main {
    public static void main(String[] args) {
        Display display = new StringDisplay("Hello, world.");
        Display display2 = new SideBorder(display, '#');

        display.show();
        display2.show();
    }
}
