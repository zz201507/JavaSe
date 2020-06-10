package studing2;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                setName("线程一");
                for (int i = 0; i <100 ; i++) {
                    System.out.println(getName()+":"+i);
                }
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                setName("线程二");
                for (int i = 0; i <100 ; i++) {
                    System.out.println(getName()+":"+i);
                }
            }
        };
        t1.start();
        t1.join(10);
        t2.start();
        for (int i = 0; i <100 ; i++) {
            System.out.println("主线程"+":"+i);
        }
    }
}
