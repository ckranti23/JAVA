package oops;

public class EngineeringClass implements Student {
	
public void displayName() {
	System.out.println("Hii, we are from, Engineering");
}
	
	public void getStudentNumber() {
		
		
System.out.println("We are 230 students");
		
	}
	
	public void getDivison() {
		System.out.println("We are from D batch");
	}
	
	
	public void getUniversity() {
		//with interface we can create reference
		// with interface we can't create the obj
//	Student ss = new Student();
		System.out.println("University name is : " + Student.college);
	}
	
	
	@Override
	public void getInterfaceName() {
		System.out.println("Engineering class");
	}

}
