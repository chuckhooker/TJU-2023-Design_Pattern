package command;

public class LightCommand implements Command{
	
	private Light light;
	private String name;
	
	public LightCommand(String name) {
		this.name = name;
	}
	
	@Override
	public void setLight(Light light) {
		this.light = light;
		System.out.println("Command " + name + " controls Light " + light.getName());
	}

	@Override
	public void execute() {
		boolean s = light.getState();
		s = !s;
		light.setState(s);
		
	}

}
