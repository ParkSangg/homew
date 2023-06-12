package com.yedam.io;

import java.util.*;
import java.io.*;

// 사원정보 => 파일저장
// 사원번호, 이름, 부서.
class Emp implements Serializable {
	int empNo;
	String empName;
	String dept;

	public Emp(int empNo, String empName, String dept) {
		this.empNo = empNo;
		this.empName = empName;
		this.dept = dept;
	}
}

public class ObjectEx {

	public static void main(String[] args) throws Exception {
		method1();
		method2();
	}

	public static void method1() throws Exception {
		List<Emp> list = new ArrayList<>();
		list.add(new Emp(101, "홍길동", "인사"));
		list.add(new Emp(102, "김길동", "개발"));
		list.add(new Emp(103, "박길동", "총무"));

		FileOutputStream fos = new FileOutputStream("c:/temp/list.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(list);

		oos.close();
		fos.close();
	}

	public static void method2() throws Exception {
		FileInputStream fis = new FileInputStream("c:/temp/list.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		List<Emp> list = (List<Emp>) ois.readObject();
		for(Emp emp : list) {
			System.out.printf("사원번호 : %d 사원이름 : %s 사원부서 : %s\n", emp.empNo,emp.empName,emp.dept);
		}
	}
}
