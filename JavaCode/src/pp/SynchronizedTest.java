package pp;

public class SynchronizedTest {
    public static synchronized void methodC() {
        for (int i = 0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void methodD(){
        synchronized(SynchronizedTest.class){
            for (int i = 0;i<10;i++){
                System.out.println(Thread.currentThread().getName()+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
    static SynchronizedTest s1 = new SynchronizedTest();
    static SynchronizedTest s2 = new SynchronizedTest();

    public synchronized void fun(){
        for (int i = 0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void fun1(){
        for (int i = 0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"fun1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void fun2(){
        synchronized (this){
            for (int i = 0;i<10;i++){
                System.out.println(Thread.currentThread().getName()+"fun2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                s2.methodD();
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                s1.methodD();
            }
        };
        t1.setName("线程1:");
        t2.setName("线程2:");
        t1.start();
        t2.start();
    }
}
