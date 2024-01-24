package mediator;

import java.util.ArrayList;

public class TourismInformationSystem implements Mediator{
	
	private ArrayList<Colleague> colleagueList;

	@Override
	public void recruitColleagues(ArrayList<Colleague> colleagueList) {
		this.colleagueList = colleagueList;
		for(Colleague colleague: colleagueList) {
			colleague.setMediator(this);
		}
		
	}

	@Override
	public void colleagueChanged(String info) {
		
		for(Colleague colleague: colleagueList) {
			colleague.knowSomethingFromOthers(info);
		}	
	}

}
