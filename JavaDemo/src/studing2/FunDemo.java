package studing2;

public class FunDemo {

	static StringBuilder a = new StringBuilder();
	static String b = "Hello";
	static String c = " China";
	public static void main(String[] args) {
		System.out.println(a);
		a.append(b);
		System.out.println(a);
		a.append(c);
		System.out.println(a);
		
		System.out.println(a.length());
		a.setCharAt(6, ',');
		System.out.println(a);
	}
}
