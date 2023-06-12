package com.yedam;

public class ObjectEx {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		System.out.println(obj1.equals(obj2));
		
		String str1 = new String("Hello");
		String str2 = new String("World");
		System.out.println(str1.equals(str2));
		
		Member m1 = new Member();
		Member m2 = new Member();
		
		m1.setId("user1");
		m1.setPw("1111");
		m2.setId("user1");
		m2.setPw("2222");
		
		System.out.println(m1.equals(m2));
		
		//toString()		메모리 주소를 불러온다.
		System.out.println(m1.toString());
		System.out.println(m2);
		
		System.out.println(m2.getClass().getName());
	}

}
