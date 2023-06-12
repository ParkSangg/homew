package com.yedam.io;

import java.io.*;
import java.util.*;

public class StudentEx {

	public static void main(String[] args) throws IOException {
		// c:/temp/students.txt 학생의 점수의 평균
		// 최고점수의 학생이름과 최고점수 출력
		method1();
		method2();
	}

	public static void method2() throws IOException {
		InputStream is = new FileInputStream("c:/temp/student.txt");
		InputStreamReader isr = new InputStreamReader(is); // 바이트 => char 로 변경
		char[] buf = new char[200];
		isr.read(buf);
		int sum = 0,  cnt = 0;
		int maxScore = 0;
		double avg = 0;
		String name = "";
		
		String str = new String(buf);
//		System.out.println(str);
		String[] strAry = str.split("\r\n");
		for(String student : strAry) {
			String [] std = student.split(" ");
			if(student != null) {
				System.out.printf("학생번호 %s 이름 %s 점수 %s \n", std[0], std[1],std[2]);
			}
			if(maxScore < Integer.parseInt(std[2])) {
			   maxScore = Integer.parseInt(std[2]);
			   name = std[1];
			}
			sum+=Integer.parseInt(std[2]);
			cnt++;
		}
		avg = (double) sum / cnt;
		System.out.printf("평균점수 : %.2f ", avg);
		System.out.printf("최고점수 : %d, 학생이름 : %s\n", maxScore, name);
		isr.close();
	}

	private static String parseInt(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void method1() throws IOException {
		Scanner sc = new Scanner(new File("c:/temp/student.txt"));
		String name = "";
		int sum = 0, maxScore = 0, cnt = 0;
		double avg = 0;
		while (true) {
			String values = "";

			try {
				values = sc.nextLine();
			} catch (NoSuchElementException e) {
				break;
			}
			String[] valAry = values.split(" ");
			sum += Integer.parseInt(valAry[2]);
			cnt++;
			if (maxScore < Integer.parseInt(valAry[2])) {
				maxScore = Integer.parseInt(valAry[2]);
				name = valAry[1];
			}
		}
		avg = ((double) sum / cnt);
		System.out.printf("평균점수 : %.2f ", avg);
		System.out.printf("최고점수 : %d, 학생이름 : %s\n", maxScore, name);
	}
}
