package Day5;
abstract class Bike
{
	Bike(){
		System.out.println("bike class is invoke");
	}
	void run() {
		System.out.println("bike is running");
	}
	abstract void display();
}
class Suzuki extends Bike
{
void run() {
	System.out.println("suzuki is running");
}
void display()
{
	System.out.println("Suzuki is a top tier bike");
	}
}

public class Testabstract1 {

	public static void main(String[] args) {
		Bike obj=new Suzuki();
		obj.run();
		obj.display();
		
	}

}
