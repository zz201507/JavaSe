package studing2;

public abstract class Father {
    public Father(){
        System.out.println("抽象父类构造方法");
    }
    public Father(String name){
        System.out.println(name);
    }
    public abstract void fun();
}
