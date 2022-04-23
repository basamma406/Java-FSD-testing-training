package Day6;

abstract class Flower
{
	Flower(){
		System.out.println("flower class is called");
	}
	void color() {
		System.out.println("flower is beautiful");
	}
	abstract void display();
}
class Rose extends Flower
{
void color() {
	System.out.println("rose is red color");
}
void display()
{
	System.out.println("girls always like red rose");
	}
}
class Lotus extends Flower
{
void color() {
	System.out.println("lotus is the national flower");
}
void display()
{
	System.out.println("it is a scared flower");
	}
}
public class Abstractionassign {

	public static void main(String[] args) {
		Flower obj=new Rose();
		
		obj.color();
		obj.display();
		
		
	}

}
