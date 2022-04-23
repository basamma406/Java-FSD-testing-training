package Day4;
class Bank{
	void rate()
	{
		System.out.println("SBI Rate of Interest");
	}
}
class SBI extends Bank
{ 
	void rate()
	{
	System.out.println("ICICI Rate of interest");
	}
	
}
class ICICI extends Bank
{
	void rate()
	{
	System.out.println("Axis Rate of Interest");
	}
}
	
	class AXIS extends Bank
	{
		void rate()
		{
		System.out.println("IDFC Rate of interest");
		}
	}
class Polymorphism1 {

	public static void main(String[] args) {
		Bank s=null;
		s=new Bank();
		s.rate();
		s=new SBI ();
		s.rate();
		s=new ICICI();
		s.rate();
		s=new AXIS();
		s.rate();
	}
}


