package com.itcast.reflect;

import java.io.InputStream;
import java.util.List;

/*
 * 获取一个类
 */
public class Person {
	
	private String name="aaa";
	private int age=12;
	private static String sex="男";
	
	public Person(){
		System.out.println("empty");
	}
	
	public Person(String name,int password){
		System.out.println(name+password);
	}
	
	private Person(List list){
		System.out.println("en");
	}
	
	public void aa(){
		System.out.println("aa");
	}
	
	public void aa(String name,int password){
		System.out.println(name + ":" +password);
	}
	
	public Class[] aa(String name,int[] password){
		return new Class[] {String.class};
	}
	
	private void aa(InputStream in){
		System.out.println("ok");
	}
	
	public static void aa(int name) {
		System.out.println("haha");
	}
	
	public static void aa(String[] name) {
		System.out.println("xixi");
	}
	
	public static void main(String[] args) {
		
	}
}
