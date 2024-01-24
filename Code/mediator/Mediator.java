package mediator;

import java.util.ArrayList;

public interface Mediator {
	
	public abstract void recruitColleagues(ArrayList<Colleague> colleagueList);
	public abstract void colleagueChanged(String info);

}
