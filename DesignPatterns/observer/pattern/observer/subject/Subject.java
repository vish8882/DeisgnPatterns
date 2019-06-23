package pattern.observer.subject;

import pattern.observer.observer.Observer;

public interface Subject {
	public void addObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObserver();
}
