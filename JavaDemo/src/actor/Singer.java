package actor;

public class Singer extends Actor {
	public Singer() {
		super();
	}
	public Singer(String name) {
		super(name);
	}
	public void performs() {
		System.out.println("�質��Ա"+getName()+"���ڱ��ݸ質��Ŀ�������һ�ʢ���ĵط���");
	}
}
