package pattern.observer.observer;

import pattern.observer.subject.Subject;

public class CurrentWeather implements Observer{

	int temp;
	int humidity;
	Subject sub;
	public CurrentWeather(Subject sub) {
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
		System.out.println("Current Weather has been updated");
		if(temp>28)
			System.out.print("It is Hot");
		else if(temp < 12)
			System.out.print("It is Cold");
		else
			System.out.print("Weather is Pleasant");
		if(humidity>50)
			System.out.println(", It is Humid");
		else
			System.out.println(", It is not Humid");
	}
	
	public void unRegister(){
		sub.removeObserver(this);
	}

}
