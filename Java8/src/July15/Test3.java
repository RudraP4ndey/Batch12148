package July15;
interface Vehicle{
	void speed(int i);
}
class Bike{
	Bike(int speed){
		System.out.println("Bike Speed : c"+speed);
	}
}
public class Test3 {
	

	public static void main(String[] args) {
		Vehicle v = Bike::new;
		v.speed(40);
	}

}
