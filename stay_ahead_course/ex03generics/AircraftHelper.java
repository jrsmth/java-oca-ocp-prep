package ex03generics;

public class AircraftHelper {
	public static int compareByMaxSpeed(Aircraft a1, Aircraft a2) {
		return a1.getMaxSpeed() - a2.getMaxSpeed();
	}

	public static int compareByName(Aircraft a1, Aircraft a2) {
		return a1.getName().compareTo(a2.getName());
	}
	
}
