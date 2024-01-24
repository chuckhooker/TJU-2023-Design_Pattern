package Builder;

public class TruckBuilder extends AbstractVehicleBuilder{

	@Override
	public String makeBody() {
		return "Truck Boby";
	}

	@Override
	public String makeEngine() {
		return "Truck Engine";
	}

	@Override
	public String makeTire() {
		return "Truck Tire";
	}

	@Override
	public String makeGearbox() {
		return "Truck Gearbox";
	}
}
