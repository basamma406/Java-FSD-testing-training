package Day4;
class Parent{
	void care() {
		System.out.println("parents always care children");
	}
}
class Child extends Parent{
	void cute() {
		System.out.println("childens always cute");
	}
}
class Grandchild extends Child{
	void baby() {
		System.out.println("grand child is very cutest baby");
	}
}

public class Multilevel {

	public static void main(String[] args) {
		Grandchild cobj=new Grandchild();
		cobj.care();
		cobj.cute();
		cobj.baby();
		

	}

}
