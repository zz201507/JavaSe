package actor;

public class ChunWanTest {
	public static void main(String[] args) {
		Director ����ı=new Director();
		
		
		Actor ����Ӣ=new Singer("����Ӣ");

		Actor ����Ƽ=new Dancer("����Ƽ");
		
		//����Ӣ.performs();
		
		����ı.action(����Ӣ);
		
		����ı.action(����Ƽ);
	}

}
