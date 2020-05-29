package studing;

public class Sub extends Demo15 {
    public int getLength() {
        return 5;
    }
    public static void main(String[] args) {
        Demo15 demo15 = new Demo15();
        Demo15 sub = new Sub();
        System.out.println(demo15.getLength() + "," + sub.getLength());
    }
}
