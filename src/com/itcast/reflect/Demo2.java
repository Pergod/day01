package com.itcast.reflect;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Demo2 {
	
	@Test
	public void test1() throws Exception{
		Class class1=Class.forName("com.itcast.reflect.Person");
		Constructor c=class1.getConstructor(null);
		Person person=(Person)c.newInstance(null);
	}
	
	@Test
	public void test2() throws Exception{
		Class class1=Class.forName("com.itcast.reflect.Person");
		Constructor c=class1.getConstructor(String.class,int.class);
		Person person=(Person)c.newInstance("miki",123);
	}
	
	@Test
	public void test3() throws Exception{
		Class class1=Class.forName("com.itcast.reflect.Person");
		Constructor c=class1.getDeclaredConstructor(List.class);
		//无参构造函数
		Person person1=(Person) class1.newInstance();
		c.setAccessible(true);
		Person person=(Person)c.newInstance(new ArrayList<>());
	}
}
