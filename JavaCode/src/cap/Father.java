package cap;

public class Father {
    public void fun(){
        System.out.println("这是父类方法");
    }
    public static void main(String[] args) {
        Father f = new Father();
        Son s = (Son)f;
    }
}
