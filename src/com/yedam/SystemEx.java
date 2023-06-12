package com.yedam;
import java.util.*;
public class SystemEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long stime = System.currentTimeMillis();
		
		while(true) {
			System.out.println("1.출력 2.종료");
			int menu = sc.nextInt();
			if(menu == 1) {
				System.out.println("print");
			} else if(menu == 2) {
				break;
			}
		}
		long etime = System.currentTimeMillis();
		System.out.printf("실행시간 : %d\n", (etime - stime));
	}

}
