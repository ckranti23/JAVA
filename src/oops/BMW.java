package oops;

public class BMW extends Car{
	
	BMW(){
		//super();
		System.out.println("Calling BMW constructor");
	}
	
	String name = "BMW";
	
	public void getName() {
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public void run() {
		System.out.println("BMW is running");
		super.run();
	}
	
	
	

	public static void main(String[] args) {
		 
		Car car = new Car();
		System.out.print(car.name);
		car.run();
		System.out.println("**************************************");
		
		BMW bmw = new BMW();
		bmw.run();
		
		bmw.getName();

	}

}
