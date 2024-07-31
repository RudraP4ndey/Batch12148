package July15;
interface M1{
	
	  void Op(int i,int j) ;
	 default void info() {
	  System.err.println("This is default method");
	 }
	 }


	public class Test4 {

	 public static void main(String[] args) {
		
	 M1 m=(a,b)->System.out.println(a+b);
	 m.Op(5, 2);
	 M1 mm=(a,b)->System.out.println(a-b);
	 mm.Op(5, 2);
		
	 M1 mmm=(a,b)->System.out.println(a*b);
	 mmm.Op(5, 2);
	 M1 mmmm=(a,b)->System.out.println(a/b);
	 mmmm.Op(5, 2);
	  m.info();

	 }

	}