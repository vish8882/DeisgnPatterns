package pattern.observer.test;

import java.util.Scanner;

import pattern.observer.observer.CurrentCondition;
import pattern.observer.observer.CurrentWeather;
import pattern.observer.observer.HeatIndexDisplay;
import pattern.observer.observer.Observer;
import pattern.observer.subject.Subject;
import pattern.observer.subject.WeatherObject;

public class ObserverPatternTest {
	public static void main(String[] args) {
		WeatherObject sub1 = new WeatherObject();
		CurrentCondition ob1 = new CurrentCondition(sub1);
		CurrentWeather ob2 = new CurrentWeather(sub1);
		HeatIndexDisplay ob3 = new HeatIndexDisplay(sub1);
		String update=null;
		Scanner s = new Scanner(System.in);
		do{
			System.out.print("Enter change in temperature: ");
			int temp = s.nextInt();
			System.out.print("Enter change in humidity: ");
			int humidity = s.nextInt();
			sub1.setMeasureMents(temp, humidity);
			System.out.print("Do you want to update again: ");
			update = s.next();
		}
		while(update.equals("Y"));
		ob1.unRegister();
		System.out.print("Enter change in temperature: ");
		int temp = s.nextInt();
		System.out.print("Enter change in humidity: ");
		int humidity = s.nextInt();
		sub1.setMeasureMents(temp, humidity);
		
	}
}
