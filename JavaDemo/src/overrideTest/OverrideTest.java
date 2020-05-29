package overrideTest;

abstract class OverrideTest {
	private String name;
	public OverrideTest(){
		System.out.println("默认调用了无参构造方法!");
	}
	public OverrideTest(String name) {
		yes(name);
	}
	public void yes(String name) {				//定义一个判断方法
		if(name=="你好")
		{
			this.name="你好";
			System.out.println(this.name);
		}
	}
}

