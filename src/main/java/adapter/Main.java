package adapter;

public class Main {
    public static void main(String[] args) {
        // 一皮被せて再利用
        PrintBanner banner = new PrintBanner("Hello");
        banner.printWeak();
        banner.printStrong();
    }
}
