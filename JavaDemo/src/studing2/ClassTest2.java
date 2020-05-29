package studing2;

public class ClassTest2 extends ClassTest {
   static ClassTest c = new ClassTest(){
        @Override
        public void fun() {
            super.fun();
        }
    };
    public static void main(String[] args) {
       c.fun();
    }
}
