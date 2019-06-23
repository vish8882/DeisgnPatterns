package pattern.observer.subject;

import java.util.*;

import pattern.observer.observer.Observer;

public class WeatherObject implements Subject{
	int humidity;
	int temperature;
	
	List<Observer> observerList =  new LinkedList<Observer>();
	@Override
	public void addObserver(Observer observer) {
		observerList.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observerList.remove(observer);
	}

	@Override
	public void notifyObserver() {
		for(Observer observer : observerList)
			observer.update(temperature, humidity);
	}
	
	public void setMeasureMents(int temp, int humidity){
		this.humidity=humidity;
		this.temperature=temp;
		notifyObserver();
	}

}
