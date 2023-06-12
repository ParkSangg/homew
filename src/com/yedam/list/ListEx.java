package com.yedam.list;
import java.util.*;
public class ListEx {

	public static void main(String[] args) {
		List<String> strList;
		strList = new ArrayList<String>();
		strList.add("Hello");
		strList.add("World");
		strList.add(0,"Good");
		for(int i = 0; i < strList.size(); i++) {			
			System.out.println(strList.get(i));
		}
		
		System.out.println("==================");
		strList.set(0, "Nice");
		strList.remove(0);
		strList.clear();
		for(String word : strList) {
			System.out.println(word);
		}
		
		long start = System.currentTimeMillis();
		strList = new ArrayList<>();
		for(int i = 0; i < 1000000; i++) {
			strList.add("i" + i);
		}
		long end = System.currentTimeMillis();
		System.out.printf("ArrayList걸린시간 %d\n",(end - start));
		
		
		start = System.currentTimeMillis();
		strList = new LinkedList<String>();
		for(int i = 0; i < 1000000; i++) {
			strList.add("i" + i);
		}
		end = System.currentTimeMillis();
		System.out.printf("ArrayList걸린시간 %d\n",(end - start));
	}

}
