package Day9;

class ThisExmp
{
	int sum;
	ThisExmp(int example)
	{
		this.sum=example;
	}
	void display()
	{
		System.out.println("sum="+sum);
	}
	public static void main(String[] args)
	{
		ThisExmp obj=new ThisExmp(500);
		obj.display();
		ThisExmp two=new ThisExmp(750);
		two.display();

	}


}
