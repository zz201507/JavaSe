package studing2;

public class Employee implements Comparable{

	@Override
	public int compareTo(Object o) {
		// TODO �Զ����ɵķ������
		return 0;
	}
	static Comparable x;
	public static void main(String[] args) {
		x = new Employee();
		x.compareTo(0);
		System.out.println(x instanceof Comparable);
	}

}
