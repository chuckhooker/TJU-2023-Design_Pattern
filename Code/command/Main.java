package command;

public class Main {
	
	public static void main(String[] args) {
		Command c1 = new LightCommand("c1");
		Command c2 = new LightCommand("c2");
		Command c3 = new LightCommand("c3");
		
		Light l1 = new Light("l1");
		Light l2 = new Light("l2");
		Light l3 = new Light("l3");
		
		c1.setLight(l1);
		c2.setLight(l2);
		c3.setLight(l3);
		
		c1.execute();
		
		l1.display();
		l2.display();
		l3.display();
	}

}
