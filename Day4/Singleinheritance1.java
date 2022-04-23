package Day4;
class Bird
{
	void fly()
	{
		System.out.println("bird is flying");
	}
}
class Parrot extends Bird
{
	void red()
	{
System.out.println("Parrot nose is red color");
}
}
 class Singleinheritance1 {

	public static void main(String[] args) {
		Parrot coj=new Parrot();
		coj.fly();
		coj.red();
		

	}

}
