package cap;

public class Father {
    public void fun(){
        System.out.println("���Ǹ��෽��");
    }
    public static void main(String[] args) {
        Father f = new Father();
        Son s = (Son)f;
    }
}
