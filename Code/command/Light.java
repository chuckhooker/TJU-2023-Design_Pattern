package command;

public class Light {
	
	private String name;
	private boolean state = false;
	
	public Light(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public boolean getState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}
	
	public void display() {
		if(state) {
			System.out.println("Light " + name + "is ON");
		}
		else {
			System.out.println("Light " + name + "is OFF");
		}
	}

}
