package com.yedam.list;
import java.util.*;
import java.util.Map.Entry;

import com.yedam.Member;
public class MapEx {

	public static void main(String[] args) {
		Map<String, Integer> map;
		map = new HashMap<String, Integer>();
		
		map.put("홍길동", 90);
		map.put("김길동", 88);
		map.put("박길동", 85);
		map.put("최길동", 80);
		
		//조회
		Integer result = map.get("홍길동");
		System.out.println(result);
		
		Set<String> keys = map.keySet();
		Iterator<String> itr = keys.iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			Integer val = map.get(key);
			System.out.printf("키 : %s, 값 : %d\n", key,val);
		}
		
		//key, value
		Set<Entry<String, Integer>> entry = map.entrySet();
		Iterator<Entry<String, Integer>> iter = entry.iterator();
		while(iter.hasNext()) {
			Entry<String, Integer> ent = iter.next();
			String key = ent.getKey();			//key 반환
			Integer val = ent.getValue();		//val 반환
			System.out.printf("키 : %s, 값 : %d\n ", key,val);
		}
		
		// key : Member, val : Integer.
		Map<Member, Integer> members = new HashMap<>();
		Member member = new Member("user1", "1111");
		members.put(new Member("user1", "1111"), 100);
		members.put(new Member("user2", "2222"), 120);
		members.put(new Member("user1", "1111"), 140);
		
		Integer point = members.get(member);
		System.out.println(point);
		
		//containsKey, containsValue
		Map<String, String> map2 = new HashMap<>();
		map2.put("spring", "11");
		map2.put("summer", "123");
		map2.put("fall", "1234");
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("아이디와 비밀번호 입력");
			System.out.print("아이디 입력");
			String id = sc.nextLine();
			System.out.print("비밀번호 입력");
			String pw = sc.nextLine();
			System.out.println();
			if(map2.containsKey(id)) {
				if(map2.get(id).equals(pw)) {
					System.out.println("로그인완료");
					break;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다");
				}
			} else {
				System.out.println("입력한 아이디가 존재하지 않습니다");
			}
		}
		
	}

}
