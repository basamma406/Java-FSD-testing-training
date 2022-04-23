package Day5;
interface Shape{
	 void display();
}
class Rectangle implements Shape
{
	Rectangle(){
		System.out.println("the rectangle class is called");
	}

public void display()
{
	System.out.println("this is a rectangle");
}
}
class Triangle implements Shape{
	Triangle(){
		System.out.println("the triangle class is called");
		
	}
	public void display() {
		System.out.println("this is a triangle");
	}
}
 class Testinterface {

	public static void main(String[] args) {
		Shape s=null;
		s=new Rectangle();
		s.display();
		s=new Triangle();
		s.display();

	}

 }
