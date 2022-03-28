package com.gen;
//Program for use of wildcard(?) in Generics. 
/*there are two types of wildcards-1)upper bounded
                                    2)lower bounded*/
import java.util.ArrayList;
import java.util.List;

class kia
{
	private int vehical;

	public kia(int vehical) {
		
		this.vehical = vehical;
	}

	public int getVehical() {
		return vehical;
	}

	@Override
	public String toString() {
		return "kia [vehical=" + vehical + "]";
	}
	
}
class seltos extends kia
{
	private String carmodel;

	public seltos(int vehical, String carmodel) {
		super(vehical);
		this.carmodel = carmodel;
	}

	public String getCarmodel() {
		return carmodel;
	}

	@Override
	public String toString() {
		return "seltos [carmodel=" + carmodel + "]";
	}
		
}
public class App3 {

	public static void disp(List<?>list)            //Here ? is wildcard
	{
		for(Object i:list)
		{
			System.out.println(i);
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<kia>list=new ArrayList<>();
		list.add(new kia(1));
		list.add(new kia(2));
		list.add(new kia(3));
		list.add(new kia(4));
		list.add(new kia(5));
	//	System.out.println(list);
		list.add(new seltos(6,"newcar"));
		list.add(new seltos(7,"morenewcar"));
		disp(list);
		
		

	}

}
