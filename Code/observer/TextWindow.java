package observer;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class TextWindow {
	
	private ArrayList<Observer> observers = new ArrayList<>();
	
	public void addObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void deleteObserver(Observer observer) {
		observers.remove(observer);
	}

	public void notifyObservers() {
		Iterator it = observers.iterator();
		while(it.hasNext()) {
			Observer observer = (Observer)it.next();
			observer.update(this);
		}
	}
	
	public abstract void countNumber();
	public abstract void countAppearance();
	public abstract void countFrequency();
}
