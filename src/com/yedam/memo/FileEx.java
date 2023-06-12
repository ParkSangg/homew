package com.yedam.memo;
import java.util.*;
import java.io.*;
public class FileEx {

	public static void main(String[] args) {
		try {
//			FileOutputStream fos = new FileOutputStream("c:/temp/sample.dat");
//			fos.write(10);
//			fos.close();
			InputStream is = new FileInputStream("C:\\dev\\workspace\\20230609\\src\\com\\yedam\\memo\\MemoApp.java");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String str = "";
			while((str = br.readLine()) != null) {				
				System.out.println(str);
			}
			br.close();
			isr.close();
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
