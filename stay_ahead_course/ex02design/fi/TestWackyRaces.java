package ex02design.fi;

public class TestWackyRaces {

	public static void main(String[] args) {
		
		WackyRaces fido = new WackyRaces("Fido", new Dog());
		
		WackyRaces dick = new WackyRaces("Dick Dastardly", new Raceable() {
			@Override
			public void race() {
				System.out.println("Cheat but still fail");
			}
		});

		WackyRaces penelope = new WackyRaces("Penelope Pitstop", ()-> System.out.println("Shout 'Heyulp!'"));
		

	}

}
