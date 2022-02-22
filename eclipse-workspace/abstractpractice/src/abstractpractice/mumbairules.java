package abstractpractice;
abstract class mumbai {
	abstract void speedlimit();
	abstract void rashdriveing();
	abstract void helmet();
	void electricvehical()
	{
		System.out.println("no registration/no helmet");
	}
	void slowspeed()
	{
		System.out.println("no fine for slow driving");
	}
}
class seletos extends mumbai
{
	void speedlimit()
	{
		System.out.println("speed limit is 80");
	}
	
	void rashdriveing() {
			System.out.println("alert tune");
	}
	
	 void helmet()
	 {
		System.out.println("fine id 1000 rupees");
	 }
	 
public static void main (String[] args)
	{
		seletos s=new seletos();
		s.speedlimit();
	    s.rashdriveing();
		s.helmet();
		s.electricvehical();
	
	}

}

