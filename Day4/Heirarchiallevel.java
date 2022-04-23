package Day4;

class Colour {

	void  red()
	{
		System.out.println("red is always  girls favorite");
	}
}
	
	class Pink extends Colour{
	
		void dress()
		{
			System.out.println("some girls like pink dress");
		}	
	}
	class Green extends Colour {
		void tree() {
			System.out.println("green tree provides fruits");
		}
	}
	 class Heirarchiallevel{
			public static void main(String[] args) {
				Green obj=new Green();
				obj.red();
				//obj.dress();
				obj.tree();
				}
	}










