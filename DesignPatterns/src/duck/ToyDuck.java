package duck;


import duck.behaviour.NoFLy;
import duck.behaviour.Squeak;

public class ToyDuck extends Duck{
	public ToyDuck(){
		quackBehaviour= new Squeak();
		flyBehaviour = new NoFLy();
	}

	@Override
	public void display() {
		System.out.println("I am Toy Duck");
	}
}
