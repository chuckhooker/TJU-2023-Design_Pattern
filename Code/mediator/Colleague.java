package mediator;

public interface Colleague {

	public void setMediator(Mediator mediator);
	public void knowSomethingNew(String info);
	public void knowSomethingFromOthers(String info);

}
