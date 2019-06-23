package pattern.observer.observer;

import pattern.observer.subject.Subject;

public class HeatIndexDisplay implements Observer {
	int temp;
	int humidity;
	Subject sub;
	
	public HeatIndexDisplay(Subject sub){
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
		System.out.println("HeatIndex is :"+ (temp+humidity)/2);
	}
	
	public void unRegister(){
		sub.removeObserver(this);
	}

}
