package studing;

public class Father {
	public Father() {
		System.out.println("父类无参构造方法");
	}
	public Father(String name) {
		System.out.println("父类有参数构造方法");
	}
	public void fun() {
		System.out.println("父类自定义函数1");
	}
	/*public static void main(String[] args) {
		new Father();
		new Father("你好");
	}*/
//	public Father() {
//		System.out.println("父类构造方法1");
//	}
//	public void print() {
//		System.out.println("父类方法1");
//	}
//	public void can() {
//		System.out.println("父类方法2");
//	}
}
