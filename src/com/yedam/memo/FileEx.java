package com.yedam.memo;
import java.util.*;
import java.io.*;
public class FileEx {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("c:/temp/sample.dat");
			fos.write(10);
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
