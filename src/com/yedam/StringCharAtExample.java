package com.yedam;

public class StringCharAtExample {
	
	public static void main(String[] args) {
		String str;
		
		str = "C:/temp/images/sample.jpg";
		//파일명(sample)과 확장명(jpg)를 반환
		
		String[] ssn = {"950102-1234567", "960405 2345678", "9703041234567", "0501013456789", "0604014545678","250903-3234567"};
		//각 주민번호를 확인해서 남/여/null 반환. 2023년 기준
		String result = check("0501013456789");
		System.out.println(result);
	}
	public static String check(String str) {
		char sex;
			if(str.length() == 13) {
				sex = str.charAt(6);
				if(sex == '1' || sex == '3') {
					return "남자";					
				} else {
					return "여자";
				}
			}
			if(str.length() == 14){
				sex = str.charAt(7);
				if(sex == '2' || sex == '4') {
					return "여자";					
				} else {
					return "남자";
				}
			}
			return null;
	}

}
