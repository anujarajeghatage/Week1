package com.generics1;

import java.util.LinkedList;
import java.util.List;
//<alphabate>shows generic class
//<>this is dimond operator
//for generic class constructor-getter-tostring is compulsory
//it eleminits type casting
class app<a>
{
	private a myvariable;

	public app(a myvariable) {
	
		this.myvariable = myvariable;
	}

	public a getMyvariable() {
		return myvariable;
	}

	@Override
	public String toString() {
		return "app [myvariable=" + myvariable + "]";
	}
	
	
}

public class data {

	public static void main(String[] args)
	{	
		//you will not get any error as it automatic type casts
    List<app<Object>>obj=new LinkedList<>();
     obj.add(new app<Object>("hello"));
     obj.add(new app<Object>(1));
     obj.add(new app<Object>(0.000));
     System.out.println(obj);
     //to add all same datatype you can directly replace objeect with string or respective datatype
    
     /*List<app<String>>obj=new LinkedList<>();
     obj.add(new app<String>("hello"));
     obj.add(new app<String>("hello1"));
     obj.add(new app<String>("hello4"));
     System.out.println(obj);
	}*/

	}
}
