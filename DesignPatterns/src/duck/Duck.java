package duck;

import duck.behaviour.FlyBehaviour;
import duck.behaviour.QuackBehaviour;

public abstract class Duck {

	FlyBehaviour flyBehaviour;
	QuackBehaviour quackBehaviour;
	public Duck(){
		
	}
	public abstract void display();
	public void swim(){
		System.out.println("The duck is swimming");
	}
	
	public void performQuack(){
		quackBehaviour.quack();
	}
	
	public void performFly(){
		flyBehaviour.fly();
	}
}
