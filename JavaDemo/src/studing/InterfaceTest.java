package studing;

public interface InterfaceTest {
    default void fun(){
        System.out.println("123");
    }
    static void fun1(){
        System.out.println("456");
    }
}
