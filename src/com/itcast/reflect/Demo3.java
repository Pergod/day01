package com.itcast.reflect;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

public class Demo3 {
	
	@Test
	public void test1() throws Exception{
		Person person=new Person();
		Class class1=Class.forName("com.itcast.reflect.Person");
		Method m1=class1.getMethod("aa", null);
		m1.invoke(person, null);
	}
	
	@Test
	public void test2() throws Exception{
		Person person=new Person();
		Class class1=Class.forName("com.itcast.reflect.Person");
		Method m1=class1.getMethod("aa", String.class,int.class);
		m1.invoke(person, "sha",12);
	}
	
	@Test
	public void test3() throws Exception{
		Person person=new Person();
		Class class1=Class.forName("com.itcast.reflect.Person");
		Method m1=class1.getMethod("aa",  String.class,int[].class);
		Class[] classes=(Class[]) m1.invoke(person, "mm",new int[]{1,2,3});
		System.out.println(classes[0].getSimpleName());
	}
	
	@Test
	public void test4() throws Exception{
		Person person=new Person();
		Class class1=Class.forName("com.itcast.reflect.Person");
		Method m1=class1.getDeclaredMethod("aa",  InputStream.class);
		m1.setAccessible(true);
		m1.invoke(person, new FileInputStream(new File("c:\\1.txt")));
	}
	
	@Test
	public void test5() throws Exception{
		Class class1=Class.forName("com.itcast.reflect.Person");
		Method m1=class1.getMethod("aa", int.class);
		m1.invoke(null, 11);
	}
	
	@Test
	public void test6() throws Exception{
		String[] strings={"1","2","3"};
		Class class1=Class.forName("com.itcast.reflect.Person");
		Method m1=class1.getMethod("aa", String[].class);
		//兼容性
		m1.invoke(null, new Object[]{ new String[]{"1"}});
	}
	
	//反射main
	@Test
	public void test7() throws Exception{
		String[] strings={"1","2","3"};
		Class class1=Class.forName("com.itcast.reflect.Person");
		Method m1=class1.getMethod("main", String[].class);
		//兼容性
		m1.invoke(null, (Object)new String[]{"1"});
	}
}
