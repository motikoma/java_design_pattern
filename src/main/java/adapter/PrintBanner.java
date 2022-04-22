package adapter;

public class PrintBanner implements Print {
    private Banner banner;

    public PrintBanner(String text) {
        this.banner = new Banner(text);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
