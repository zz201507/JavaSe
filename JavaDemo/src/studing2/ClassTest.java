package studing2;

public abstract class ClassTest {
    public void fun() {
        System.out.println("123");
    }
    static ClassTest a = new ClassTest() {
        @Override
        public void fun() {
            System.out.println("456");
        }
    };

    public static void main(String[] args) {
        a.fun();
    }
}
