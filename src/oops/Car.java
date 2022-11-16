package oops;

public class Car {
	
	
	public final void wheels() {
		System.out.println("Only 4 wheels allowed");
	}
	
	String name = "Car Segment";
	
	public void run() {
		System.out.println("Car is running");
	}
	
	// constructor
	Car(){
		System.out.println("Creating Constructor of car class");
	}

}
