package studing;

public class Son1 extends Father{
	public void fun() {
		System.out.println("ÖØÐ´¸¸Ààº¯Êý1");
	}
	public  Son1(){
		super("aaa");
	}
	public  Son1(String name){
		this();
		System.out.println(name);
	}
	public static void main(String[] args) {
		Son1 s = new Son1("aaa");
	}
}
