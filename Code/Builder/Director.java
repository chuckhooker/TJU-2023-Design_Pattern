package Builder;

public class Director {
	
	private AbstractVehicleBuilder vehicleBuilder;
	private Vehicle vehicle = new Vehicle();
	
	public Director(AbstractVehicleBuilder vehicleBuilder) {
		this.vehicleBuilder = vehicleBuilder;
	}
	
	public void construct() {
		vehicle.setBody(vehicleBuilder.makeBody());
		vehicle.setEngine(vehicleBuilder.makeEngine());
		vehicle.setTire(vehicleBuilder.makeTire());
		vehicle.setGearbox(vehicleBuilder.makeGearbox());
		
		System.out.println("The construction of this vehicle is " + vehicle.getBody() + " " + vehicle.getEngine() + " " + vehicle.getTire() + " " + vehicle.getGearbox());
	}

}
