package com.yedam.list;
import java.util.*;

class Student {
	int studentNum;
	String name;
	Student(int studentNum, String name){
		this.studentNum = studentNum;
		this.name = name;
	}
	@Override
	public int hashCode() {
//		return super.hashCode();
		return this.studentNum;
	}
	@Override				//중복값은 먼저 있는 값만 살아남음
	public boolean equals(Object obj) {
//		return super.equals(obj);
		if(obj instanceof Student) {
			Student student = (Student) obj;
			if(this.studentNum == student.studentNum) {
				return true;
			}
		}
		return false;
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Set<Student> students = new HashSet<>();
		
		students.add(new Student(1, "홍길동"));
		students.add(new Student(2, "김길동"));
		students.add(new Student(1, "박길동"));
		
		Iterator<Student> iter = students.iterator();
		while(iter.hasNext()) {
			Student result = iter.next();
			System.out.printf("%d : %s\n", result.studentNum, result.name);
		}
	}

}
