package ex02design.fi;

public interface Raceable {

	void race();
	
	public default void finish() {
		System.out.println("Cross the line");
	}
	
	public default void start() {
		System.out.println("Wait for the starting gun");
	}
}
