package observer;

public class AppearanceObserver implements Observer{

	@Override
	public void update(TextWindow window) {
		window.countAppearance();
		System.out.println("");
		
	}

}
