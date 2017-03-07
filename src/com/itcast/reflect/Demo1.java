package com.itcast.reflect;

public class Demo1 {
	@SuppressWarnings({ "unused", "rawtypes" })
	public static void main(String[] args) throws ClassNotFoundException {
		
		//1.
		Class class1=Class.forName("com.itcast.reflect.Person");
		
		//2.
		Class class2=new Person().getClass();
		
		//3.
		Class class3=Person.class;
		
	}
}
