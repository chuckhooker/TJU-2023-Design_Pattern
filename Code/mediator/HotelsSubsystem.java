package mediator;

public class HotelsSubsystem implements Colleague{
	
	private Mediator mediator;
	
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public void knowSomethingNew(String info) {
		mediator.colleagueChanged(info);
	}
	
	public void knowSomethingFromOthers(String info) {
		System.out.println("HotelsSubsystem know " + info + " from others.");
	}

}
