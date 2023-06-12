package com.yedam;

import java.util.*;

public class SetEx {

	public static void main(String[] args) {
		// 1. ArrayList<T>
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("World");
		list.add("Hello");

		for (String str : list) {
			System.out.println(str);
		}

		// Set<T>
		Set<String> set = new HashSet<String>();
		set.add("Hello");
		set.add("World");
		set.add("Hello");
		
		for (String str : set) {
			System.out.println(str);
		}
		
		Set<Member> members	= new HashSet<>();
		members.add(new Member("user1", "1111"));
		members.add(new Member("user2", "2222"));
		members.add(new Member("user1", "1111"));
		
		for (Member member : members) {
			System.out.println(member.getId() + "," + member.getPw());
		}
	}

}
