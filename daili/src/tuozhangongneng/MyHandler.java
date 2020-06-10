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
        Integer integer = (Integer) method.invoke(target,args); //执行了其他人写的方法

        System.out.println("我拓展了其他人的方法");

        return integer;
    }
}
