package mediator;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		Mediator mediator = new TourismInformationSystem();
		RarvelCompaniesSubsystem rc = new RarvelCompaniesSubsystem();
		HotelsSubsystem h = new HotelsSubsystem();
		RestaurantsSubsystem r = new RestaurantsSubsystem();
		AirportSubsystem a = new AirportSubsystem();
		TourismAttractionsSubsystem t = new TourismAttractionsSubsystem();
		
		ArrayList<Colleague> colleagues = new ArrayList<>();
		colleagues.add(rc);
		colleagues.add(r);
		colleagues.add(h);
		colleagues.add(a);
		colleagues.add(t);
		
		mediator.recruitColleagues(colleagues);
		
		r.knowSomethingNew("NEWS");
	}

}
