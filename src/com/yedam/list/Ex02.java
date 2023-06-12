package com.yedam.list;

import java.util.*;
import java.util.Map.Entry;

public class Ex02 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("user1", 96);
		map.put("user2", 88);
		map.put("user3", 92);

		String name = "";
		int maxScore = 0;
		int totalScore = 0;
		
		Set<String> keys = map.keySet();
		Iterator<String> itr = keys.iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			Integer val = map.get(key);
			totalScore += val;
			if(maxScore < val) {
				maxScore = val;
				name = key;
			}
		}
		
//		Set<Entry<String, Integer>> entrySet = map.entrySet();
//		Iterator<Entry<String, Integer>> entIter = entrySet.iterator();
//		while(entIter.hasNext()) {
//			Entry<String, Integer> result = entIter.next();
//			String key = result.getKey();
//			Integer val = result.getValue();
//		}
		
		System.out.printf("점수합계 : %d\n",totalScore);
		System.out.printf("최고점수 : %d\n",maxScore);
		System.out.printf("최고점수 받은 아이디 : %s\n",name);
		
	}

}
