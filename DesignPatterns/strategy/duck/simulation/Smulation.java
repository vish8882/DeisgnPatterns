package duck.simulation;

import duck.Duck;
import duck.ToyDuck;
import duck.WhiteDuck;
import duck.behaviour.FlySpeed;
import duck.behaviour.NoFLy;
import duck.behaviour.Quack;
import duck.behaviour.Squeak;

public class Smulation {

	public static void main(String[] args) {
		Duck duck = new WhiteDuck(new Quack(), new FlySpeed());
		duck.display();
		duck.swim();
		duck.performFly();
		duck.performQuack();
		
		Duck duck2 = new ToyDuck(new Squeak(), new NoFLy());
		duck2.display();
		duck2.swim();
		duck2.performFly();
		duck2.performQuack();
	}

}
