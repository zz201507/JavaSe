package studing2;

public class lambdaTest {

    interface Demo{
        int run();
    }
    public static void main(String[] args) {
        Demo a;
        a = () -> {
            System.out.println("lambda test");
            return 0;
        };
        a.run();
    }
}
