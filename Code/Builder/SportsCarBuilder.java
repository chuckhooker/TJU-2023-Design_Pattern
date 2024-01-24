package Builder;

public class SportsCarBuilder extends AbstractVehicleBuilder{

	@Override
	public String makeBody() {
		return "SportsCar Boby";
	}

	@Override
	public String makeEngine() {
		return "SportsCar Engine";
	}

	@Override
	public String makeTire() {
		return "SportsCar Tire";
	}

	@Override
	public String makeGearbox() {
		return "SportsCar Gearbox";
	}
}
