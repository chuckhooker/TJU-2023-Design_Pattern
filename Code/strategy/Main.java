package strategy;

public class Main {
	
	public static void main(String[] args) {
		CloudComputingPlatform p1 = new CloudComputingPlatform(new PreCopyStrategy());
		CloudComputingPlatform p2 = new CloudComputingPlatform(new PostCopyStrategy());
		CloudComputingPlatform p3 = new CloudComputingPlatform(new CRRTMotionStrategy());
		
		p1.vmMigration();
		p2.vmMigration();
		p3.vmMigration();
	}

}
