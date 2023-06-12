package com.yedam.list;
import java.util.*;
public class CallByEx {

	public static void main(String[] args) {
		// call by value.
		int a = 10;
		method1(a);
		System.out.println(a);
		
		// call by reference
//		Emp emp = new Emp();
//		emp.name = "홍길동";
	}
	public static void method1(int a) {
		a *= a;
	}

}
