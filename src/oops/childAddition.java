package oops;

public class childAddition extends Addition {

	public static void main(String[] args) {
		
		Addition dd = new Addition ();
		
		dd.addValues(20, 20);
		dd.addValues(20, 20,34);
		dd.addValues(20, 330);
		
		double op = dd.addValues(11.11, 110.110);
		System.out.println(dd.addValues(11.11, 110.110));
//System.out.println(op);
	}

}
