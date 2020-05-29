package studing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		a.add("a");
		a.add("1");
		a.add("b");
		a.add("2");
		for(String b:a)
			System.out.println(b);
		Collections.sort(a);
		for(String b:a)
			System.out.println(b);
		Collections.reverse(a);
		for(String b:a)
			System.out.println(b);

	/*private T x;
	private T y;
	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public T getY() {
		return y;
	}
	public void setY(T y) {
		this.y = y;
	}
	public static void main(String[] args) {
		ArrayListTest<String> P = new ArrayListTest<String>();
		P.setX("’≈’‹");
		System.out.println(P.getX());*/
	}
	
	
	/*static ArrayList<String> staff = new ArrayList<String>();
	static ArrayList<Integer> staff1 = new ArrayList<Integer>();
	public static void main(String[] args) {
		staff.add("123");
		staff.add("132");
		System.out.println(staff);
		staff.add(0,"789");
		System.out.println(staff);
		staff.remove(0);
		System.out.println(staff);
		staff.remove(1);
		System.out.println(staff);
		
	}*/
}