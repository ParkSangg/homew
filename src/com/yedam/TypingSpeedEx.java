package com.yedam;

import java.util.*;

public class TypingSpeedEx {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		String userInput = "";

		String origin = "In the meantime, I felt at least 40 more of these creatures following the first.";
		origin = "";
		String[] origAry = origin.split(" ");
		// 문장 출력 => 입력 : felt => 문장 출력 => 입력 : meantime, .. 문장을 다 제거할때까지 계속 작업
		// 완료 : 완료메세지 출력 후 --- 실행했던 시간 => 80 - 1분 20초라고 표시.
		// 반복 1.문장출력 2.입력 값==문장 제거 3.완료체크 => 반복완료
		while (run) {
			if(!checkAry(origAry)) {
				break;
			}
			System.out.println(arrayToString(origAry));
			System.out.print("입력 >>");
			userInput = sc.nextLine();
			boolean isLeft = true;
			for (int i = 0; i < origAry.length; i++) {
				if (origAry[i] != null && origAry[i].equals(userInput)) {
					origAry[i] = null;
					break;
				}
			}
		}
		long end = System.currentTimeMillis();
		System.out.printf("완료. 시간 : %s\n", checkDuration(start, end));
	}
	public static boolean checkAry(String[] ary) {
		boolean isLeft = false;
		for(String word : ary) {
			if(word != null) {				
				isLeft = true;
				break;
			}
		}
		return isLeft;
	}
	public static String checkDuration(long start, long end) {
		long duration = (end - start) / 1000;
		long mm = duration / 60;
		long ss = duration % 60;
		return mm + "분" + ss + "초";
	}

	public static String arrayToString(String[] strAry) {
		String result = "";
		for (String str : strAry) {
			if (str != null) {
				result += str + " ";
			}
		}
		return result;
	}
}
