package overrideTest;

public class OverrideTest2 extends OverrideTest {
	public String name;
	public OverrideTest2(String name) {
		super(name);
		if(name=="���") {
			this.name="����";
			System.out.println(this.name);
		}
	}
}
