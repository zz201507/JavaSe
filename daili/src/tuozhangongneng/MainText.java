package tuozhangongneng;

import java.lang.reflect.Proxy;

public class MainText {
    public static void main(String[] args) {
        OtherPeople otherPeople = new OtherPeople();
        MyHandler myHandler = new MyHandler(otherPeople);
        Fun fun = (Fun)Proxy.newProxyInstance(
                otherPeople.getClass().getClassLoader(),
                otherPeople.getClass().getInterfaces(),
                myHandler
        );
        System.out.println(otherPeople.getClass().getInterfaces()[0].getName());
        fun.fun();
    }
}
