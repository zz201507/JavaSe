package callback;

public class Manager implements Matter{

    @Override
    public void doSomething() {
        System.out.println("你去打印一份报表");
    }
}
