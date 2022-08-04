package duck;

import duck.behaviour.FlyBehaviour;
import duck.behaviour.QuackBehaviour;

public class WhiteDuck extends Duck{
	public WhiteDuck(QuackBehaviour quack, FlyBehaviour fly){
		quackBehaviour= quack;
		flyBehaviour = fly;
	}

	@Override
	public void display() {
		System.out.println("I am White Duck");
	}
}
