package com.yedam.list;

import java.util.*;

class Emp {
	int empNo;
	String empName;
	int salary;

	Emp(int empNo, String empName, int salary) {
		this.empNo = empNo;
		this.empName = empName;
		this.salary = salary;
	}
}

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Emp> employees = new ArrayList<>();

		System.out.println("ex) 100 홍길동 1000");

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
			employees.add(new Emp(Integer.parseInt(inputs[0]), inputs[1], Integer.parseInt(inputs[2])));
		}
		for(Emp emp : employees) {
			System.out.printf("사번 : %d | 이름 : %s | 급여 : %d\n", emp.empNo,emp.empName,emp.salary);
		}
	}

}
