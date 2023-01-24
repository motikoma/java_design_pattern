package template_method;

public class Main {
    public static void main(String[] args) {
        // スーパークラスで処理の枠組みを定め、具体的な処理をサブクラスに任せる
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello, Japan.");
        d1.display();
        d2.display();
    }
}
