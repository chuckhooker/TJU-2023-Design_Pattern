package mediator;

public class RestaurantsSubsystem implements Colleague{
	
	private Mediator mediator;
	
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public void knowSomethingNew(String info) {
		mediator.colleagueChanged(info);
	}
	
	public void knowSomethingFromOthers(String info) {
		System.out.println("RestaurantsSubsystem know " + info + " from others.");
	}

}
