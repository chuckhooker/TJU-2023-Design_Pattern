package mediator;

public class TourismAttractionsSubsystem implements Colleague{
	
	private Mediator mediator;
	
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public void knowSomethingNew(String info) {
		mediator.colleagueChanged(info);
	}
	
	public void knowSomethingFromOthers(String info) {
		System.out.println("TourismAttractionsSubsystem know " + info + " from others.");
	}

}
