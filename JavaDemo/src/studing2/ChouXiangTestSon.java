package studing2;

public class ChouXiangTestSon extends ChouXiangTest {
	public static void main(String[] args) {
		 ChouXiangTestSon P = new ChouXiangTestSon();
		 P.setName("’≈’‹");
		 P.setNum("19");
		 System.out.println(P.getName());
		 System.out.println(P.getNum());
		 P.fun(3);
	}

	@Override
	public int fun(int a) {
		System.out.println(a);
		return a;
	}
}
