package actor;

public class Actor {
	private String name;
	
	public Actor() {
		
	}
	
	/*public Actor(String name) {
		setName(name);
	}*/
	public void performs() {
		System.out.println("00000");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}

	public Actor(String name) {
		this.name = name;
	}
	
	
	
	
	

}






