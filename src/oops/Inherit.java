package oops;

class Base{
	int x;
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		System.out.println("i am in base setting X ");
		this.x = x;
	}
	
	public void printMe() {
		System.out.println("Hello Team");
	}
}

class Derived extends Base{
	int y=12;
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		System.out.println("i am in base setting Y ");
		this.y = y;
	}
	
	
	public void printMe() {
		System.out.println("Hello Team QA");
	}
	
	
}



public class Inherit {

	public static void main(String[] args) {
		
		Base bb = new Base();
		bb.setX(39);
		System.out.println(bb.getX());
		
		
		//bb.printMe();
		
		
		Derived dd = new Derived();
		dd.printMe();
	
	}

}
