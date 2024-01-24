package strategy;

public class CloudComputingPlatform {
	
	private Strategy strategy;
	
	public CloudComputingPlatform(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void vmMigration() {
		strategy.migration();
	}

}
