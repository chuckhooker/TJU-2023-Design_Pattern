package Builder;

public class F1Builder extends AbstractVehicleBuilder{

	@Override
	public String makeBody() {
		return "F1 Boby";
	}

	@Override
	public String makeEngine() {
		return "F1 Engine";
	}

	@Override
	public String makeTire() {
		return "F1 Tire";
	}

	@Override
	public String makeGearbox() {
		return "F1 Gearbox";
	}

}
