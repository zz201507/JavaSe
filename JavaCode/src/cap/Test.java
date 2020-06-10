package cap;

public class Test {
    public static void main(String[] args) throws Niko{
        System.out.println("123");
            throw new Niko("这是一个自定义异常");
    }
}
