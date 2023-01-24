package singleton;

public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton() {
        System.out.println("Singletonのインスタンスを生成しました");
    }

    public static Singleton getInstance(){
        return new Singleton();
    }
}
