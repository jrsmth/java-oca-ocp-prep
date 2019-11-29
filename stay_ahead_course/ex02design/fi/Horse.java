package ex02design.fi;

public class Horse extends Herbivore implements Raceable {


	@Override
	public void noise() {
		System.out.println("Neigh!");
	}

	@Override
	public void race() {
		System.out.println("Gallop round the track");
	}

}
