package mediator;

public class AirportSubsystem implements Colleague{
	private Mediator mediator;
	
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public void knowSomethingNew(String info) {
		mediator.colleagueChanged(info);
	}
	
	public void knowSomethingFromOthers(String info) {
		System.out.println("AirportSubsystem know " + info + " from others.");
	}

}
