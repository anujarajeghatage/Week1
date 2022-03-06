//PROGRAM IS EXAMPLE OF  ABSTRACTION+MULTIPLE INHERITANCE
package interfaceprograming;

interface worldbank
{
	float rateofintrest();//ABSTRACTION
}
 interface RBI
{
      float RBIrateofintrest();//ABSTRACTION
}

//implements id used to connect interface to class.
 
public class example1 implements RBI,worldbank//MULTIPLE INHERITANCE
  {
        public float rateofintrest()
        {
		return 9.3f;
	}
        public float RBIrateofintrest() 
        {
        	return 7.5f;
        }

	public static void main(String[] args) {
	worldbank a=new example1();
	RBI a2=new example1();
		System.out.println("Rate of intrest of world bank is"+a.rateofintrest());
		System.out.println("RBI rate of intrest is is"+a2.RBIrateofintrest());
	}
	

}
