package com.gen;
//bounded boundary program
//it provides security as it put boundry to datatypes
//Generics also make use of inheritance


class data<k extends Integer,V extends String>
{
	private k key;
	private V value;
	
	public data(k key, V value) {
		 
		this.key = key;
		this.value = value;
	}
	
	public k getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "data [key=" + key + ", value=" + value + "]";
	}
	public <E extends String,N extends Number> void display(E element,N number)       //here if we put boundry in dimondthen does not extends the limit
	{
		System.out.println("element"+element+"key"+key);
	}
	
	
}
public class app1 {

	public static void main(String[] args) {
	     data <Integer,String>ob=new data<Integer,String>(1,"abz");   //here i cannot change the datatype as it is extendeds
	     System.out.println("key is "+ob.getKey() +" "+"value is "+ob.getValue());

	     
	     ob.display("anuja",1);                                                          //printing for method display & boundry of line 25 should match print statement
	}

}
