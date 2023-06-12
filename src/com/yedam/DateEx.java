package com.yedam;
import java.util.*;
import java.text.*;
public class DateEx {

	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today.getDate()); 	//getDate() => 1970년 1월1일 기준
		//현재기준으로 보면 53년 6월 9일 * 24*60*60
		
		long curr = 1686283263319L / (24 * 60 * 60 * 1000);
		
		System.out.println(today.toString());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		String result = sdf.format(today);
		
		result = "2022/01/01 13:20:22";
		try {
			Date resultDate = sdf.parse(result);
			System.out.println(resultDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		result = dateToStr(today, "yyyy/MM/dd");
		System.out.println(result);
	}
	public static String dateToStr(Date date, String pattern) {
		return null;
	}

}
