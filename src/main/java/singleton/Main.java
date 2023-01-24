package singleton;

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        if (s1 == s2) {
            System.out.println("Singleton works, both variables contain the same instance.");
        } else {
            System.out.println("Singleton failed, variables contain different instances.");
        }
    }
}
