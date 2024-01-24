package Singleton.hungryman;

public class VirtualUserGenerator {
	
	private static VirtualUserGenerator virtualUserGenerator = new VirtualUserGenerator();
	
	private VirtualUserGenerator() {
		System.out.println("One VirtualUserGenerator has been generated");
	}
	
	public static VirtualUserGenerator getInstance() {
		return virtualUserGenerator;
	}

}
