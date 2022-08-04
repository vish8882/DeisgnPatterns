package pattern.observer.observer;

import pattern.observer.subject.Subject;

public class CurrentCondition implements Observer{
	int temp;
	int humidity;
	Subject sub;
	public CurrentCondition(Subject sub) {
		this.sub=sub;
		sub.addObserver(this);
	}
	@Override
	public void update(int temp, int humidity) {
		this.temp=temp;
		this.humidity=humidity;
		display();
	}
	
	public void display(){
		System.out.print("Current Condition is: ");
		System.out.print("Temp = "+this.temp);
		System.out.println(", Humidity = "+this.humidity);
	}
	
	public void unRegister(){
		sub.removeObserver(this);
	}

}
