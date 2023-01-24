package multiThread.bank;

public class Bank {
    private int money;
    private String name;

    public Bank(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public synchronized void deposit(int money) {
        this.money += money;
    }

    public synchronized boolean withdraw(int money) {
        if(this.money >= money){
            this.money = this.money - money;
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }
}
