package com.yedam.io;

import java.io.*;
import java.util.*;

public class ScannerEx {
	//파일내용불러오기.
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("c:/temp/sample.txt"));

		while (true) {
			try {
				String input = sc.nextLine();
				System.out.println(input);
				if (input.equals("")) {
					break;
				}
			} catch (NoSuchElementException e) {
				break;
			}
		}
		System.out.println("end");
	}

}
