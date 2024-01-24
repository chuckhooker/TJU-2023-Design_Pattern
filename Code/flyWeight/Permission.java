package flyWeight;


public class Permission {
	
	private String name;
	
	public Permission(String name) {
		this.name = name;
		System.out.println("Creating Permission ***" + name + "***");
	}
	
	public void Display() {
		System.out.println("The Permission is " + name);
	}

}
