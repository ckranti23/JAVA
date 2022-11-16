package oops;

// single inheritance

class Shape{
	public void area() {
		System.out.println("Display are");
	}
}


class Triangle extends Shape{
	
	//String color;
	
	public void area(int l, int h) {
		 
		System.out.println(1/2*l*h);
	}
	
	String color;
	
}


class EquilateralTriangle extends Triangle{
	
	@Override
	public void area(int l, int h) {
		System.out.println(1/2*l*h);
	}
}


public class Inheritance {

	public static void main(String[] args) {
		
		Triangle t1 = new Triangle();
		
		t1.color = "red";
		System.out.println("------------------------------------");
		System.out.println(t1);
		System.out.println(t1.toString());
		
		t1.area(30,40);
		

	}

}
