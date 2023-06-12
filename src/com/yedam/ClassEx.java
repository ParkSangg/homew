package com.yedam;
import java.lang.reflect.*;
public class ClassEx {

	public static void main(String[] args) {
		Class cls = Member.class;
		try {
			cls = Class.forName("com.yedam.Member");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(cls.getName());
		
		Method[] methods = cls.getDeclaredMethods();
		for(Method method : methods) {
			System.out.println(method.getName());
		}
	}

}
