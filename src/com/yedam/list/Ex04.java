package com.yedam.list;
import java.util.*;
import java.util.Map.Entry;
public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<HashMap<Integer, String>, Integer> map = null;
		
		while (true) {
			String input = sc.nextLine();
			String[] inputs = input.split(" ");
			if (inputs[0].equals("quit")) {
				System.out.println("종료합니다.");
				break;
			}
			if (inputs.length != 3) {
				System.out.println("값을 정확하게 입력해주세요.");
				continue;
			}
			HashMap<Integer, String> key = new HashMap<>();
			key.put(Integer.parseInt(inputs[0]), inputs[1]);
			
			map.put(key, Integer.parseInt(inputs[2]));
		}
		System.out.println("==============");
		Set<HashMap<Integer, String>> keys = map.keySet();
		Iterator<HashMap<Integer, String>> iter = keys.iterator();
		while(iter.hasNext()) {
			HashMap<Integer, String> key = iter.next();
			Integer val = map.get(key);
			Set<Entry<Integer, String>> entry = key.entrySet();
			for(Entry<Integer, String> ent : entry) {				
				System.out.printf("사번 : %d 이름 : %s 급여 : %d\n",ent.getKey(),ent.getValue(),val);
			}
		}
	}

}
