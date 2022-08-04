package duck;


import duck.behaviour.FlyBehaviour;
import duck.behaviour.QuackBehaviour;

public class ToyDuck extends Duck{
	public ToyDuck(QuackBehaviour quack, FlyBehaviour fly){
		quackBehaviour= quack;
		flyBehaviour = fly;
	}

	@Override
	public void display() {
		System.out.println("I am Toy Duck");
	}
}
