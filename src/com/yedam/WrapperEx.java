package com.yedam;

public class WrapperEx {

	public static void main(String[] args) {
		Integer i1 = new Integer(100);
		int n1 = i1;			//객체 -> 기본타입 : 언박싱
		i1 = 100;				//기본타입 -> 객체 : 박싱
		n1 = 50;
		Integer result = i1 + n1;
		
		n1 = Integer.parseInt("100"); 
		
		byte b1 = Byte.parseByte("120");
		System.out.println(b1);
		
		Byte b2 = Byte.valueOf("10");	//new Byte(2);
		b2.byteValue();					//객체 -> 기본
		
		Short s1 = Short.valueOf("100");
		short s2 = s1.shortValue();
		
		//포장객체의 값 비교
		Integer w1 = Integer.valueOf("100");
		Integer w2 = Integer.valueOf("100");
		
		//객체의 값을 비교하지말고 -> 기본타입으로 변경해서 그 값을 비교
		System.out.println(w1.intValue() == w2.intValue());
		System.out.println(w1.equals(w2));
		
	}

}
