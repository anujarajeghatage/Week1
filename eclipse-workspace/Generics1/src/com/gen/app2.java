package com.gen;

//This program shows reusiblity of code (here all the output is printed by single method )
//advantage of generics is reusiblity of code(here code to display is reused).


import java.util.ArrayList;
import java.util.List;

class data3
{
	public<E>void printlistdata(List<E>dispdata)//here dispdata is just for printing
	{
		for(E i:dispdata)
		{
			System.out.println(i);
		}
	}
	public<E>void printarraylist()                  //dimond operator before method convers method to generic method
	{
		
	}
}
public class app2 {

	public static void main(String[] args) {                     
		List<Integer> ob= new ArrayList<>();                    //here we see reusiblity of code
		//to print integer 
        ob.add(1);
        ob.add(2);
        ob.add(3);
        ob.add(4);
        data3 data= new data3();
        data.printlistdata(ob);
        
        //to print string
        List<String> ob1= new ArrayList<>();
        ob1.add("hello");
        ob1.add("batch");
        ob1.add("mumbai");
        ob1.add("welcome");
        
        data.printlistdata(ob1);
        
        //to print double
        List<Double> ob2= new ArrayList<>();
        ob2.add(1.11);
        ob2.add(2.22);
        ob2.add(3.33);
        ob2.add(4.44);
        
        data.printlistdata(ob2);
        
        
	}

}
