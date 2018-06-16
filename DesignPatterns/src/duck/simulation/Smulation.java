package duck.simulation;

import duck.Duck;
import duck.ToyDuck;
import duck.WhiteDuck;

public class Smulation {

	public static void main(String[] args) {
		Duck duck = new WhiteDuck();
		duck.display();
		duck.swim();
		duck.performFly();
		duck.performQuack();
		
		Duck duck2 = new ToyDuck();
		duck2.display();
		duck2.swim();
		duck2.performFly();
		duck2.performQuack();
	}

}
