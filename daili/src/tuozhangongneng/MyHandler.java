package tuozhangongneng;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHandler implements InvocationHandler {
    private Object target = null;

    public MyHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Integer integer = (Integer) method.invoke(target,args); //ִ����������д�ķ���

        System.out.println("����չ�������˵ķ���");

        return integer;
    }
}
