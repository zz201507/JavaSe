package overrideTest;

abstract class OverrideTest {
	private String name;
	public OverrideTest(){
		System.out.println("Ĭ�ϵ������޲ι��췽��!");
	}
	public OverrideTest(String name) {
		yes(name);
	}
	public void yes(String name) {				//����һ���жϷ���
		if(name=="���")
		{
			this.name="���";
			System.out.println(this.name);
		}
	}
}

