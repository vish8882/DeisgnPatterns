package duck;

import duck.behaviour.FlySpeed;
import duck.behaviour.Quack;

public class WhiteDuck extends Duck{
	public WhiteDuck(){
		quackBehaviour = new Quack();
		flyBehaviour = new FlySpeed();
	}

	@Override
	public void display() {
		System.out.println("I am White Duck");
	}
}
