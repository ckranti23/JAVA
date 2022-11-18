package oops;

public class MedicalClass implements Student{
	
	
	public void displayName() {
		System.out.println("Hii, we are from, Medical");
	}
		
		public void getStudentNumber() {
			
			
	System.out.println("We are 30 students");
			
		}
		
		public void getDivison() {
			System.out.println("We are from Dental batch");
		}
		
	
	
		
		public void getUniversity() {
		
			System.out.println("University name is London university");
		}
	
		
		@Override
		public void getInterfaceName() {
			System.out.println("Medical class");
		}
	

	@SuppressWarnings("unused")
	public static void main(String[] args) {
	
		// Student ss = new Student();
		
		EngineeringClass ee = new EngineeringClass();
		
		MedicalClass mm = new MedicalClass();
		
		ee.displayName();
		ee.getStudentNumber();
		ee.getDivison();
		ee.getUniversity();
	
		
		System.out.println("________________________________________________");
		mm.displayName();
		mm.displayName();
		mm.getStudentNumber();
		mm.getDivison();
		mm.getUniversity();
		
	}

}














