package finalkey;

public class finalkeyword {
	final int adhar=123;
	//here method is declare final that means it cannot be changed
	//you can see but can't modify it
	final void name()
	{
		System.out.println("NAme is anuja");
	}
	void display()
	{
		System.out.println("name is taniya");
	
	}
	public class main2 extends finalkeyword
	{
		void display()
		{
			System.out.println("heloo");	
		}	

	public static void main(String[] args) {
	finalkeyword obj=new finalkeyword();
	obj.name();
	
		
		

	}

}
}
