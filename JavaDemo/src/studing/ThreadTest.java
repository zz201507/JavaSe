package studing;

public class ThreadTest {

    public static void main(String[] args) {
        Runnable r1 = ()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("123");
        };
        Runnable r2 = ()->{
            System.out.println("465");
        };
        new Thread(r1).start();
        new Thread(r2).start();
    }
}
