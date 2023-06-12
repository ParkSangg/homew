package com.yedam.list;

import java.util.*;

public class SetEx {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Hello");
		set.add("World");
		set.add("Hello");							//String => hashcode, equals 처리가 되어있음.
		
		Iterator<String> iter = set.iterator();		//반복자 지정.
		while(iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}
		System.out.println("===========");
		for(String str : set) {
			System.out.println(str);
		}
		
		//정수[] 선언. 임의 값을 저장(1~10) : 5개 저장
		int[] numbers = new int[5];
		//중복저장불가
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}

}
