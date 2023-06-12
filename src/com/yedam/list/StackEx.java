package com.yedam.list;
import java.util.*;
public class StackEx {

	public static void main(String[] args) {
		Stack<String> stacks = new Stack<>();
		stacks.push("사과");
		stacks.push("오렌지");
		stacks.push("배");
		System.out.println(stacks.peek());
		while(!stacks.isEmpty()) {			
			System.out.println(stacks.pop());
		}
	}

}
