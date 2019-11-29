package ex02design.fi;

public class TestAnimal {

	public static void main(String[] args) {
		
		Animal a = new Dog();
		a.eat();
		a.noise();
		((Dog) a).finish();
		
	}

}
