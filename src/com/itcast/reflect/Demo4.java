package com.itcast.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

public class Demo4 {
	@Test
	public void test2() throws Exception{
		Class class1=Class.forName("com.itcast.reflect.Person");
		Field field=class1.getDeclaredField("name");
		field.setAccessible(true);
		System.out.println(field.getType().getSimpleName());
		String name=(String) field.get(new Person());
//		field.set(obj, value);
		System.out.println(name);
	}
}
