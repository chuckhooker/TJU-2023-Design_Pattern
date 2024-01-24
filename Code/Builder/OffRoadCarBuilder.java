package Builder;

public class OffRoadCarBuilder extends AbstractVehicleBuilder{

	@Override
	public String makeBody() {
		return "OffRoadCar Boby";
	}

	@Override
	public String makeEngine() {
		return "OffRoadCar Engine";
	}

	@Override
	public String makeTire() {
		return "OffRoadCar Tire";
	}

	@Override
	public String makeGearbox() {
		return "OffRoadCar Gearbox";
	}

}
