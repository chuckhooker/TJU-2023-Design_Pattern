package Builder;

public class Main {
	
	public static void main(String[] args) {
		AbstractVehicleBuilder vehicleBuilder1 = new F1Builder();
		AbstractVehicleBuilder vehicleBuilder2 = new TruckBuilder();
		
		Director director1 = new Director(vehicleBuilder1);
		Director director2 = new Director(vehicleBuilder2);
		
		director1.construct();
		director2.construct();

	}

}
