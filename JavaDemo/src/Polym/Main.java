package Polym;

public class Main {
    public static void main(String[] args) {
        Master master = new Master();
        master.fun(new Cat());
        master.fun(new Pig());
        master.fun(new Dog());
    }
}
