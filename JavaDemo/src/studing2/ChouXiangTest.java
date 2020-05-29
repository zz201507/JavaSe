package studing2;

public abstract class ChouXiangTest {
	private String name;
	private String num;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public abstract int fun(int a);

}
