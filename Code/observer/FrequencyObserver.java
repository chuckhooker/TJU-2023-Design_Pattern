package observer;

public class FrequencyObserver implements Observer{

	@Override
	public void update(TextWindow window) {
		window.countFrequency();
		System.out.println("");
		
	}

}
