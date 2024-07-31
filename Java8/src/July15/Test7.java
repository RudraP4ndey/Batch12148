package July15;
interface Medical{
	 void history();
	 default void phistory() {
	  System.out.println("Patient history");
	 }
	 default void lab() {
	  System.out.println("Multiple labs");
	 }
	 default void address() {
	  System.out.println("Hospital is in Dadar");
	 }
	}
	public class Test7 {

	 public static void main(String[] args) {
	  
	  
	  Medical m1=()->System.out.println("Medical History");
	  
	  m1.history();

	  m1.address();
	  m1.lab();
	  m1.phistory();
	 }

	}