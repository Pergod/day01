package com.itcast.introsepctor;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import javax.jws.soap.SOAPBinding.Use;

import org.junit.Test;

import com.itcast.reflect.Person;

public class Demo1 {

	//得到所有属性
	@Test
	public void test1() throws Exception{
		BeanInfo info=Introspector.getBeanInfo(User.class);
		PropertyDescriptor[] descriptors=info.getPropertyDescriptors();
		for(int i=0; i< descriptors.length;i++){
			System.out.println(descriptors[i].getName());
		}
		
	}
	
	//操作指定属性
	@Test
	public void test2() throws Exception{
		User user=new User();
		PropertyDescriptor descriptor=new PropertyDescriptor("password", User.class);
		Method method=descriptor.getWriteMethod();
		method.invoke(user, 12);
		System.out.println(user.getPassword());
	}
	
	
	@Test
	public void test3() throws Exception{
		User user=new User();
		PropertyDescriptor descriptor=new PropertyDescriptor("username", User.class);
		Method method=descriptor.getReadMethod();
		method.invoke(user, null);
		System.out.println(user.getUsername());
	}
	
	@Test
	public void test4() throws Exception{
		User user=new User();
		PropertyDescriptor descriptor=new PropertyDescriptor("username", User.class);
		System.out.println(descriptor.getPropertyType().getSimpleName());
	}
}
