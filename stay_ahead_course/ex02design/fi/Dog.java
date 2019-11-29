package ex02design.fi;

public class Dog extends Carnivore implements Raceable {

	@Override
	public void noise() {
		System.out.println("Woof woof!");
	}

	@Override
	public void race() {
		System.out.println("Chase the bunny");
	}

}
