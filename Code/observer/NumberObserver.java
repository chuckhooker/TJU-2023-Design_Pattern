package observer;

public class NumberObserver implements Observer{

	@Override
	public void update(TextWindow window) {
		window.countNumber();
		System.out.println("");
		
	}

}
