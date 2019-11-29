package ex03generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Aircraft implements Comparable<Aircraft> {
	private String name;
	private int maxSpeed;

	public Aircraft(String name, int maxSpeed) {
		this.name = name;
		this.maxSpeed = maxSpeed;
	}

	public String getName() {
		return name;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	@Override
	public String toString() {
		return name + ": " + maxSpeed;
	}

	@Override
	public int compareTo(Aircraft a) {
		return maxSpeed - a. maxSpeed;
	}

	public static void main(String[] args) {
		List<Aircraft> aircraft = new ArrayList<>();
		aircraft.add(new Aircraft("Spitfire", 370));
		aircraft.add(new Aircraft("B-17", 287));
		aircraft.add(new Aircraft("Sea Fury", 460));
		aircraft.add(new Aircraft("Mosquito", 356));
		System.out.println(aircraft);	//order they were entered
		Collections.sort(aircraft); 	//sort by speed
		System.out.println(aircraft);
		
		Comparator<Aircraft> byName = new Comparator<Aircraft>(){
			public int compare(Aircraft a1, Aircraft a2){
				return a1.getName().compareTo(a2.getName());
			}
		};
		
		Collections.sort(aircraft, byName); //sort by name again
		System.out.println(aircraft);

//		Using method references
//		Comparator<Aircraft> byMaxSpeed = (a1, a2) -> AircraftHelper.compareByMaxSpeed(a1, a2);
//		Comparator<Aircraft> byMaxSpeed  = AircraftHelper::compareByMaxSpeed;
//		Collections.sort(aircraft, byMaxSpeed); 
//		System.out.println(aircraft);
	}
}
