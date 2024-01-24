package observer;

public class Main {
	
	public static void main(String[] args) {
		TextWindow window = new TextExitWindow("this is a text window of text");
		window.addObserver(new NumberObserver());
		window.addObserver(new AppearanceObserver());
		window.addObserver(new FrequencyObserver());
		window.notifyObservers();
	}

}
