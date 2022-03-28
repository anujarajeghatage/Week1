package com.generics1;

/*Types in gererics are 
 * T=type
 * N=number
 * E=element
 * K=key
 * V=value
 */
 
class App<K,V>
 //key =K & v=value
 {
	 private K key;
	 private V value;
	public App(K key, V value)    //here K is key and V is value
	{
	
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	@Override
	public String toString() {
		return "App [key=" + key + ", value=" + value + "]";
	}
	public <E,N> void display(E element,N number)
	
	{
	System.out.println("element"+element+"number"+number);	
	}
	
	 
 }

public class data2 {

	public static void main(String[] args)
	{
	App<Integer,String>obj= new App<Integer,String>(1,"anuja");
	System.out.println("key is" +obj.getKey() +"value is"+ obj.getValue());
    obj.display("2.00",55);
	}

}
