package studing;

public class Add {
	static int num1=1,num2=0,num3;
	public static void main(String[] args) {
		try {
			num3=num1/num2;
		}catch (Exception e) {
			System.err.println(e.getMessage());
			num3=num1+num2;
			System.out.println(num3);
		}

	}

}