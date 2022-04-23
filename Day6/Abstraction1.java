package Day6;

interface formula{
	 void display();
}
class Eclipse implements formula
{
	Eclipse(){
		System.out.println("the Eclipse formula is ");
	}

public void display()
{
	System.out.println("eclipse :pi*a*b");
}
}
class Rapizoid implements formula{
	Rapizoid(){
		System.out.println("the Rapizoid formula is");
		
	}
	public void display() {
		System.out.println("Rapizoid :.5*(a+b)*b");
	}
}
class Square implements formula{
	Square(){
		System.out.println("the Square formula is");
		
	}
	public void display() {
		System.out.println("square :b*b");
	}
}
public class Abstraction1 {

	public static void main(String[] args) {
		formula s=null;
		s=new Eclipse ();
		s.display();
		s=new Rapizoid();
		s.display();
        s=new Square();
        s.display();
		
	}

}
