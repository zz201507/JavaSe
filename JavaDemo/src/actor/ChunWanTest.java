package actor;

public class ChunWanTest {
	public static void main(String[] args) {
		Director ÕÅÒÕÄ±=new Director();
		
		
		Actor ËÎ×æÓ¢=new Singer("ËÎ×æÓ¢");

		Actor ÑîÀöÆ¼=new Dancer("ÑîÀöÆ¼");
		
		//ËÎ×æÓ¢.performs();
		
		ÕÅÒÕÄ±.action(ËÎ×æÓ¢);
		
		ÕÅÒÕÄ±.action(ÑîÀöÆ¼);
	}

}
